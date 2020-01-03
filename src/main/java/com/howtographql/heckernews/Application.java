package com.howtographql.heckernews;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    private static Class<Application> applicationClass = Application.class;

    public static void main(String[] args) {
            SpringApplication.run(applicationClass, args);
        }

        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

            return application.sources(applicationClass);
        }

/*
*
@Configuration
@SpringBootApplication(
        scanBasePackages = "org.ddg",
        exclude = {DataSourceAutoConfiguration.class,
                HibernateJpaAutoConfiguration.class,
                DataSourceTransactionManagerAutoConfiguration.class})
@ComponentScan("org.ddg")
@EnableTransactionManagement
public class Application extends SpringBootServletInitializer {

    private static Class<Application> applicationClass = Application.class;

    public static void main(String[] args) {
        SpringApplication.run(applicationClass, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        return application.sources(applicationClass);
    }

//    @PostConstruct
//    public void init(){
//        TimeZone tz = TimeZone.getTimeZone("UTC");
//        TimeZone.setDefault(tz);
//    }


    @Bean
    public HttpMessageConverters additionalConverters() {
        return new HttpMessageConverters(bufferedImageHttpMessageConverter());
    }


    @Bean
    public BufferedImageHttpMessageConverter bufferedImageHttpMessageConverter() {
        BufferedImageHttpMessageConverter bufferedImageHttpMessageConverter = new BufferedImageHttpMessageConverter();
        return bufferedImageHttpMessageConverter;
    }

//    @Bean
//    public ByteArrayHttpMessageConverter byteArrayHttpMessageConverter() {
//        ByteArrayHttpMessageConverter arrayHttpMessageConverter = new ByteArrayHttpMessageConverter();
//        arrayHttpMessageConverter.setSupportedMediaTypes(getSupportedMediaTypes());
//        return arrayHttpMessageConverter;
//    }
//
//    private List<MediaType> getSupportedMediaTypes() {
//        List<MediaType> list = new ArrayList<>();
//        list.add(MediaType.IMAGE_JPEG);
//        list.add(MediaType.IMAGE_PNG);
//        list.add(MediaType.APPLICATION_OCTET_STREAM);
//        return list;
//    }
}


*
* */
}