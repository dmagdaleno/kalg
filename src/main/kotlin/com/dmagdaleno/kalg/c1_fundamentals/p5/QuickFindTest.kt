package com.dmagdaleno.kalg.c1_fundamentals.p5

fun main(args: Array<String>) {
    val quickFind = QuickFind(10)

    loadTestData().forEach { (p, q) ->
        if(!quickFind.connected(p, q)) {
            quickFind.union(p, q)
            quickFind.print()
        }
    }
}