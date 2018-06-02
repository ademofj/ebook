package org.ebook.user.repository;

import org.ebook.user.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>  {
    public User findById(Integer userID);
     /**
      * It should default use class "User" in JPQL @query  so it should use "User" not "user" in SQL
      * or It can use "user" in @Query SQL and add nativeQuery=true
      */
    //@Query( "select u.id from User u where u.user_name = ?1 and u.password = ?2") 
    @Query(value = "select u.id from user u where u.user_name = ?1 and u.password = ?2" ,nativeQuery=true)
    public Integer login(String user_name, String password);  
    
}
