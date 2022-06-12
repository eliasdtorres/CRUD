


package com.crud.dao;

import com.crud.domain.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iPersonaDao extends CrudRepository<Persona,Long> {
    
    

    
}
