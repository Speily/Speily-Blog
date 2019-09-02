package com.speily.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @Auther: SPL
 * @Date: 2019-08-30 17:42
 * @Description: - 代码生成
 */
public class CodeGenerator {

    //输出目录
    private static String outputDir = "D:\\MybatisGenerate";

    private static String tempBasePath = "/templates/gen-template";

    //数据库配置四要素
    private static String driverName = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://47.94.165.79:3306/spl_blog?useSSL=false&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true";
    private static String username = "root";
    private static String password = "speily441123";

    //基本包名
    private static String basePackage="com.speily";

    //要生成的表名
    private static String[] tables= {"user"};


    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        //1、 数据源配置
        DataSourceConfig db = new DataSourceConfig();
        db.setDriverName(driverName);
        db.setUsername(username);
        db.setPassword(password);
        db.setUrl(url);
        mpg.setDataSource(db);

        //2、 全局配置
        GlobalConfig gc = new GlobalConfig();
//        String projectPath = System.getProperty("user.dir");
//        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setOutputDir(outputDir);
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setAuthor("Speily");
        //自定义文件命名
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        //3、 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(basePackage);
        pc.setModuleName(null);  //所属模块
//        pc.setController("");
//        pc.setEntity("");
//        pc.setService("");
//        pc.setServiceImpl("");
//        pc.setMapper("");
//        pc.setXml("");
        mpg.setPackageInfo(pc);

        /*// 配置模板
        TemplateConfig templateConfig = new TemplateConfig();
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        templateConfig.setController(tempBasePath+ "/controller.java");
        templateConfig.setEntity(tempBasePath+ "/entity.java");
        templateConfig.setService(tempBasePath+ "/service.java");
        templateConfig.setServiceImpl(tempBasePath+ "/serviceImpl.java");
        templateConfig.setMapper(tempBasePath+ "/mapper.java");
        templateConfig.setXml(tempBasePath+ "/mapper.xml");

        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);*/

        //4、生成策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude(tables); // 需要生成的表
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        // 公共父类
//        strategy.setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
        strategy.setSuperControllerClass("com.speily.commons.BaseController");
        mpg.setStrategy(strategy);
        mpg.execute();
    }
}
