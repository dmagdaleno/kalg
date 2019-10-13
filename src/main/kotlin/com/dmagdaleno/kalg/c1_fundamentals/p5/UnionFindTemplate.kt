package com.dmagdaleno.kalg.c1_fundamentals.p5

abstract class UnionFindTemplate(private val size: Int): UnionFind {

    protected val id: IntArray = IntArray(size){it}
    protected var count = size

    override fun connected(p: Int, q: Int): Boolean = find(p) == find(q)

    override fun count(): Int = count

    fun print() {
        println(id.joinToString(prefix = "[", postfix = "]"))
    }
}