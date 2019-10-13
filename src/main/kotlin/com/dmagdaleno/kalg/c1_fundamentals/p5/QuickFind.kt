package com.dmagdaleno.kalg.c1_fundamentals.p5

class QuickFind(private val size: Int): UnionFindTemplate(size) {

    override fun find(p: Int): Int = id[p]

    override fun union(p: Int, q: Int) {
        val pid = find(p)
        val qid = find(q)

        if(pid == qid) {
            return
        }

        for(i in 0 until size) {
            if(id[i] == pid) {
                id[i] = qid
            }
        }

        count--
    }

}