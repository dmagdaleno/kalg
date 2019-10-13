package com.dmagdaleno.kalg.c1_fundamentals.p5

interface UnionFind {

    val id: IntArray

    fun union(p: Int, q: Int)

    fun connected(p: Int, q: Int): Boolean

    fun find(p: Int): Int

    fun count(): Int
}