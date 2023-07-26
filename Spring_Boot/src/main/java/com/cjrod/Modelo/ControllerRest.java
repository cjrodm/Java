
package com.cjrod.Modelo;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class ControllerRest {
    
    @GetMapping("/")
    /* public String comienzo(ModelMap model)
            
    {
    String hola = "Hola Spring Framework!";
    log.info("Estoy ejecutando un controlador MVC");
    model.addAttribute("hola", hola);
    return "index";
    }
  public String inicio(Map<String,Object> map)
    {
    map.put("titulo", "Hola Spring Framework con Map!");
    return "index";
    }
  */
   public ModelAndView index(ModelAndView mv)  
   {
   mv.addObject("hola", "Estamos usando ModelAndView");
   mv.setViewName("index");
   return mv;
   
   }
            
            
}
