package Lesson7.hw;

public class Adapter implements InterfaceRoundPeg, InterfaceSquarePeg {

    private double radius;
    private final double side;

    public Adapter(InterfaceSquarePeg squarePeg) {
        double side = squarePeg.side();
        this.radius = Math.sqrt((Math.pow(side, 2) + Math.pow(side, 2)))/2;
        this.side = side;
    }

    @Override
    public double radius() {
        return radius;
    }

    @Override
    public double side() {
        return side;
    }
}
