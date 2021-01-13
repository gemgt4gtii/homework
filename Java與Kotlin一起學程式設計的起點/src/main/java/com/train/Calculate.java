package com.train;

public class Calculate {
    int number;
    int round;
    int totalpay;

    public Calculate(int number, int round) {
        this.number = number;
        this.round = round;

        totalpay = (number * 1000) + (((round * 800)) );

        System.out.println(
                "Total tickets:" + number + "\n" + "Round-trip:" + round + "\n" + "Total:" + totalpay);
    }


}
