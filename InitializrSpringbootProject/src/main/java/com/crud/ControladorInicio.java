


package com.crud;

import com.crud.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(Model model){
        
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@mail.com");
        persona.setTelefono("1111111111");
        
        Persona persona2 = new Persona();
        persona2.setNombre("Carla");
        persona2.setApellido("Gomez");
        persona2.setEmail("cgomez@mail.com");
        persona2.setTelefono("2222222222");
        
        List<Persona>listaDeUsuarios=Arrays.asList(persona,persona2);
        model.addAttribute("listaDeUsuarios",listaDeUsuarios);
        
        return "index";
    }
    
    
}
