package Variables_y_Tipos

fun main(){
    print("Ingrese la Temperatura en Grados Celsius: ");
    val temperaturaE2: Double = readln().toDouble();

    println(" --> La Temperatura es de: ${(temperaturaE2*1.8)+32}° Fahrenheit")
}