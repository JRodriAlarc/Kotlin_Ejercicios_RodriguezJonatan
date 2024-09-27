package Variables_y_Tipos

fun main(){
    print("Ingresa un Número: ")
    val numeroEvaluar: Int = readln().toInt()

    if (numeroEvaluar % 2 == 0){
        println(" --> El número $numeroEvaluar es PAR");
    } else {
        println(" --> El número $numeroEvaluar es IMPAR")
    }
}