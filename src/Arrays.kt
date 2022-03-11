/**
 * CETis108
 * Semestre: Febrero-Julio 2022
 * Asignatura: Desarrolla aplicaciones móviles
 * Profesor: Bidkar Aragón Cárdenas
 * Alumno(a): ?
 * Fecha: 28/02/22 9:16
 * Grupo: 6AV-PR
 */


fun main() {
    println("Arrays en Kotlin")
    // declarar un array o matriz de tipo String con 3 elementos
    // para almacenar nombres propios
    var nombres = Array<String>(3) { "" }

    // inicializar la matriz con valores tipo string
    nombres[0] = "nombre1"
    nombres[1] = "nombre2"
    nombres[2] = "nombre3"
    // nombres[3] = "nombre4" ArrayIndexOutOfBoundsException

    // acceder a un elemento en particular
    println("El primer elemento de la matriz de nombres es ${nombres[0]}")

    // recorrer todos los valores de la matriz
    for (nombre in nombres) {
        println(nombre)
    }
}