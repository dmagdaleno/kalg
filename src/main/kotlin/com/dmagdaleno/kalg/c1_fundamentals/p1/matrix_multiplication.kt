package com.dmagdaleno.kalg.c1_fundamentals.p1

fun main(args: Array<String>) {
    val array = arrayOf(1, 2, 3)
    val a = arrayOf(array.copyOf(), array.copyOf(), array.copyOf())
    a.print()
}

fun <T> Array<Array<T>>.print() {
    println(this.joinToString(separator = "\n") {
        array ->  array.joinToString(prefix = "| ", postfix = " |")
    })
}