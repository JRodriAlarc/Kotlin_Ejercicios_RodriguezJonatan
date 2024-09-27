package Variables_y_Tipos

fun main(){
    print("Ingrese un Número entre 1 y 7: ");
    val diaSemana: Int = readln().toInt();

    when (diaSemana) {
        1 -> println(" --> Día Lunes");
        2 -> println(" --> Día Martes");
        3 -> println(" --> Día Miercoles");
        4 -> println(" --> Día Jueves");
        5 -> println(" --> Día Viernes");
        6 -> println(" --> Día Sabado");
        7 -> println(" --> Día Domingo");
        else -> println(" --> Número No Valido. Intenta de nuevo");
    }
}