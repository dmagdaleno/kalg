package com.dmagdaleno.kalg.c1_fundamentals.p1

import edu.princeton.cs.introcs.StdDraw

fun main(args: Array<String>) {
    drawFunction()
}

fun drawFunction() {
    val n = 100.toDouble()
    StdDraw.setXscale(.0, n)
    StdDraw.setYscale(.0, n*n)
    StdDraw.setPenRadius(.01)
    for(j in 1..n.toInt()) {
        val i = j.toDouble()
        StdDraw.point(i, i)
        StdDraw.point(i, i*i)
        StdDraw.point(i, i*Math.log(i))
    }
}