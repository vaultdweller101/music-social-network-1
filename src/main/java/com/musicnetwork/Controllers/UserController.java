package com.musicnetwork.Controllers;

import com.musicnetwork.DTOs.UserDTO;
import com.musicnetwork.Entities.Account;
import com.musicnetwork.Interfaces.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserInterface userInterface;

    @PostMapping
    public ResponseEntity<Account> addUser(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<Account>(userInterface.addUser(userDTO), HttpStatus.CREATED);
    }
}
