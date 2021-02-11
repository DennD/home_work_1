package ru.geekbrains.oskindi.javacore2;

public class Treadmill extends Obstacle {
    private static String type = "Treadmill";
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void overcome(Participant participant) {
        participant.run(this.distance);
    }
}
