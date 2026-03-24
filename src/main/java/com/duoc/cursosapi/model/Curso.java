package com.duoc.cursosapi.model;

//arreglo; almacenar varios elementos y tiene tamaño fijo inmutable
//String nombre-arreglo = {"cadena1", "cadena2"};

//coleccion: permite guardar varios elementos y puede crecer dinamicamente
//list = son recomendables para endpoints
//list <tipodato String> nombre-lista = new Arraylist<>():

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.security.PrivateKey;

public class Curso {
    //id del curso
    //integer
    //not null= no permite datos que vengan en nulo
    @NotNull(message = "El id no puede venir nulo")

    private  Integer id;

    //validacion @notblank = mensaje no venga en blanco
    //null, = "" o "  "
    @NotBlank(message = "El nombre del curso no puede estar vacio")
    private String nombre;


    @NotBlank(message = "El docente no puede estar vacio")
    private String docente;



    @NotNull
    private Integer horas;


    public Curso(){

    }



    public Curso(Integer id, String nombre, String docente, Integer horas){
        this.id=id;
        this.nombre=nombre;
        this.docente=docente;
        this.horas=horas;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
