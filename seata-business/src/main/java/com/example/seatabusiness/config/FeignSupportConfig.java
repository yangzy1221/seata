//package com.example.seatabusiness.config;
//
//import feign.codec.Encoder;
//import feign.form.spring.SpringFormEncoder;
//import org.springframework.beans.factory.ObjectFactory;
//import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
//import org.springframework.cloud.openfeign.support.SpringEncoder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Scope;
//
///**
// * @author yzy
// * @date 2022年09月29日 16:03
// */
//@Configuration
//public class FeignSupportConfig {
////    @Bean
////    @Primary
////    @Scope("prototype")
////    public Encoder multipartFormEncoder() {
////        return new SpringFormEncoder();
////    }
//
//
//    @Bean
//    Encoder feignFormEncoder(ObjectFactory<HttpMessageConverters> converters) {
//        return new SpringFormEncoder(new SpringEncoder(converters));
//    }
//}
