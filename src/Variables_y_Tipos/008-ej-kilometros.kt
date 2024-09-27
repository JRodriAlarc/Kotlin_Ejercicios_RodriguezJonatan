package Variables_y_Tipos

fun main(){
    print("Ingrese la Distancia en metros: ");
    val distanciaKilom: Double = readln().toDouble();

    println(" --> La Distancia en Kilometros es: ${distanciaKilom / 1000}")
}