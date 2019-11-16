package pl.spring.example.full.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

        private String login;
        private String password;
}
