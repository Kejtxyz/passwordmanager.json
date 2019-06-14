package com.example.dto;

import com.example.model.User;
import org.springframework.stereotype.Component;

@Component  // cos dodatkowego
public class UserMapper {
    // translacja miedzy dto a zwraca user
   public User model (CreateUserDTO createUserDTO){
        User user = new User();
        user.setName(createUserDTO.getName());
        user.setSurname(createUserDTO.getSurname());
        user.setMail(createUserDTO.getMail());
        return user ;
    }


    public User model(UpdateUserDTO updateUserDTO){
       User user = new User();
    }



    private User createNewUser(CreateUserDTO createUserDTO){
       User user = new User();

    }

    public UserDTO dto(User user){
       UserDto userDto = new UserDTO();
       userDto.setId(user.getId());
       userDto.setName(user.getName());
       userDto.setSurname(user.getSurname());
       userDto.setMail(user.getMail());

    }

    public Iterable<UserDTO> dto (Iterable<User> users){

    }

}
