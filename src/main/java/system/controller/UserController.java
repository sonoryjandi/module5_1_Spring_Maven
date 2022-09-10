package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import system.model.User;
import system.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/users") //user-system/users
public class UserController {
    @Autowired
    private UserService userService; // контроллер связан с сервисом

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody // то, что я отдам в качестве ответа пользователю
    List getAllUsers(){
        return userService.getAllUsers();
    }
}
