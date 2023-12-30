package dev.anant_project.user_management.service;

import dev.anant_project.user_management.data.User;
import dev.anant_project.user_management.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUser(){
        List<User> user = userRepository.findAll();
        return user;
    }
    public User createUser(User user){
        return userRepository.save(user);
    }
    public User updateUser(User user){
        return userRepository.save(user);
    }
    public void deleteUserById(String id){
        userRepository.deleteById(id);
    }
}
