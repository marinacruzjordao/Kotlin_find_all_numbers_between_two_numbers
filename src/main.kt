
fun find_all_numbers(n1: Int, n2: Int, mode: Int){
    if (mode == 2){
        var aux: Int = n1
        while(aux<n2+1) {
            println(aux)
            aux++
        }
    }else{
        var aux: Int = n2
        while(aux+1>n1) {
            println(aux)
            aux--
            }
    }
}

fun main(){
    println("Select two numbers to see all the numbers between these two numbers.")
    println("Select the first number:")
    var num1 = readLine()
    var n1 = num1.toString()
    var number1 = n1.toInt()

    println("Select the second number:")
    var num2 = readLine()
    var n2 = num2.toString()
    var number2 = n2.toInt()

    println("Decreasing(1) or Increasing(2) way? [1/2]")

    var aux=true
    var order= readLine()
    while(aux==true) {
        var order1 = order.toString()
        var mode = order1.toInt()

        if (mode == 1 || mode == 2 ){
            aux=false
        }else{
            println("To select order you need to choose (1) for decreasing or (2) for increasing")
            aux=true
            order = readLine()
        }

    }
    var order1 = order.toString()
    var mode = order1.toInt()
    find_all_numbers(number1,number2,mode)

}