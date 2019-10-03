package com.shahid.controller;

import com.shahid.model.Employee;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    
    @InitBinder
    public void myInitBinder(WebDataBinder binder){
        
        binder.setDisallowedFields(new String[]{"empMobile"});
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        binder.registerCustomEditor(Date.class, "empDob", new CustomDateEditor(format, false));
        
    }

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
    
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String displayEmployee(){
        
        return "addemployee";
    }
    
     @RequestMapping(value = "/add",method = RequestMethod.POST)
    //public String addEmployee(ModelMap map, @RequestParam("ename") String ename, @RequestParam("eaddress") String eaddress){
       
        public String addEmployee(ModelMap map, @ModelAttribute("employee") Employee employee,BindingResult result){
        //map.addAttribute("edetails", "Name : "+ename+" Address : "+eaddress);
        
//         Employee employee = new Employee();
//         employee.setEname(ename);
//         employee.setEaddress(eaddress);
//         
//         map.addAttribute("employee", employee);

         if (result.hasErrors()) {
             return "addemployee";
             
         }
        return "einfo";
    }
        
        @ModelAttribute
        public String showMessage(ModelMap map){
            
            map.addAttribute("msg", "helo MVC..");
            
            return "einfo";
            
        }
}
