package agh.cs.lab3;

import agh.cs.lab2.MoveDirection;

public class World3 {
    public static void main(String[] arguments) {
        Animal cat = new Animal();
        System.out.println(cat);
        cat.move(MoveDirection.RIGHT);
        cat.move(MoveDirection.FORWARD);
        cat.move(MoveDirection.FORWARD);
        cat.move(MoveDirection.FORWARD);
        System.out.println(cat);
        MoveDirection[] argdir = new MoveDirection[arguments.length];
        argdir = OptionsParser.parse(arguments);
        for (MoveDirection a:argdir) {
            System.out.println(a);

        }

    }

}
