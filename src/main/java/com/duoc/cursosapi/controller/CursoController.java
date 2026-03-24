package com.duoc.cursosapi.controller;


import com.duoc.cursosapi.model.Curso;
import com.duoc.cursosapi.service.CursoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    //instancia de servicios
    private final CursoService cursoservice;

    //inyectar mediante constructor
    public CursoController(CursoService cursoservice){
        this.cursoservice=cursoservice;

    }

    //obtener
    @GetMapping
    public List<Curso> listarCursos(){
        return cursoservice.obtenerCursos();
    }
    //obtener las modalidade
    @GetMapping("/modalidades")
    public String [] listarModalidades(){
        return cursoservice.obtenerModalidades();
    }
    //guardar
    //poner @Valid para que haga validacion
    @PostMapping
    public Curso agregarCurso(@Valid @RequestBody Curso curso){
        return cursoservice.guardarCursos(curso);
    }
}
