package smkt.backend_demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import smkt.backend_demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
