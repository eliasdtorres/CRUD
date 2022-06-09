

package com.crud.servicios;

import com.crud.domain.Persona;
import java.util.List;

  
public interface iPersonaService {
    public List<Persona> listarPersonas();
    public void guardar(Persona persona);
    public void eliminar(Persona persona);
    public Persona encontrarPersona(Persona persona);
    
}
