package com.dmagdaleno.kalg.c1_fundamentals.p5

abstract class UnionFindTemplate(private val size: Int): UnionFind {

    protected val id: IntArray = IntArray(size){it}

    override fun connected(p: Int, q: Int): Boolean = find(p) == find(q)

    override fun find(p: Int): Int = id[p]

    override fun count(): Int = size

    fun print() {
        println(id.joinToString(prefix = "[", postfix = "]"))
    }
}