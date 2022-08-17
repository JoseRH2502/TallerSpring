package com.botline.TallerSpring.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.botline.TallerSpring.Entidades.Usuario;
import com.botline.TallerSpring.Servicio.UsuarioServicio;

@Controller
public class UsuarioControlador {
    @Autowired
    private UsuarioServicio servicio;

    @GetMapping({"/usuarios", "/"})
    public String listarUsuarios(Model modelo){
        modelo.addAttribute("usuarios",servicio.listarUsuarios());
        return "usuario";
    }


    @GetMapping("/guardar")
    public String guardar(){
        Usuario Usuario1 = new Usuario("Jose","cris21@gmail.com");
	    servicio.guardarUsuario(Usuario1);
        return "guardado";
    }



}
