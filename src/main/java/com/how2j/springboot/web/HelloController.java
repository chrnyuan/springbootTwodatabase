package com.how2j.springboot.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class HelloController {
 
    @RequestMapping("/index.html")
    @ResponseBody
    public String index(){
    	
        return "hello";
    }
    

    
    
}
