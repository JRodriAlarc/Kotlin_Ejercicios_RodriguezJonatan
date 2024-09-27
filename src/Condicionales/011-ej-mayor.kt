package Condicionales

fun main(){
    print("Ingrese un Primer Número: ");
    val primerNumeroE11: Double = readln().toDouble();
    print("Ingrese un Segundo Número: ");
    val segundoNumeroE12: Double = readln().toDouble();

    if (primerNumeroE11 == segundoNumeroE12){
        println(" --> Ambos Números $primerNumeroE11 y $segundoNumeroE12 son Iguales");
    } else if (primerNumeroE11 > segundoNumeroE12){
        println(" --> El Primer Número $primerNumeroE11 es Mayor que $segundoNumeroE12");
    } else{
        println(" --> El Segundo Número $segundoNumeroE12 es Mayor que $primerNumeroE11");
    }
}