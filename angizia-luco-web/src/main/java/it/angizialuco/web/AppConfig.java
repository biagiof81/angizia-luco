package it.angizialuco.web;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.freemarker.FreemarkerMvcFeature;

public class AppConfig extends ResourceConfig{


    public AppConfig() {
        packages("it.angizialuco.web.controller");
        //property(FreemarkerMvcFeature.TEMPLATE_BASE_PATH, "/sports-master");
        register(FreemarkerMvcFeature.class);
    }
}
