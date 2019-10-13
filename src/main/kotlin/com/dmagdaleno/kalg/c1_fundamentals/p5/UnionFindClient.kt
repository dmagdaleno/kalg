package com.dmagdaleno.kalg.c1_fundamentals.p5

class UnionFindClient(private val unionFind: UnionFind) {

    fun run() {
        loadTestData().forEach { (p, q) ->
            if(!unionFind.connected(p, q)) {
                unionFind.union(p, q)
                print()
            }
        }
    }

    private fun print() {
        val id = unionFind.id.joinToString(prefix = "[", postfix = "]")
        println("Id = $id, ${unionFind.count()} components")
    }
}