package com.dmagdaleno.kalg.c1_fundamentals.p1

fun reverseArray(array: Array<Int>): Array<Int> {

    val lastIndex = array.size -1

    for(i in 0..array.size/2) {
        val lastUnchanged = lastIndex -i
        val temp = array[i]
        array[i] = array[lastUnchanged]
        array[lastUnchanged] = temp
    }

    return array
}

fun main(args: Array<String>) {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println(array.joinToString())
    reverseArray(array)
    println(array.joinToString())
}