package Lesson7.hw;

public class Main {
    public static void main(String[] args) {

        /**
         // Есть машина, которая умеет делать круглые отверстия для круглых колышков (RoundPeg).
         // Также у нас есть квадратные колышки (SquareSide).
         // Задача: научить машину делать отверстия для квадратных колышков (реализовать паттерн адаптер).
         // Нужно "адаптировать" интерфейс SquarePeg под интерфейс RoundPeg
         */

        HoleFactory holeMachine = new HoleFactory();
        InterfaceRoundPeg peg = new RoundPeg(2.0);
        InterfaceRoundHole hole = holeMachine.create(peg);
        System.out.println(hole.radius());

        InterfaceSquarePeg squarePeg = new SquarePeg(5.0);
        InterfaceRoundHole hole2 = holeMachine.create(new Adapter(squarePeg));
        System.out.println(hole2.radius());
    }
}

