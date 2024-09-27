package Variables_y_Tipos

fun main(){
    print("Ingrese el Primer Valor: ");
    val valor1E5: Double = readln().toDouble();
    print("Ingrese el Segundo Valor: ");
    val valor2E5: Double = readln().toDouble();
    print("Ingrese el Tercer Valor: ");
    val valor3E5: Double = readln().toDouble();

    println(" --> El Promedio de los 3 Valores $valor1E5, $valor2E5 y $valor3E5 es: ${(valor1E5 + valor2E5 + valor3E5) / 3}")
}