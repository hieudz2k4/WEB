package Config;

import Service.LoginService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Service")
public class BeanConfig {
  public LoginService loginService() {
    return new LoginService();
  }
}
