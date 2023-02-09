package Lesson7.hw;

public class RoundPeg implements InterfaceRoundPeg {

    private final double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    @Override
    public double radius() {
        return radius;
    }

}
