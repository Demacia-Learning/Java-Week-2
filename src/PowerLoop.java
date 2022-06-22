package src;

import java.lang.Math;

class PowerLoop {
    private int number;

    PowerLoop(int number) {
        this.number = number;
    }

    public void printPowerLoop() {
        for (int iteration = 0; iteration <= number; iteration++) {
            System.out.println((int) Math.pow(iteration, 2));
        }
    }
}