package lk.ijse.finalcoursework.shoeshop.persistence.repository;

import lk.ijse.finalcoursework.shoeshop.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 *@author: Hirusha Navod,
 *@Runtime version: 11.0.11+9-b1341.60 amd64
 **/

public interface UserRepository extends JpaRepository<User,String> {
    Boolean existsByEmail(String email);
    User findByEmailAndRole(String email,String role);
    void deleteByEmail(String email);
    Optional<User> findByEmail(String email);
}
