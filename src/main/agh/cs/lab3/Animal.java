package agh.cs.lab3;

import agh.cs.lab2.MapDirection;
import agh.cs.lab2.MoveDirection;
import agh.cs.lab2.Vector2d;

public class Animal {
    private MapDirection orient = MapDirection.NORTH;
    private Vector2d position = new Vector2d(2, 2);


    public boolean isPossible(Vector2d v){
        Vector2d v_4_4= new Vector2d(4,4);
        Vector2d v_0_0= new Vector2d(0,0);
        if(  v.precedes(v_4_4) && v.follows(v_0_0) ) {
            return true;
        }
        return false;

    }

    public String toString() {
        return "Pozycja:" + this.position + "  Orientacja:" + this.orient;
    }

    public void  move(MoveDirection direction) {
        switch (direction) {
            case LEFT:
                this.orient=this.orient.previous();
                break;
            case RIGHT:
                this.orient=this.orient.next();
                break;
            case FORWARD:
                if(isPossible(this.position.add(orient.toUnitVector()))) {
                    Vector2d newPos = this.position.add(orient.toUnitVector());

                    this.position=newPos;
                    }
                    break;

                    case BACKWARD:
                        if(isPossible(this.position.add(orient.toUnitVectorback()))) {
                            Vector2d newPos = this.position.add(orient.toUnitVectorback());
                            switch (this.orient) {
                                case NORTH:

                                    this.position = this.position.add(new Vector2d(0, -1));
                                    break;
                                case SOUTH:

                                    this.position = this.position.add(new Vector2d(0, 1));
                                    break;
                                case WEST:

                                    this.position = this.position.add(new Vector2d(1, 0));
                                    break;
                                case EAST:

                                    this.position = this.position.add(new Vector2d(-1, 0));
                                    break;
                            }
                        }
                            break;

                }


    }

}