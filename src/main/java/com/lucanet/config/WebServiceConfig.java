package com.lucanet.config;

import com.lucanet.MiniSoapErpApplication;
import com.lucanet.soap.MiniSoapErp;
import com.lucanet.soap.MiniSoapErpImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.xml.ws.Endpoint;

@Configuration
@PropertySource(name = "appProperties", value = "application.properties")
@SuppressWarnings("unused") // Spring bean
public class WebServiceConfig {

  private static final Logger LOG = LoggerFactory.getLogger(MiniSoapErpApplication.class);

  @Value("${dispatcher.servlet.path}")
  private String dispatcherServletPath;

  @Value("${server.port}")
  private String serverPort;

  @Bean
  public ServletRegistrationBean cxfServlet() {
      return new ServletRegistrationBean<>(new CXFServlet(), dispatcherServletPath);
  }

  @Bean(name= Bus.DEFAULT_BUS_ID)
  @SuppressWarnings("WeakerAccess") // Spring bean
  public SpringBus springBus() {
      return new SpringBus();
  }

  @Bean
  @SuppressWarnings("WeakerAccess") // Spring bean
  public MiniSoapErp miniSoapErpWebServiceService() {
    return new MiniSoapErpImpl();
  }

  @Bean
  public Endpoint endpoint() {
    EndpointImpl endpoint = new EndpointImpl(springBus(), miniSoapErpWebServiceService());
    endpoint.publish("/" + MiniSoapErp.ENDPOINT_NAME);
    endpoint.setWsdlLocation(MiniSoapErp.ENDPOINT_NAME + ".wsdl");
    logWsdlLocation();
    return endpoint;
  }

  private void logWsdlLocation() {
    String wsdlLocation = "http://localhost:" +
      serverPort +
      dispatcherServletPath.replace("*", "") +
      MiniSoapErp.ENDPOINT_NAME +
      "?wsdl";

    LOG.info("Location of .wsdl is: " + wsdlLocation);
  }

}