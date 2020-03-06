package com.example.gradSpingBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
    @RequestMapping("/")
    public ModelAndView index(Alien alien){
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj",alien);
        mv.setViewName("index");
        return mv;
    }
}
