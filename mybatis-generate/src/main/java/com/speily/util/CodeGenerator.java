package com.speily.util;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * @Auther: SPL
 * @Date: 2019-08-30 17:42
 * @Description: - 代码生成
 */
public class CodeGenerator {

    //输出目录
    private static String outputDir = "D:\\MybatisGenerate";

    private static String tempBasePath = "/templates/gen-template";

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
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


        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://47.94.165.79:3306/db_crm?useUnicode=true&useSSL=false&characterEncoding=utf8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("speily441123");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(scanner("模块名"));
        pc.setParent("com.speily");
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

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
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
