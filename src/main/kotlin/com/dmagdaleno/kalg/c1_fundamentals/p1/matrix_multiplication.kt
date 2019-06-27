package com.dmagdaleno.kalg.c1_fundamentals.p1

import com.dmagdaleno.kalg.extensions.print

fun main(args: Array<String>) {
    val array = arrayOf(1, 2, 3)
    val a = arrayOf(array.copyOf(), array.copyOf(), array.copyOf())
    a.print()
}