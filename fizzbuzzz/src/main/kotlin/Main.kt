fun main(){
    var i = 0
    while (i < 100){
        i++

        if (i % 3 == 0 && i % 5 == 0){
            println("fizzBuzz")
        }else{
            if (i % 3 ==0){
                println("fizz")
            }else{
                if ( i % 5 == 0){
                    println("buzz")
                }else{
                    println(i)
                }

            }
        }
    }
}