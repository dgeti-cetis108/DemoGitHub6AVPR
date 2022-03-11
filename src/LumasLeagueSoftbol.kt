/**
 * CETis108
 * Semestre: Febrero-Julio 2022
 * Asignatura: Desarrolla aplicaciones móviles
 * Profesor: Bidkar Aragón Cárdenas
 * Alumno(a): ?
 * Fecha: 01/03/22 13:41
 * Grupo: 6AV-PR
 */
var nombresDeEquipos = ArrayList<String>()
var resultados = ArrayList<Array<Int>>()
var numeroDeEquipos = 0

fun main() {
    numeroDeEquipos = pedirEnteroPorTeclado("¿Cuantos equipos?")
    for (equipo in 1..numeroDeEquipos) {
        val mensaje = "¿Cual es el nombre del equipo $equipo"
        nombresDeEquipos.add(pedirCadenaPorTeclado(mensaje))
        resultados.add(arrayOf(0, 0, 0, equipo - 1))
    }

    jugarVueltaDelRolRegular()
    jugarVueltaDelRolRegular()
    imprimirTablaDeResultados()
}

fun imprimirTablaDeResultados() {
    val ordenados = resultados.sortedByDescending { r -> r[1] }
    for (resultado in ordenados) {
        val avg = resultado[1].toFloat()/resultado[0].toFloat()
        println("${nombresDeEquipos[resultado[3]]} " +
                "JJ: ${resultado[0]} " +
                "JG: ${resultado[1]} " +
                "JP: ${resultado[2]} " +
                "AVG: %.3f".format(avg))
    }
}

fun jugarVueltaDelRolRegular() {
    for (eq1 in 1 until numeroDeEquipos) {
        for (eq2 in eq1 + 1..numeroDeEquipos) {
            // ambos equipos registran un juego mas
            resultados[eq1 - 1][0]++
            resultados[eq2 - 1][0]++

            // imprime el titular del juego
            print("${nombresDeEquipos[eq1 - 1]} vs ${nombresDeEquipos[eq2 - 1]} ")

            // definir ganador y perdedor
            if ((1..2).random() == 1) {
                println("🥎 Gana: ${nombresDeEquipos[eq1 - 1]}")
                resultados[eq1 - 1][1]++
                resultados[eq2 - 1][2]++
            } else {
                println("🥎 Gana: ${nombresDeEquipos[eq2 - 1]}")
                resultados[eq2 - 1][1]++
                resultados[eq1 - 1][2]++
            }
        }
    }
}
