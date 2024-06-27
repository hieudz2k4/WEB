package org.acc.accountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(scanBasePackages = {"Config"})
public class AccountManagementApplication {
  public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication(AccountManagementApplication.class);
    //Customize here
    springApplication.run(args);
  }
}
