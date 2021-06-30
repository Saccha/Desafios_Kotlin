import java.util.Scanner

fun main() {
  val valor = readLine()!!.toInt()
  
  numbers(valor)
}

val numbers:(Int) -> Unit = {valor ->
  val ntcem = mutableListOf<Int>()
  val ntcinq = mutableListOf<Int>()
  val ntvinte = mutableListOf<Int>()
  val ntdez = mutableListOf<Int>()
  val ntcinco = mutableListOf<Int>()
  val ntdois = mutableListOf<Int>()
  val ntum = mutableListOf<Int>()
  var qct : Int
  var total = valor
  var rest = total % 100

  qct = (total - rest) / 100
  ntcem.add(qct)

  total = rest
  rest %= 50
  qct = (total - rest) / 50
  ntcinq.add(qct)

  total = rest
  rest = total % 20
  qct = (total - rest) / 20
  ntvinte.add(qct)

  total = rest
  rest = total % 10
  qct = (total - rest) / 10
  ntdez.add(qct)

  total = rest
  rest = total % 5
  qct = (total - rest) / 5
  ntcinco.add(qct)

  total = rest
  rest = total % 2
  qct = (total - rest) / 2
  ntdois.add(qct)

  total = rest
  rest = total % 1
  qct = (total - rest) / 1
  ntum.add(qct)

  println("$valor")
  println("${ntcem[0]} nota(s) de R$ 100,00")
  println("${ntcinq[0]} nota(s) de R$ 50,00")
  println("${ntvinte[0]} nota(s) de R$ 20,00")
  println("${ntdez[0]} nota(s) de R$ 10,00")
  println("${ntcinco[0]} nota(s) de R$ 5,00")
  println("${ntdois[0]} nota(s) de R$ 2,00")
  println("${ntum[0]} nota(s) de R$ 1,00")
}
