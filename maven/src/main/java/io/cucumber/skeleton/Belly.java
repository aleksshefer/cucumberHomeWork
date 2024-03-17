package io.cucumber.skeleton;

public class Belly {
    private int cukes;
    private int waitingTime;
    private boolean isGrowl;
    private int timeToGrowl;

    public Belly() {
        this.timeToGrowl = 1;
    }

    public void eat(int cukes) {
        this.cukes += cukes;
        this.waitingTime = 0;
    }

    public void waitSomeTime(int timeToWait) {
        this.waitingTime += timeToWait;

        if (this.waitingTime >= 1) {
            this.isGrowl = true;
        }
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public boolean isGrowl() {
        return isGrowl;
    }

    public int getCukes() {
        return cukes;
    }
}
