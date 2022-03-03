package com.example.jpapractice.repository;

import com.example.jpapractice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findAllByName(String name);
    User findByEmailAndName(String email, String name);
    List<User> findByNameOrEmail(String name, String email);
    List<User> findByIdAfter(Long id);
    List<User> findByCreatedAtGreaterThan(LocalDateTime yesterday);
    List<User> findByCreatedAtEquals(LocalDateTime yesterday);
    List<User> findByIdBetween(Long id1, Long id2);
    List<User> findByIdGreaterThanEqualAndIdLessThanEqual(Long id1, Long id2);
    List<User> findByNameStartingWith(String start);
    List<User> findByNameEndingWith(String end);
    List<User> findByNameContains(String str);

}