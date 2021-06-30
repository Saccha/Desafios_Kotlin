import java.util.Scanner

fun main(args: Array<String>) {
  var reader = Scanner(System.`in`)

  var a = reader.nextDouble()
  var b = reader.nextDouble()
    
  var m = ((a * 3.5) + (b * 7.5)) / (3.5 + 7.5)

  var r = "%.5f".format(m)
    
  println("MEDIA = ${r}")
}
