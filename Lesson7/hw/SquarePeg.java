package Lesson7.hw;

public class SquarePeg implements InterfaceSquarePeg {

    private final double side;

    public SquarePeg(double side) {
        this.side = side;
    }

    @Override
    public double side() {
        return side;
    }

}
