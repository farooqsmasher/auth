package org.auth;

import org.springframework.stereotype.Component;

@Component
public class userRepo {

    public User findByname(String userName){

        User user = new User();
        user.setUserName("farooq");
        user.setPassword("007");
        if(user.getUserName().equals(userName) && user.getPassword().equals("007")){
            return user;
        }

        return null;
    }

}
