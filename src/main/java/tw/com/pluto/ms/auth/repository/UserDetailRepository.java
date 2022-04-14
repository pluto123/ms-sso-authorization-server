package tw.com.pluto.ms.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.com.pluto.ms.auth.model.User;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String name);
}
