package com.example.clothing.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.clothing.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
