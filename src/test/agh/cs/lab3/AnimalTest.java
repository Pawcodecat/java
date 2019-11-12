package agh.cs.lab3;

import agh.cs.lab2.MoveDirection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnimalTest {

@Test
public void AnimalTest(){
                String[]arguments=new String[4];
                arguments[0]="r";
                arguments[1]="f";
                arguments[2]="f";
                arguments[3]="f";

                Animal cat = new Animal();
                MoveDirection[]argdir = new MoveDirection[arguments.length];
                argdir = OptionsParser.parse(arguments);

                for(MoveDirection a:argdir){
                        cat.move(a);
                }
                assertEquals(cat.toString(),"Pozycja:(4,2)  Orientacja:Wschód");
        }

 }


