package agh.cs.lab3;

import agh.cs.lab2.MoveDirection;

import java.util.Arrays;


public class OptionsParser {



    public static MoveDirection[] parse(String[] arguments) {
        MoveDirection[] argdir = new MoveDirection[arguments.length];
        int x=0;
        for (int i = 0; i < arguments.length; i++) {
            switch (arguments[i]) {
                case "f":
                    argdir[i] = MoveDirection.FORWARD;
                    break;
                case "forward":
                    argdir[i] = MoveDirection.FORWARD;
                    break;
                case "b":
                    argdir[i] = MoveDirection.BACKWARD;
                    break;
                case "backward":
                    argdir[i] = MoveDirection.BACKWARD;
                    break;
                case "l":
                    argdir[i] = MoveDirection.LEFT;
                    break;
                case "left":
                    argdir[i] = MoveDirection.LEFT;
                    break;
                case "r":
                    argdir[i] = MoveDirection.RIGHT;
                    break;
                case "right":
                    argdir[i] = MoveDirection.RIGHT;
                    break;
                default:
                    x--;
                    break;
            }
            x++;

        }
        return Arrays.copyOfRange(argdir, 0, x);
    }

}
