package pl.spring.example.full.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.spring.example.full.domain.User;
import pl.spring.example.full.service.UserService;

import java.util.List;

@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    private UserService userService;

    @Autowired
    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/Hello")
    ModelAndView myFirstView(ModelAndView modelAndView, @RequestParam(defaultValue = "franek") String name){

        logger.info("name: {}", name);

        modelAndView.addObject("user", name);
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @GetMapping("/personData")
    ModelAndView mySecondView(ModelAndView modelAndView, @RequestParam(defaultValue = "imie") String name,
                              @RequestParam(defaultValue = "nazwisko") String surname,
                                @RequestParam(defaultValue = "22") int years){

        logger.info("name: {}", name);
        logger.info("surname: {}", surname);
        logger.info("years: {}", years);

        modelAndView.addObject("name", name);
        modelAndView.addObject("surname", surname);
        modelAndView.addObject("years", years);
        modelAndView.setViewName("person");
        return modelAndView;
    }

    @GetMapping("/users")
    ModelAndView readAllUsers(ModelAndView modelAndView){
        List<User> users = userService.getAllUsers();
        logger.info("users {}",users);

        modelAndView.addObject("allUsers", users);
        modelAndView.setViewName("users");
        return modelAndView;
    }
}
