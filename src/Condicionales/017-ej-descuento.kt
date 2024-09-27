package Condicionales

fun main(){
    print("Ingrese el Precio del Producto: ");
    val precioProducto: Double = readln().toDouble();

    if (precioProducto > 1000){
        println(" --> El precio final, aplicando el 20% de descuento es: $${precioProducto - (precioProducto * 0.2)}");
    } else{
        println(" --> El descuento no es aplicable a su compra, el costo total es: $${precioProducto}");
    }
}