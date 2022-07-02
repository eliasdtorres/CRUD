


package com.crud.dao;

import com.crud.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface iUsuarioDao extends JpaRepository<Usuario,Long>{
            
    Usuario findByUsername(String username);
    
}
