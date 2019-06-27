package com.dmagdaleno.kalg.extensions

fun <T> Array<Array<T>>.print() {
    println(this.joinToString(separator = "\n") {
        array ->  array.joinToString(prefix = "| ", postfix = " |")
    })
}