package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;


@Controller
public class UsersController {

    @Autowired
    private UserService userService;

    @RequestMapping ("/")
    public String showAllUsers(ModelMap model) {
        model.addAttribute("usersList", userService.getUserList());
        return "all_users";
    }

    @RequestMapping("/addNewUser")
    public String addNewUser(Model model) {
        model.addAttribute("user", new User());
        return "user_info";
    }

    @RequestMapping("/addNewUser/save")
    public String saveUser(@ModelAttribute("user") User user) {
        if (user.getId() == 0) {
            userService.saveUser(user);
        }
        userService.updateUser(user);

        return "redirect:/";
    }

    @RequestMapping("/updateInfo{id}")
    public String changeUser(@RequestParam("id") long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "user_info";
    }

    @RequestMapping("/deleteUser{id}")
    public String deleteUser(@RequestParam("id") long id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}
