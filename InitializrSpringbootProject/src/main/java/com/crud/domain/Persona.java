package com.crud.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;



@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    @NotEmpty
    @Column(name="nombre")
    private String nombre;
    
    @NotEmpty
    @Column(name="apellido")
    private String apellido;
    
    @NotEmpty
    @Email
    private String email;
    
    
    private String telefono;
    
    @NotNull
    @Column(name="saldo")
    private Double saldo;

}
