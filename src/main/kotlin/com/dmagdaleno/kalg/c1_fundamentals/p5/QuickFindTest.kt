package com.dmagdaleno.kalg.c1_fundamentals.p5

fun main(args: Array<String>) {
    val quickFind = QuickFind(10)

    loadData().forEach { (p, q) ->
        if(!quickFind.connected(p, q)) {
            quickFind.union(p, q)
            quickFind.print()
        }
    }
}

fun loadData(): List<Pair<Int, Int>> {
    return listOf(
            Pair(4,3),
            Pair(3,8),
            Pair(6,5),
            Pair(9,4),
            Pair(2,1),
            Pair(8,9),
            Pair(5,0),
            Pair(7,2),
            Pair(6,1),
            Pair(1,0),
            Pair(6,7)
    )
}