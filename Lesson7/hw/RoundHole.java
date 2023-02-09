package Lesson7.hw;

public class RoundHole implements InterfaceRoundHole {

    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    @Override
    public double radius() {
        return radius;
    }

}
