package com.example;

/*  el record no es un mero atajo para crear una clase que permita crear objetos imutables
    es decir que una vez creados no se puedan modificar 

    el record es lo mejor que existe para transportar datos, genera una estructura de datos 
    que es final es decir que no se puede heredar ademar:

    1. las propiedades o campos del record entre parentesis se convierten en private final 
    por lo cual no se le pueden generar metodos setter para cambiar el valor 

    2. se generan automaticamente metodos getter pero que no llevan delante la palabra 
    get sino el nombre de la propiedad o campo del record

    3. se generan para el record los metodos toString, equals y hashCode,

    en teoria un record no necesita de lombok en absoluto pero utilizar la anotacion @Builder de lombok
    nos facilita mucho el trabajo a la hora de instanciar un record porque no estariamos obligados a suministras todos 
    los parametros que le constructor espera ni tampoco tendriamos que respetar el orden 


*/
public record Persona(
        String nombre,
        double altura,
        String apellido1,
        String correo) {

}