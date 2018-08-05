package com.user.mngmnt.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.user.mngmnt.model.User;

import java.util.List;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    @Query("select c from User c where LOWER(c.lastName) LIKE LOWER(concat(?1, '%')) OR LOWER(c.firstName) LIKE LOWER(concat(?1, '%'))")
    List<User> findUsersContaining(@Param("name") String name);

    List<User> findAllByIsActive(@Param("isActive") boolean isActive, Pageable pageable);

    List<User> findAllByIsActive(@Param("isActive") boolean isActive);

    List<User> findByFirstNameIgnoreCaseContaining(String firstName);

    List<User> findByLastNameIgnoreCaseContaining(String lastName);

    List<User> findByEmailIgnoreCaseContaining(String email);
}
