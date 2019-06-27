package com.dmagdaleno.kalg.c1_fundamentals.p1

fun isPrime(n: Int): Boolean {
    if (n < 2) return false

    for(i in 2 until n) {
        if(i*i > n) break

        if(n%i == 0) return false
    }

    return true
}

fun main(args: Array<String>) {
    for(i in 0..101){
        println("$i is prime? ${isPrime(i)}")
    }
}