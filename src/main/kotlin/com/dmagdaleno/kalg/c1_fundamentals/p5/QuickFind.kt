package com.dmagdaleno.kalg.c1_fundamentals.p5

class QuickFind(private val size: Int): UnionFindTemplate(size) {

    override fun union(p: Int, q: Int) {
        val pid = id[p]
        val qid = id[q]

        for(i in 0 until size) {
            if(id[i] == pid) {
                id[i] = qid
            }
        }
    }

}