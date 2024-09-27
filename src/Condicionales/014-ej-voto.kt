package Condicionales

fun main(){
    print("Digite su Edad Actual: ");
    val edadVoto: Int = readln().toInt();

    if (edadVoto >= 18){
        println(" --> Usted es mayor de edad y puede votar");
    } else{
        println(" --> Usted es menor de edad y aún No puede votar");
    }
}