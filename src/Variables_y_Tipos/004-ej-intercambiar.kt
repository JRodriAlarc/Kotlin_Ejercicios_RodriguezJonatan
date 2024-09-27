package Variables_y_Tipos

fun main(){
    print("Digite un Primer Valor, una Cantidad, una Frase o un Caracter: ");
    var primerValor = readln();
    print("Digite un Segundo Valor, una Cantidad, una Frase o un Caracter: ");
    var segundoValor = readln();

    println(" --> Variable1: $primerValor");
    println(" --> Variable2: $segundoValor");

    var variableApoyo = primerValor;
    primerValor = segundoValor;
    segundoValor = variableApoyo;

    println(" --> La Primer Variable ahora vale: $primerValor");
    println(" --> La Segunda Variable ahora vale: $segundoValor");
}