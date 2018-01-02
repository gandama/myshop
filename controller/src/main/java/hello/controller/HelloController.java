package hello.controller;

import hello.entity.User;
import hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by yang on 2017/11/28.
 */

@Controller
@RequestMapping("hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("sayHello")
    public ModelAndView sayHello(){
        ModelAndView mv=new ModelAndView();
        List<User> users = helloService.findUserByName("yang");
        mv.setViewName("hello.jsp");
        mv.addObject("user",users);
        mv.addObject("haha","哈哈");
        return mv;

    }
}
