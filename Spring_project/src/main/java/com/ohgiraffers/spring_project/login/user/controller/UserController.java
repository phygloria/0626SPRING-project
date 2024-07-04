package com.ohgiraffers.spring_project.login.user.controller;

import com.ohgiraffers.spring_project.login.user.model.dto.SignupDTO;
import com.ohgiraffers.spring_project.login.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signup")
    public void signUp() {

    }

    @PostMapping("/signup")
    public ModelAndView signup(@ModelAttribute SignupDTO signupDTO, ModelAndView mv){
        Integer result = userService.regist(signupDTO);

        String message = null;

        if(result == null ){
            message = "중복회원이 존재합니다.";
        }else if (result ==0){
            message = "서버에서 오류가 발생하였습니다.";
            mv.setViewName("user/signup");
        }else if (result >= 1){
            message ="회원가입이 완료되었습니다.";
            mv.setViewName("login2");
        }

        mv.addObject("message", message);
        return mv;
    }




    //    @PostMapping("/login")
//    public String login(@RequestParam String username, @RequestParam String password, Model model) {
//        if (authService.authenticate(username, password)) {
////            return "redirect:/page/subpage";
//            return "redirect:/";
//        } else {
//            model.addAttribute("error", "Invalid username or password");
//            return "index";
//        }
//    }
}