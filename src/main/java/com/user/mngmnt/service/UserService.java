package com.user.mngmnt.service;

import java.util.List;

import com.user.mngmnt.model.User;
import org.springframework.data.domain.Pageable;

public interface UserService {
    User findUserByEmail(String email);

    void saveUser(User user);

    Boolean removeAll();

    void removeById(Long id);

    User findById(Long id);

    List<User> searchUsers(String name);

    List<User> findAllUser(Pageable pageable);

    List<User> findTotalUsersByIsActive(Boolean isActive);

    List<User> searchBy(String keyword, String criteria);
}
