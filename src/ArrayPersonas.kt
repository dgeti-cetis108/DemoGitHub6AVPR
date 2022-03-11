/**
 * CETis108
 * Semestre: Febrero-Julio 2022
 * Asignatura: Desarrolla aplicaciones móviles
 * Profesor: Bidkar Aragón Cárdenas
 * Alumno(a): ?
 * Fecha: 28/02/22 9:30
 * Grupo: 6AV-PR
 */


fun main() {
    /**
     * Definir un arreglo de n componentes de tipo float
     * que representen las alturas de 5 personas.
     * Obtener el promedio de las mismas. Contar cuántas
     * personas son más altas que el promedio y cuántas más bajas.
     */
    println("Altura de personas")
    var alturas = Array<Float>(5) { 0.0f }
    var promedioDeAlturas = 0.0f
    var sumaDeAlturas = 0.0f
    var mayoresAlPromedio = 0
    var menoresAlPromedio = 0
    for (persona in 0..4) {
        val msg = "¿Cual es la altura de la persona ${persona+1}?"
        alturas[persona] = pedirFloatPorTeclado(msg)
        sumaDeAlturas += alturas[persona]
    }
    promedioDeAlturas = sumaDeAlturas/5

    for (altura in alturas) {
        if (altura > promedioDeAlturas)
            mayoresAlPromedio++
        else if (altura < promedioDeAlturas)
            menoresAlPromedio++
    }

    println("El promedio de altura de las personas es $promedioDeAlturas")
    println("$mayoresAlPromedio son mayores que el promedio de altura")
    println("$menoresAlPromedio son menores que el promedio de altura")
}