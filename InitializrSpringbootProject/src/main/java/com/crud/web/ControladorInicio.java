


package com.crud.web;

import com.crud.domain.Persona;
import com.crud.servicios.iPersonaService;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ControladorInicio {
    
    @Autowired
    private iPersonaService iPersonaService;
    
    @GetMapping("/")
    public String inicio(Model model){
        
       List<Persona>listaDeUsuarios=(ArrayList<Persona>) iPersonaService.listarPersonas();
    
       model.addAttribute("listaDeUsuarios",listaDeUsuarios);
                
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        
        
        
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Persona persona){
        
        iPersonaService.guardar(persona);
        return "redirect:/";
    }
    
    
    
    
}
