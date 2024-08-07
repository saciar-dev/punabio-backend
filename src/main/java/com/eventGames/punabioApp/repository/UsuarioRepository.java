package com.eventGames.punabioApp.repository;

import com.eventGames.punabioApp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("select c from Usuario c where c.email= ?1 and c.zona= ?2")
    List<Usuario> getUsuarioByEmailAndZone(String email, String zona);

}
