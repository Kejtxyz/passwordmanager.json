package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {
    private UserRepository userRepository;
    // tworzymy konstruktor,
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

   public Optional<User> getUser(long id){
      return userRepository.findById(id);
    }

    Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    User addUser(User user){
        userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        userRepository.findById(id);

    }

    public void deleteUserById(long id) {
        userRepository.deleteById(id);

    }

    public User updateUser(User user) {
        return userRepository.save(user);

    }
}

