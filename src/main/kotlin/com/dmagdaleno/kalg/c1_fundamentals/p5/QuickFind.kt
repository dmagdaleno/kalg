package com.dmagdaleno.kalg.c1_fundamentals.p5

class QuickFind(private val size: Int): UnionFind {

    private val id: IntArray = IntArray(size){it}

    override fun union(p: Int, q: Int) {
        val pid = id[p]
        val qid = id[q]

        for(i in 0 until size) {
            if(id[i] == pid) {
                id[i] = qid
            }
        }
    }

    override fun connected(p: Int, q: Int): Boolean = find(p) == find(q)

    override fun find(p: Int): Int = id[p]

    override fun count(): Int = size

    fun print() {
        println(id.joinToString(prefix = "[", postfix = "]"))
    }
}