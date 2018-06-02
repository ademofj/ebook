package org.ebook.user.controllers;


import org.ebook.user.model.User;
import org.ebook.user.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value="v1/user")
public class UserServiceController {
    @Autowired
    private UserService userService;
    private static final Logger logger = LoggerFactory.getLogger(UserServiceController.class);

    @RequestMapping(value="/{userId}",method = RequestMethod.GET)
    public User getUser( @PathVariable("userId") Integer userId) {

        User user = userService.getUser(userId);
        
        return user;
    }

    @RequestMapping(value="/{userId}",method = RequestMethod.PUT)
    public void updateUser( @PathVariable("userId") Integer userId, @RequestBody User user) {
        userService.updateUser( user );

    }

    @RequestMapping(value="/{userId}",method = RequestMethod.POST)
    public void saveUser(@RequestBody User user) {
       userService.saveUser( user );
    }
 
    @RequestMapping(value="/{userId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser( @RequestBody User user) {
        userService.deleteUser( user );
    }
    
    @RequestMapping(value="/{userName}/{password}",method = RequestMethod.GET)
    public Integer login(@PathVariable("userName") String user_name,@PathVariable("password") String password) {
    	Integer user_id = userService.login( user_name,password );
        return user_id;
    }
    
}
