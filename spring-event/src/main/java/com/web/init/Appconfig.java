package com.web.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.JsonbHttpMessageConverter;

import java.io.IOException;
import java.util.List;

/**
 * @author 王
 * @version 1.0
 * @create 2020/3/2 10:14
 */
@Configuration
@ComponentScan("com.web")
public class Appconfig {

//	@Bean
//	public HttpMessageConverter httpMessageConverter(List<HttpMessageConverter> messageConverters){
//		return new HttpMessageConverters(new JsonbHttpMessageConverter());
//
//	}
}
