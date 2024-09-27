package Condicionales

fun main() {
    print("Ingrese el año que desea consultar: ");
    val anioBisiesto: Int = readln().toInt();

    if (anioBisiesto % 4 == 0){
        println(" --> El año $anioBisiesto es bisiesto");
    } else {
        println(" --> El año $anioBisiesto, No es un año bisiesto");
    }
}