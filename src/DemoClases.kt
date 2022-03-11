/**
 * CETis108
 * Semestre: Febrero-Julio 2022
 * Asignatura: Desarrolla aplicaciones móviles
 * Profesor: Bidkar Aragón Cárdenas
 * Alumno(a): ?
 * Fecha: 08/03/22 12:07
 * Grupo: 6AV-PR
 */


fun main() {
    val daniela = Alumno2("Daniela", "Parra")
    println(daniela.nombre)

    val kenia = Alumno3("Kenia", "Aboyte")
    println(kenia.nombre)
}


class Alumno2(
    var nombre: String,
    var apellidos: String
) {}

class Alumno3 {
    var nombre: String = ""
    var apellidos: String = ""

    constructor(nombre: String, apellidos: String) {
        this.nombre = nombre.uppercase()
        this.apellidos = apellidos.uppercase()
    }
}