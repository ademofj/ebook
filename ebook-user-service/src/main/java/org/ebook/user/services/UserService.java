package org.ebook.user.services;

import org.ebook.user.model.User;
import org.ebook.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

 
    public User getUser(Integer userId) {
        return userRepository.findById(userId);
    }

    public void saveUser(User user){

    	userRepository.save(user);
     }

    public void updateUser(User user){
    	userRepository.save(user);
 
    }

    public void deleteUser(User user){
    	userRepository.delete(user);	  
    }
 
}
