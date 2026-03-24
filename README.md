# API Cursos - Evidencia
 
## Endpoints probados
- GET /api/cursos
- POST /api/cursos
 
## Resultados
- Curso válido: correcto
- Validaciones funcionando
 
## Aprendizaje
Uso de @RequestBody, @Valid, @NotNull y @NotBlank

¿Qué hace @RequestBody?
  La anotacion @Requestbody se utiliza para vincular automaticamente el cuerpo de una solicitud HTTP a un objeto java en el controlador
¿Para qué sirve @Valid?
 Sirve para activar la validacion automatica de obbjetos, como DTOs o formularios, recibidos en los metodos de un controlador
Diferencia entre @NotNull y @NotBlank
 @Notnull garantiza que un campo no sea nulo y @Notblank garantiza la no nulidad y requiere menos un caracter que no sea un espacio en blanco
¿Por qué usamos List en vez de arreglos?

