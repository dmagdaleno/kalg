package com.dmagdaleno.kalg.c1_fundamentals.p1

import com.dmagdaleno.kalg.extensions.print

fun main(args: Array<String>) {
    val array = arrayOf(1, 2, 3)

    val a = arrayOf(array.copyOf(), array.copyOf(), array.copyOf())
    println("A")
    a.print()

    val b = arrayOf(reverseArray(array.copyOf()), reverseArray(array.copyOf()), reverseArray(array.copyOf()))
    println("B")
    b.print()

    val c = matrixMultiplication(a, b)
    println("A x B")
    c.print()
}

fun matrixMultiplication(a: Array<Array<Int>>, b: Array<Array<Int>>): Array<Array<Int>> {
    val size = a.size
    val c = Array(3){Array(3){0}}

    for(i in 0 until size) {
        for(j in 0 until size) {
            for(k in 0 until size) {
                c[i][j] += a[i][k] * b[k][j]
            }
        }
    }

    return c
}