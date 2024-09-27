package Variables_y_Tipos

import kotlin.math.pow

fun main(){
    print("Ingrese el Radio de la Circunferencia: ");
    val radioE3: Double = readln().toDouble();

    println(" --> El área del Círculo es: ${3.1416*(radioE3.pow(2))} u²")
}