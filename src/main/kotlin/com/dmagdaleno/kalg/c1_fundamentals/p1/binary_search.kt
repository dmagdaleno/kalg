package com.dmagdaleno.kalg.c1_fundamentals.p1

fun Array<Int>.binarySearch(n: Int): Int {
    var i = -1

    var lower = 0
    var higher = this.size

    if(n < 0 || n > this[higher-1])
        return i

    while (lower < higher) {
        val middle = (higher+lower)/2

        println("l=$lower, m=$middle, h=$higher")

        if(this[middle] < n){
            lower = middle
        }
        else if(this[middle] > n){
            higher = middle
        }
        else {
            i = middle
            break
        }
    }

    return i
}

fun main(args: Array<String>) {
    for (n in -2..11){
        println("###\nnumber: $n")
        val i = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).binarySearch(n)
        println("index: $i\n")
    }
}