package Variables_y_Tipos

fun main(){
    while (true) {
        print("Ingrese un Número: ");
        var valorConvertir = readln();

        try {
            println(" --> El número $valorConvertir es una variable de tipo: ${valorConvertir::class.simpleName}")
        } catch(e: NumberFormatException) {
            println("Por favor, Ingrese un número válido.");
        }
    }

    //Falta Menejar lo que sucede cuandp el usuario Ingresa un String, o boolean
}