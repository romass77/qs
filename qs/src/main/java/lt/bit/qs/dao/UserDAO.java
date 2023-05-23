package lt.bit.qs.dao;

import lt.bit.qs.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {
    
    
  

}
