package com.botline.TallerSpring.Servicio;

import java.util.List;

import com.botline.TallerSpring.Entidades.Usuario;

public interface UsuarioServicio {
    public List<Usuario> listarUsuarios();
    public Usuario guardarUsuario(Usuario usuario);
}
