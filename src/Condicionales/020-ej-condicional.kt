package Condicionales

fun main() {
    print("Ingrese un número entre 1 y 12 para conocer el Mes: ");
    val numeroMes: Int = readln().toInt();

    when(numeroMes) {
        1 -> println(" -> El mes es Enero");
        2 -> println(" -> El mes es Febrero");
        3 -> println(" -> El mes es Marzo");
        4 -> println(" -> El mes es Abril");
        5 -> println(" -> El mes es Mayo");
        6 -> println(" -> El mes es Junio");
        7 -> println(" -> El mes es Julio");
        8 -> println(" -> El mes es Agosto");
        9 -> println(" -> El mes es Septiembre");
        10 -> println(" -> El mes es Octubre");
        11 -> println(" -> El mes es Noviembre");
        12 -> println(" -> El mes es Diciembre");
        else -> println(" -> Número No valido");
    }
}