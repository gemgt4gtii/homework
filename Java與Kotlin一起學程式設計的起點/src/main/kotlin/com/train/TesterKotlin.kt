package com.train

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)

    println("Please enter number of tickets:")
    val number: Int = scanner.nextInt();

    println("How many round-trip tickets:")
    val round: Int = scanner.nextInt();

    var ticket = TesterKotlin();
    ticket.calculate(number,round);

}


class TesterKotlin {
    fun calculate(number: Int, round: Int) {
        val totalpay: Int = (number * 1000) + (round * 800)
        println("Total tickets:" + number + "\n" + "Round-trip:" + round + "\n" + "Total:" + totalpay)
    }
}