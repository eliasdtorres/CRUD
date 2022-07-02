


package com.crud.web;

import com.crud.domain.Persona;
import com.crud.servicios.iPersonaService;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ControladorInicio {
    
    @Autowired
    private iPersonaService iPersonaService;
    
    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal User user){
        
       List<Persona>listaDeUsuarios=(ArrayList<Persona>) iPersonaService.listarPersonas();
       log.info("Usuario activo: " + user);
    
       model.addAttribute("listaDeUsuarios",listaDeUsuarios);
                
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Persona persona){
          
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors errors){
        if (errors.hasErrors()) {
            return "modificar";
        }
        iPersonaService.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model){
       persona= iPersonaService.encontrarPersona(persona);
       model.addAttribute("persona",persona);
        return "modificar";
    }
    @GetMapping("/eliminar")
    public String eliminar(Persona persona){
        iPersonaService.eliminar(persona);
        return "redirect:/";
    }
    
}
