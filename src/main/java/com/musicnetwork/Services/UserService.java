package com.musicnetwork.Services;

import com.musicnetwork.DTOs.UserDTO;
import com.musicnetwork.Entities.Comment;
import com.musicnetwork.Entities.Song;
import com.musicnetwork.Entities.Account;
import com.musicnetwork.Enum.Role;
import com.musicnetwork.Interfaces.UserInterface;
import com.musicnetwork.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserInterface {

    @Autowired
    UserRepository userRepository;

    @Override
    public Account addUser(UserDTO userDTO) {
        if (userDTO.getRole() == null) {
            userDTO.setRole(Role.NORMAL);
        }
        Account account = new Account();
        account.setRole(userDTO.getRole());
        account.setName(userDTO.getName());
        account.setPassword(account.getPassword());
        account.setUsername(account.getUsername());
        account.setComments(new ArrayList<Comment>());
        account.setUploadedSongs(new ArrayList<Song>());
        return userRepository.save(account);
    }
}
