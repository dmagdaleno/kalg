package com.dmagdaleno.kalg.c1_fundamentals.p1

fun Array<Int>.binarySearch(n: Int): Int {
    var lower = 0
    var higher = this.size -1

    while (lower <= higher) {
        val middle = lower + (higher-lower)/2

        println("l=$lower, m=$middle, h=$higher")

        when {
            n < this[middle] -> higher = middle -1

            n > this[middle] -> lower = middle +1

            else -> return middle
        }

    }

    return -1
}

fun main(args: Array<String>) {
    for (n in -2..11){
        println("###\nnumber: $n")
        val i = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).binarySearch(n)
        println("index: $i\n")
    }
}