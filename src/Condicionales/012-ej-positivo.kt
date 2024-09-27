package Condicionales

fun main(){
    print("Ingresa un Número para determinar si es Positivo, Negativo o es Cero: ");
    val numeroPosNeg: Double = readln().toDouble();

    if (numeroPosNeg === 0.0){
        println(" --> El Número $numeroPosNeg es Neutro");
    } else if (numeroPosNeg > 0){
        println(" --> El Número $numeroPosNeg es Positivo");
    } else{
        println(" --> El Número $numeroPosNeg es Negativo");
    }
}