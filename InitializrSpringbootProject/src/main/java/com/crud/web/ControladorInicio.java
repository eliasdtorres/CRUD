


package com.crud.web;

import com.crud.dao.iPersonaDao;
import com.crud.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class ControladorInicio {
    
    @Autowired
    private iPersonaDao iPersonaDao;
    
    @GetMapping("/")
    public String inicio(Model model){
        
       List<Persona>listaDeUsuarios = new ArrayList<Persona>();
       listaDeUsuarios =(ArrayList<Persona>) iPersonaDao.findAll();
       model.addAttribute("listaDeUsuarios",listaDeUsuarios);
               
        
        
        return "index";
    }
    
    
}
