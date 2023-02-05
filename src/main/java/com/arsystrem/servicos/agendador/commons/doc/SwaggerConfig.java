//package com.arsystrem.servicos.agendador.commons.doc;
//
//import com.arsystrem.servicos.agendador.controller.Controller;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.RequestMethod;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.builders.ResponseMessageBuilder;
//import springfox.documentation.schema.ModelRef;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.Header;
//import springfox.documentation.service.ResponseMessage;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    private final ResponseMessage m201 = customMessage201();
//    private final ResponseMessage m204put = simpleMessage(204, "Update OK");
//    private final ResponseMessage m204del = simpleMessage(204, "Delete OK");
//    private final ResponseMessage m403 = simpleMessage(403, "Unauthorized");
//    private final ResponseMessage m404 = simpleMessage(404, "Not Found");
//    private final ResponseMessage m422 = simpleMessage(422, "Validation Error");
//    private final ResponseMessage m500 = simpleMessage(500, "Unexpected Error");
//
//    @Bean
//    public Docket api() {
//
//        return new Docket(DocumentationType.SWAGGER_2)
//                .useDefaultResponseMessages(false)
//                .globalResponseMessage(RequestMethod.GET, Arrays.asList(m403, m404, m500))
//                .globalResponseMessage(RequestMethod.POST, Arrays.asList(m201, m403, m422, m500))
//                .globalResponseMessage(RequestMethod.PUT, Arrays.asList(m204put, m403, m404, m422, m500))
//                .globalResponseMessage(RequestMethod.PATCH, Arrays.asList(m204put, m403, m404, m422, m500))
//                .globalResponseMessage(RequestMethod.DELETE, Arrays.asList(m204del, m403, m404, m500))
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage(Controller.class.getPackage().getName()))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//
//        return new ApiInfo(
//                "Agendador",
//                "Agendador",
//                "Versão 1.0.0",
//                "",
//                new Contact("Accesstage", "", ""),
//                "All rights reserved",
//                "",
//                Collections.emptyList()
//        );
//    }
//
//    private ResponseMessage simpleMessage(final int code, final String message) {
//
//        return new ResponseMessageBuilder().code(code).message(message).build();
//    }
//
//    private ResponseMessage customMessage201() {
//
//        final Map<String, Header> map = new HashMap<>();
//
//        map.put("location", new Header("location", "New Resource URI", new ModelRef("string")));
//
//        return new ResponseMessageBuilder().code(201).message("Resource Created").headersWithDescription(map).build();
//    }
//}
