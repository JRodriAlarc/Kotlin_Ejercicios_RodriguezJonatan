package Condicionales

fun main(){
    print("Ingrese un Primer Valor: ");
    val primerValorE13: Double = readln().toDouble();
    print("Ingrese un Segundo Valor: ");
    val segundoValorE13: Double = readln().toDouble();

    println(" --> La Suma de $primerValorE13 + $segundoValorE13 = ${primerValorE13 + segundoValorE13}");
    println(" --> La Resta de $primerValorE13 - $segundoValorE13 = ${primerValorE13 - segundoValorE13}");
    println(" --> La Multiplicación de $primerValorE13 * $segundoValorE13 = ${primerValorE13 * segundoValorE13}");
    println(" --> La División de $primerValorE13 / $segundoValorE13 = ${primerValorE13 / segundoValorE13}");
}