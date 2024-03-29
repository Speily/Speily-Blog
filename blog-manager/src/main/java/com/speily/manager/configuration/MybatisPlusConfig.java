package com.speily.manager.configuration;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: SPL
 * @Date: 2019-09-12 9:43
 * @Description: - mybatis-plus更多配置
 */
@Configuration
@MapperScan("com.speily.dao")
public class MybatisPlusConfig {

    /*
    * 分页插件，自动识别数据库类型
    * 多租户，请参考官网【插件扩展】
    */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
