package pl.spring.example.full.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.spring.example.full.domain.User;
import pl.spring.example.full.repository.UserAccess;
import pl.spring.example.full.repository.FakeRepo;

import java.util.Collections;
import java.util.List;

@Service
public class UserService  {

    private UserAccess userAccess;

    @Autowired
    public UserService(UserAccess userAccess) {
        this.userAccess = userAccess;
    }

    public List<User> getAllUsers() {
        return userAccess.readAllUsers();
    }
}
