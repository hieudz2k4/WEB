package Service;

import Repository.UserAccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/*
Load Data User From Repository -> Service
 */
@Service

public class CustomUserDetailsService implements UserDetailsService {
  @Autowired
  private UserAccRepository userAccRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

  }
}
