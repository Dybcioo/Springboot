package pl.spring.example.full.repository;

import org.springframework.stereotype.Repository;
import pl.spring.example.full.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class FakeRepo implements UserAccess{

    @Override
    public List<User> readAllUsers() {
        return Arrays.asList(
                new User("Admin","admin"),
                new User("zenon","123"),
                new User("olaf","321")
        );
    }
}
