package Condicionales

fun main(){
    print("Ingresa una calificación númerica entre (0 - 100): ");
    val calificacionE15: Int = readln().toInt();

    when (calificacionE15){
        in 0..19 -> println(" --> Tu calificación es: F");
        in 20..39 -> println(" --> Tu calificación es: D");
        in 40..59 -> println(" --> Tu calificación es: C");
        in 60..79 -> println(" --> Tu calificación es: B");
        in 80..100 -> println(" --> Tu calificación es: A");
        else -> println(" --> Calificación No Valida, compruebe el Formato");
    }
}