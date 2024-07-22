package com.eventGames.punabioApp.service;

import com.eventGames.punabioApp.model.Usuario;
import com.eventGames.punabioApp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario getUsuarioByEmailAndZona(String email, String zona){
        List<Usuario> usuarios = usuarioRepository.getUsuarioByEmailAndZone(email, zona);
        if(usuarios.size() > 0){
            return usuarios.get(0);
        }
        else return null;
    }

    public Usuario createUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

}
