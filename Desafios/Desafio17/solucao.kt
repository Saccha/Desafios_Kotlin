import kotlin.math.abs

fun main(args: Array<String>) {
    
    var input : List<Int>
    var min : Int
    var x: Int
    var y: Int
    var h1: Int
    var m1: Int
    var h2: Int
    var m2: Int
    var t: Boolean = true
    
    while (t) {
        
        input = readLine()!!.split(" ").map { it.toInt() }
        
        val (h1, m1, h2, m2 ) = input
        
        var sum: Int = h1 + m1 + h2 + m2
    
        if (sum == 0) { 
        
            t =false
        }
        else if (input.isEmpty() ) {
        
            println("Sorry! Output limit exceeded!")
            
            t = false
        }
        else {
        
            x = if (h1 == 0) (24 * 60) + m1 else (h1 * 60) + m1 
            y = if (h2 == 0) (24 * 60) + m2 else (h2 * 60) + m2
            
            min = if (y > x) y - x else (24 * 60) - (x - y) 
            
            println(min)
        }
    }
} 
