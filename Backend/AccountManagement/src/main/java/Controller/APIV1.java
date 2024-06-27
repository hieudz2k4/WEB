package Controller;

import Model.UserAcc;
import Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin
@SpringBootApplication(scanBasePackages = "Service")
public class APIV1 {
  @Autowired
  private LoginService loginService;

  @PostMapping(path = "/login")
  public ResponseEntity<Boolean> login(@RequestBody UserAcc userAcc) {
    String userName = userAcc.getUserName();
    String password = userAcc.getPassword();
    boolean isAuthenticated = loginService.checkAcc(userName, password);
    return ResponseEntity.ok(isAuthenticated);
  }

  @GetMapping(path = "/user")
  public ResponseEntity<String> getUserName(@RequestParam String name) {
    System.out.println(name);
    return ResponseEntity.ok("ok");
  }
}
