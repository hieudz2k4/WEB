package Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Table(name = "UserAcc")
@Getter
@Setter
public class UserAcc {
  @Id
  @GeneratedValue
  private int id;
  @Column(name = "userName", nullable = false, length = 255)
  private String userName;
  @Column(name = "password", nullable = false, length = 255)
  private String password;

  @Column(name = "role", nullable = false, length = 255)
  private String role;

  @Transient
  private String email;

  @Temporal(TemporalType.DATE)
  private Date date;
}