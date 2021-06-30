fun main(args: Array<String>) {

  val inteiros = mutableListOf<Int>()
//continue declarando as variaveis
  var pares = mutableListOf<Int>()
  var impares = mutableListOf<Int>()
  var positivos= mutableListOf<Int>()
  var negativos = mutableListOf<Int>()

  for (i in 1..5) { 
    var number = readLine()!!.toInt()
    if(number%2==0){
      pares.add(number)
    }
    if(number%2!=0){
      impares.add(number)
    }
    if(number > 0){
      positivos.add(number)
    }
    if( number < 0 ){
      negativos.add(number)
    }

  }

  println("${pares.size} valor(es) par(es)")
  println("${impares.size} valor(es) impar(es)")
  println("${positivos.size} valor(es) positivo(s)")
  println("${negativos.size} valor(es) negativo(s)")

}
