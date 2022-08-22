package com.musicnetwork.Interfaces;

import com.musicnetwork.DTOs.UserDTO;
import com.musicnetwork.Entities.Account;

public interface UserInterface {
    Account addUser(UserDTO userDTO);

}
