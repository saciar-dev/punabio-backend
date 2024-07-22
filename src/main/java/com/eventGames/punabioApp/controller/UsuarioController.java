package com.eventGames.punabioApp.controller;

import com.eventGames.punabioApp.model.Usuario;
import com.eventGames.punabioApp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @CrossOrigin
    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.createUsuario(usuario);
    }

    @GetMapping
    @CrossOrigin
    public ResponseEntity<Usuario> getUsuarioByEmailAndZona(@RequestParam String email, @RequestParam String zona){
        ResponseEntity<Usuario> response =  null;
        Usuario usuario = usuarioService.getUsuarioByEmailAndZona(email, zona);
        if(usuario == null){
            response = new ResponseEntity<Usuario>( HttpStatus.NO_CONTENT);
        }
        else response = new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
        return response;
    }

}
