package com.user.mngmnt;

import com.user.mngmnt.model.RoleNames;
import com.user.mngmnt.model.User;
import com.user.mngmnt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitialSetup {

    @Autowired
    private UserService userService;

    @Value("${admin.first.name}")
    private String firstName;

    @Value("${admin.last.name}")
    private String lastName;

    @Value("${admin.email.address}")
    private String emailAddress;

    @Value("${admin.password}")
    private String password;



    @PostConstruct
    public void initIt() throws Exception {

        User dbUser = userService.findUserByEmail(emailAddress);

        if (dbUser == null) {
            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(emailAddress);
            user.setPassword(password);
            user.setActive(Boolean.TRUE);
            user.setRoleName(RoleNames.ADMIN.name());
            userService.saveUser(user);
        }
        loadUsers();
    }



    private void loadUsers() {
        User user1 = new User("john", "doe",
                "john@doe.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user1);

        User user2 = new User("Smith", "Guard",
                "smith@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user2);

        User user3 = new User("Lannister", "Jammy",
                "jammy@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user3);

        User user4 = new User("Stark", "Arya",
                "arya@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user4);

        User user5 = new User("Bolton", "ramsay",
                "ramsay@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user5);

        User user6 = new User("Clarke", "gibbins",
                "clarke@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user6);

        User user7 = new User("Bob", "Marley",
                "Bob@doe.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user7);

        User user8 = new User("Octavia", "Marley",
                "octavia@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user8);

        User user9 = new User("Kane", "William",
                "Kane@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user9);

        User user10 = new User("Jon", "snow",
                "jonsnow@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user10);
    }
}
