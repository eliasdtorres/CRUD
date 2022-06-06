


package com.crud.crud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class ControladorInicio {
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")
    public String inicio(Model model){
        String mensaje = "Hola Mundo con Thymeleaf";
        model.addAttribute("mensaje",mensaje );
        model.addAttribute("saludo", saludo);
        return "index";
    }
    
    
}