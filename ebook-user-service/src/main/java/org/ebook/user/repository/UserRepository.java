package org.ebook.user.repository;

import org.ebook.user.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>  {
    public User findById(Integer userID);
    
}
