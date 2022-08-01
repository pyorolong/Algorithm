package com.pyorolong.algorithm.hackerank.easy

import java.util.*

class CatsAndMouse {
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)

        val q = scan.nextLine().trim().toInt()

        for (qItr in 1..q) {
            val xyz = scan.nextLine().split(" ")

            val x = xyz[0].trim().toInt()

            val y = xyz[1].trim().toInt()

            val z = xyz[2].trim().toInt()

            val result = catAndMouse(x, y, z)

            println(result)
        }
    }


    fun catAndMouse(x: Int, y: Int, z: Int): String {
        val a = Math.abs(x - z)
        val b = Math.abs(y - z)

        return if (a < b) {
            "Cat A"
        } else if (a > b) {
            "Cat B"
        } else {
            "Mouse"
        }
    }
}