package pl.spring.example.full.repository;

import pl.spring.example.full.domain.User;

import java.util.List;

public interface UserAccess {
    List<User> readAllUsers();
}
