package com.learnings2024.learnings2024.service;

import com.learnings2024.learnings2024.model.UserDTO;
import com.learnings2024.learnings2024.model.entity.DbUser;
import com.learnings2024.learnings2024.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getUsers() {

        List<UserDTO> userDTOs = new ArrayList<>();
        Iterable<DbUser> dbUsers = userRepository.findAll();
        dbUsers.forEach(dbUser -> userDTOs.add(new UserDTO(dbUser.getAccount_name())));
        return userDTOs;
    }
}
