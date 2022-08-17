package com.botline.TallerSpring.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;

    @Column(name = "email",nullable = false,length = 50,unique = true)
    private String email;

    public Usuario(){

    }

    public Usuario(String nombre, String email) {
        super();
        this.nombre = nombre;
        this.email = email;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario [Id=" + Id + ", email=" + email + ", nombre=" + nombre + "]";
    }
    
    


    
}
