package com.example.controller;

import com.example.dto.CreateUserDTO;
import com.example.dto.UpdateUserDTO;
import com.example.dto.UserDTO;
import com.example.dto.UserMapper;
import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;
    private UserMapper userMapper;

    public UserController(UserRepository userRepository) {
        this.userService = userService;
    }

    @GetMapping
    Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    User addUser(@RequestBody CreateUserDTO createUserDTO) {
        return userMapper.dto(userService.addUser(userMapper.model(createUserDTO)));  // zwracamy po to by bylo widac usera,
    } // bedziemy uzywac userservice wiec usuwamy userrepository z controllera.

    @GetMapping("/{id}")
    Optional<UserDTO> findUserById(@PathVariable Long id) {
        return userService.getUserById(id).map((user) -> userMapper.dto(user));// mapowanie optionala, lambda,anonimowa implementacja funkcji
    }

    // usuwamy uzytkownika po id, {id} dowolna zmienna, podstawiona dowolna liczba,
    @DeleteMapping("/{id}")
    void deleteUserById(@PathVariable long id) {
        userService.deleteUserById(id);
    }
    // @requestbody - z ciala

    @PutMapping("/{id}")
    User updateUser(@RequestBody UpdateUserDTO updateUserDTO, long id) {
        return userService.updateUser(user);
// ctrl alt - L - uklada tekst

    }

}
