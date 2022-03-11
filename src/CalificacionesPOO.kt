/**
 * CETis108
 * Semestre: Febrero-Julio 2022
 * Asignatura: Desarrolla aplicaciones móviles
 * Profesor: Bidkar Aragón Cárdenas
 * Alumno(a): ?
 * Fecha: 28/02/22 10:38
 * Grupo: 6AV-PR
 */

/**
 * Boleta de calificaciones del 6AV-PR
 * Realiza un programa que registre las calificaciones y
 * asistencias parciales de n alumnos del grupo ?
 * Imprimir boleta de resultados de los 3 parciales
 * con el promedio de las calificaciones, y el porcentaje
 * de asistencia con respecto al máximo de asistencia grupal,
 * incluyendo cada materia que cursó en el periodo.
 */

fun main() {
    imprimirTitulo("Boleta de calificaciones CETis108")

    // crear el grupo
    val sextoVespertinoDeProgramacion =
        Grupo("6AV-PR", 'V', 6, "Programación")

    // crear alumnos
    val angela =
        Alumno(
            "Angela Y.",
            "Espinoza Cota",
            "683726487362",
            sextoVespertinoDeProgramacion
        )
    val paulina = Alumno(
        "Ana P.",
        "Graciano Wong",
        "873648768462",
        sextoVespertinoDeProgramacion
    )
    val hector = Alumno(
        "Hector J.",
        "Moroyoqui Quiñonez",
        "784362864328",
        sextoVespertinoDeProgramacion
    )

    // agregar alumnos al grupo
    sextoVespertinoDeProgramacion.alumnos.add(angela)
    sextoVespertinoDeProgramacion.alumnos.add(paulina)
    sextoVespertinoDeProgramacion.alumnos.add(hector)

    // crear materias
    val android = Materia("Desarrolla aplicaciones Android", 96)
    val ios = Materia("Desarrolla aplicaciones iOS", 96)

    // crear calificaciones
    var cal1 = Calificacion(angela, android)
    var cal2 = Calificacion(angela, ios)
    var cal3 = Calificacion(paulina, ios)
    var cal4 = Calificacion(paulina, android)
    var cal5 = Calificacion(hector, android)
    var cal6 = Calificacion(hector, ios)

    // crear boletas
    val boletaAngela = Boleta(
        sextoVespertinoDeProgramacion,
        angela,
        "2022-03-07"
    )
    val boletaPaulina = Boleta(
        sextoVespertinoDeProgramacion,
        paulina,
        "2022-03-07"
    )
    val boletaHector = Boleta(
        sextoVespertinoDeProgramacion,
        hector,
        "2022-03-07"
    )

    // agregar la calificaciones de cada alumno a su boleta
    boletaAngela.calificaciones.add(cal1)
    boletaAngela.calificaciones.add(cal2)
    boletaPaulina.calificaciones.add(cal3)
    boletaPaulina.calificaciones.add(cal4)
    boletaHector.calificaciones.add(cal5)
    boletaHector.calificaciones.add(cal6)

    // registrar calificaciones y asistencias
    for (calificacion in boletaAngela.calificaciones) {
        calificacion.simularCalificacionesYAsistencias()
    }
    for (calificacion in boletaPaulina.calificaciones) {
        calificacion.simularCalificacionesYAsistencias()
    }
    for (calificacion in boletaHector.calificaciones) {
        calificacion.simularCalificacionesYAsistencias()
    }

    boletaAngela.imprimir()
    boletaPaulina.imprimir()
    boletaHector.imprimir()
}

class Alumno(
    var nombre: String,
    var apellidos: String,
    var numeroDeControl: String,
    var grupo: Grupo
) {}

class Grupo(
    var nombre: String,
    var turno: Char,
    var semestre: Int,
    var carrera: String
) {
    var alumnos = ArrayList<Alumno>()
}

class Materia(
    var nombre: String,
    var horas: Int
) {}

class Boleta(
    var grupo: Grupo,
    var alumno: Alumno,
    var fecha: String
) {
    var calificaciones = ArrayList<Calificacion>()

    fun imprimir() {
        imprimirTitulo("Boleta de ${alumno.nombre}")
        for (cal in calificaciones) {
            println("Materia: ${cal.materia.nombre}")
            println("P1: ${cal.parcial1} P2: ${cal.parcial2} P3: ${cal.parcial3}")
            println("A1: ${cal.asistencias1} A2: ${cal.asistencias2} A3: ${cal.asistencias3}")
            println("-".repeat(60))
        }
    }
}

class Calificacion(
    var alumno: Alumno,
    var materia: Materia
) {
    var parcial1: Float? = null
    var parcial2: Float? = null
    var parcial3: Float? = null
    var asistencias1: Int? = null
    var asistencias2: Int? = null
    var asistencias3: Int? = null

    fun calcularPromedio(): Float {
        return (parcial1!! + parcial2!! + parcial3!!) / 3
    }

    fun simularCalificacionesYAsistencias() {
        parcial1 = (50..100).random().toFloat() / 10
        parcial2 = (50..100).random().toFloat() / 10
        parcial3 = (50..100).random().toFloat() / 10
        asistencias1 = (20..32).random()
        asistencias2 = (20..32).random()
        asistencias3 = (20..32).random()
    }
}
