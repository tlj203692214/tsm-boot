package com.tsm.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.incrementer.OracleKeyGenerator;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Calendar;

/***
 * @author 大熊
 * @date 2020-07-03
 * @Description:跨域配置类
 * @version 1.0
 */
@Configuration
//@EnableTransactionManagement
@Slf4j
public class staffConfig {
    private CorsConfiguration buildConfig() {
        log.debug("开始设置");
        CorsConfiguration appCorsConfiguration = new CorsConfiguration();
        appCorsConfiguration.addAllowedOrigin("http://localhost:3003");
        appCorsConfiguration.addAllowedOrigin("http://127.0.0.1:3003");
        appCorsConfiguration.addAllowedHeader("*"); // 2允许任何头
        appCorsConfiguration.addAllowedMethod("OPTIONS");
        appCorsConfiguration.addAllowedMethod("HEAD");
        appCorsConfiguration.addAllowedMethod("GET");
        appCorsConfiguration.addAllowedMethod("PUT");
        appCorsConfiguration.addAllowedMethod("POST");
        appCorsConfiguration.addAllowedMethod("DELETE");
        appCorsConfiguration.addAllowedMethod("PATCH");
        appCorsConfiguration.setAllowCredentials(true);//这两句不加不能跨域上传文件，
        appCorsConfiguration.setMaxAge(3600L);//加上去就可
        return appCorsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig()); // 4
        return new CorsFilter(source);
    }

    // 最新版
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.ORACLE));
        return interceptor;
}
    /**
     * 序列生成器
     */
    @Bean
    public OracleKeyGenerator oracleKeyGenerator(){
        return new OracleKeyGenerator();
    }




}