package Condicionales

fun main(){
    print("Digite el Primer Número: ");
    val primerNumeroE19: Double = readln().toDouble();
    print("Digite el Segundo Número: ");
    val segundoNumeroE19: Double = readln().toDouble();
    print("Digite el Tercer Número: ");
    val tercerNumeroE19: Double = readln().toDouble();

    if (primerNumeroE19 == segundoNumeroE19 && segundoNumeroE19 == tercerNumeroE19){
        println(" -> Los 3 Números son iguales")
    } else if (primerNumeroE19 > segundoNumeroE19 && primerNumeroE19 > tercerNumeroE19){
        println(" -> El primer número $primerNumeroE19 es el Digito de mayor valor")
        if (segundoNumeroE19 > tercerNumeroE19){
            println(" -> El segundo número $segundoNumeroE19 es el Digito intermedio");
            println(" -> El tercer número $tercerNumeroE19 es el Digito de menor valor");
        } else{
            println(" -> El tercer número $tercerNumeroE19 es el Digito intermedio");
            println(" -> El segundo número $segundoNumeroE19 es el Digito de menor valor");
        }
    } else if (segundoNumeroE19 > primerNumeroE19 && segundoNumeroE19 > tercerNumeroE19){
        println(" -> El segundo número $segundoNumeroE19 es el Digito de mayor valor")
        if (primerNumeroE19 > tercerNumeroE19){
            println(" -> El primer número $primerNumeroE19 es el Digito intermedio");
            println(" -> El tercer número $tercerNumeroE19 es el Digito de menor valor");
        } else {
            println(" -> El tercer número $tercerNumeroE19 es el Digito intermedio");
            println(" -> El primer número $primerNumeroE19 es el Digito de menor valor");
        }
    } else{
        println(" -> El tercer número $tercerNumeroE19 es el Digito de mayor valor");
        if (primerNumeroE19 > segundoNumeroE19){
            println(" -> El primer número $primerNumeroE19 es el Digito intermedio");
            println(" -> El segundo número $segundoNumeroE19 es el Digito de menor valor");
        } else {
            println(" -> El segundo número $segundoNumeroE19 es el Digito intermedio");
            println(" -> El primer número $primerNumeroE19 es el Digito de menor valor");
        }
    }
}