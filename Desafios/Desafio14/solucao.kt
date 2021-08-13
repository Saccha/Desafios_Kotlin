import java.util.Scanner;

fun main(args: Array<String>) {
  val input = readLine()!!
  val H = input.split(" ")[0].toDouble()
  val P = input.split(" ")[1].toDouble()
  
  val media: Double = H / P;
  
  println(String.format("%.2f", media));
}
