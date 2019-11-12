package agh.cs.lab1;

import java.util.Arrays;

import static javax.swing.JSplitPane.RIGHT;

public class World {

    public static void main(String[] arguments) {
        int x = 0;

        System.out.println("Start");
        Direction[] argdir = new Direction[arguments.length];

        for (int i = 0; i < arguments.length; i++) {
            switch (arguments[i]) {
                case "f":
                    argdir[i] = Direction.FORWARD;
                    break;
                case "b":
                    argdir[i] = Direction.BACKWARD;
                    break;
                case "l":
                    argdir[i] = Direction.LEFT;
                    break;
                case "r":
                    argdir[i] = Direction.RIGHT;
                    break;
                default:
                    x--;
                    break;
            }
            x++;

        }

        run(argdir,x);
    }

    public static void run(Direction[] argdir , int x){
        for (int i = 0; i <x ; i++) {
            switch(argdir[i]){
                case FORWARD:
                    System.out.println("zwierzak idzie do przodu");

                    break;
                case BACKWARD:
                    System.out.println("zwierzak idzie do tylu");

                    break;
                case LEFT:
                    System.out.println("zwierzak skręca w lewo");

                    break;
                case RIGHT:
                    System.out.println("zwierzak skręca w prawo");
                    break;


            }
        }
        System.out.println("Stop");
    }





    }

