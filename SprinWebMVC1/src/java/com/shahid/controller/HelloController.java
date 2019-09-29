package com.shahid.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String HelloMessage(ModelMap map) {

        map.addAttribute("Hello", "hello spring MVC");

        return "index";
    }

    @RequestMapping(value = "/welcome/{country}/{name}")
    public String HiMessage(ModelMap map, @PathVariable Map<String,String> pathvars) {
        
        String name = pathvars.get("name");
        String country = pathvars.get("country");

        map.addAttribute("Hello", "hello "+name+" came from "+country);

        return "index";
    }
}
