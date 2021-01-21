package com.company.statements;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getInMinutes() {
        int allMinutes;
        allMinutes = hours * 60 + minutes;
        return allMinutes;
    }

    public int getInSeconds() {
        int allSeconds;
        allSeconds = getInMinutes() * 60 + seconds;
        return allSeconds;
    }

    public boolean earlierThan(Time time) {
        return (getInSeconds() < time.getInSeconds());
    }

    @Override
    public String toString() {
        return + hours + ":" + minutes + ":" + seconds;
    }
}
