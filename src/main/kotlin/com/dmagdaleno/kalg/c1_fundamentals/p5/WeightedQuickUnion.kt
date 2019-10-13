package com.dmagdaleno.kalg.c1_fundamentals.p5

class WeightedQuickUnion(size: Int): UnionFindTemplate(size) {

    private val treeSize: IntArray = IntArray(size){1}

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
        
        if (rootOfP == rootOfQ) {
            return
        }

        if(treeSize[rootOfP] < treeSize[rootOfQ]) {
            id[rootOfP] = rootOfQ
            treeSize[rootOfQ] += treeSize[rootOfP]
        }
        else {
            id[rootOfQ] = rootOfP
            treeSize[rootOfP] += treeSize[rootOfQ]
        }

        count--
    }

}