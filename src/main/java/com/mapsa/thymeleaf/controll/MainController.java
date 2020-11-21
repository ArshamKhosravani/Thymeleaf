package com.mapsa.thymeleaf.controll;

import com.mapsa.thymeleaf.model.User;
import com.mapsa.thymeleaf.services.UserService;
import com.mapsa.thymeleaf.services.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    private final UserService userService;

    public MainController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String getRegister(User user) {
        return "new-user";
    }

    @PostMapping("/register")
    public String register(User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping({"/", "/index", "/index.html"})
    public String index(Model model) {
        List<User> userList = (List<User>) userService.getAllUsers();
        model.addAttribute("userList", userList.isEmpty() ? null : userList);
        return "index";
    }

    //<td><a class="btn btn-primary" th:href="@{/delete/{id}(id=${user.id})}"><i
    //                                class="fas fa-user-times ml-2"></i></a></td>
    @DeleteMapping("/delete")
    public String delete(User user) {
        userService.deleteUser(user);
        return "redirect:/";
    }

}
