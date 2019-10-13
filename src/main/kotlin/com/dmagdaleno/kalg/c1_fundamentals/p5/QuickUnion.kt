package com.dmagdaleno.kalg.c1_fundamentals.p5

class QuickUnion(size: Int): UnionFindTemplate(size) {

    override tailrec fun find(p: Int): Int {
        return if(id[p] == p) {
            p
        }
        else {
            find(id[p])
        }
    }

    override fun union(p: Int, q: Int) {
        val rootOfP = find(p)
        val rootOfQ = find(q)
        
        id[rootOfP] = rootOfQ

        count--
    }

}