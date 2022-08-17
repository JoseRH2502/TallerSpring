package com.botline.TallerSpring.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botline.TallerSpring.Respositorio.UsuarioRepositorio;
import java.util.List;
import com.botline.TallerSpring.Entidades.Usuario;

@Service
public class UsuarioServicioImp  implements UsuarioServicio{
    @Autowired
    private UsuarioRepositorio repo;

    @Override
    public List<Usuario> listarUsuarios(){
        return repo.findAll();
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return repo.save(usuario);}   
}
