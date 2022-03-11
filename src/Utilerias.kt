import java.lang.NumberFormatException

/**
 * CETis108
 * Semestre: Febrero-Julio 2022
 * Asignatura: Desarrolla aplicaciones móviles
 * Profesor: Bidkar Aragón Cárdenas
 * Alumno(a): ?
 * Fecha: 24/02/22 13:36
 * Grupo: 6AV-PR
 */


fun pedirCadenaPorTeclado(mensaje: String): String {
    while (true) {
        println(mensaje)
        val cadena = readLine()
        if (cadena != "") {
            return cadena!!
        }
    }
}

fun pedirEnteroPorTeclado(mensaje: String): Int {
    while (true) {
        try {
            println(mensaje)
            return readLine()!!.toInt()
        } catch (ex: NumberFormatException) {
            println("Error el valor debe ser número entero")
        }
    }
}

fun pedirDoublePorTeclado(mensaje: String): Double {
    while (true) {
        try {
            println(mensaje)
            return readLine()!!.toDouble()
        } catch (ex: NumberFormatException) {
            println("Error el valor debe ser número double")
        }
    }
}

fun pedirFloatPorTeclado(mensaje: String): Float {
    while (true) {
        try {
            println(mensaje)
            return readLine()!!.toFloat()
        } catch (ex: NumberFormatException) {
            println("Error el valor debe ser número float")
        }
    }
}

fun imprimirTitulo(titulo: String) {
    println("-".repeat(60))
    val margenIzquierdo = (60 - titulo.length)/2
    println(" ".repeat(margenIzquierdo) + titulo.uppercase())
    println("-".repeat(60))
}