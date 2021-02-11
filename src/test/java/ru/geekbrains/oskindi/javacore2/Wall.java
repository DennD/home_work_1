package ru.geekbrains.oskindi.javacore2;

public class Wall extends Obstacle {
    private static String type = "Wall";
    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public void overcome(Participant participant) {
        participant.jump(this.heigth);

    }
}

