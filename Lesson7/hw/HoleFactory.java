package Lesson7.hw;

public class HoleFactory {

    public InterfaceRoundHole create(InterfaceRoundPeg peg){
        return new RoundHole(peg.radius());
    }

}
