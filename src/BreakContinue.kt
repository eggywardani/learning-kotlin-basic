fun main() {
    var i = 0
    while (true){
        println("Hello ke $i")
        i++

        if (i > 1000) break
    }

    for (i in 1..100){
        if (i % 2 == 0)continue
        println(i)
    }
}