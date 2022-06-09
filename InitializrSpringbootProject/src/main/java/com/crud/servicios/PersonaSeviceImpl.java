


package com.crud.servicios;

import com.crud.dao.iPersonaDao;
import com.crud.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaSeviceImpl implements iPersonaService{
    
    @Autowired
    private iPersonaDao iPersonaDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Persona> listarPersonas() {
         return(List)iPersonaDao.findAll();
        
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        
        iPersonaDao.save(persona);
        
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        iPersonaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly=true)
    public Persona encontrarPersona(Persona persona) {
        
       return iPersonaDao.findById(persona.getIdPersona()).orElse(null);
    }

}
