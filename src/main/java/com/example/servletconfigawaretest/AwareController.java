package com.example.servletconfigawaretest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.ServletConfigAware;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

@Controller
public class AwareController implements ServletConfigAware, ServletContextAware {

    private Logger LOG = LoggerFactory.getLogger(AwareController.class);


    @GetMapping("/")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello world");
    }


    @Override
    public void setServletConfig(ServletConfig servletConfig) {
        LOG.info("ServletConfig has been set.");
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        LOG.info("ServletContext has been set.");
    }
}
