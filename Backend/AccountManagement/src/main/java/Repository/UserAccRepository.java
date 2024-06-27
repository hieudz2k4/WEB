package Repository;

import Model.UserAcc;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccRepository {
  public UserAcc findByUserName(String userName);
  public boolean saveUserAcc(UserAcc userAcc);
}
