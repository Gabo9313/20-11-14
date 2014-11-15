/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven.mvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author T
 */
public class WebAp extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
         System.out.println(">>>>>>>>>>> CARGANDO CONFIGURACION CLASES DE CONFIG");
        return new Class <?> [0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println(">>>>>>>>>>> CARGANDO CONFIGURACION DE SERVLETS");
        return new Class<?>[]{WebApConfig.class};
       
    }

    @Override
    protected String[] getServletMappings() {
       System.out.println(">>>>>>>>>>> CARGANDO CONFIGURACION DE SERVicios");
       return new String[]{"/servicios/*"};
    }
    
}
