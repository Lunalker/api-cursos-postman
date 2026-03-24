package com.duoc.cursosapi.service;
import com.duoc.cursosapi.model.Curso;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CursoService {

    //lista que va a ser bd

    private List<Curso> listarCursos = new ArrayList<>();

    //crear arreglo
    private String [] modalidades = {"presencial", "online", "hibrido"};

    public CursoService(){
        //cargar algunos datos
        listarCursos.add(new Curso(1, "fullstack V1","marcelo crisostomo", 100));
        listarCursos.add(new Curso(2, "Base de datos V2","German barrientos", 120));
        listarCursos.add(new Curso(3, "IA","GIO", 150));
    }
    //get
    public  List<Curso> obtenerCursos(){
        return listarCursos;
    }
    //obtener modalidades
    public String[] obtenerModalidades(){
        return modalidades;
    }
    //post = guardar
    public Curso guardarCursos(Curso curso){
        listarCursos.add(curso);
        return curso;
    }

}
