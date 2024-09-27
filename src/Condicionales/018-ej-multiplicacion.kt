package Condicionales

fun main(){
    print("Digita el número que deseas Multiplicar: ");
    val numeroMultiplicar: Double = readln().toDouble();
    print("Digita el número de veces que desea ser Multiplicado: ");
    val numeroMultiplicador: Double = readln().toDouble();

    var acumulador: Double = 0.0;
    var contador: Int = 0;

    while (contador < numeroMultiplicador){
        acumulador += numeroMultiplicar
        contador ++
    }
    println(" --> El resultado es: $acumulador");
}