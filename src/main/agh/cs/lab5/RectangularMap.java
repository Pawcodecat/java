package agh.cs.lab5;




import java.util.ArrayList;
import java.util.List;

public class RectangularMap extends AbstractWorldMap {
    private Vector2d topRightCorner;
    private final Vector2d bottomLeftCorner = new Vector2d(0,0);



    public Vector2d getTopRightCorner(){
        return this.topRightCorner;
    }
    public Vector2d getBottomLeftCorner(){
        return this.bottomLeftCorner;
    }


    public RectangularMap(int width, int height){
        this.topRightCorner = new Vector2d(width-1, height-1);
    }

    /**
     * Indicate if any object can move to the given position.
     *
     * @return True if the object can move to that position.
     */
    public boolean canMoveTo(Vector2d position){
        return position.precedes(this.topRightCorner)
                && position.follows(this.bottomLeftCorner)
                && !this.isOccupied(position);
    }
    /**
     * Place a animal on the map.
     *
     * @param animal
     *            The animal to place on the map.
     * @return True if the animal was placed. The animal cannot be placed if the map is already occupied.
     */


    /**
     * Move the animal on the map according to the provided move directions. Every
     * n-th direction should be sent to the n-th animal on the map.
     *
     * @param directions
     *            Array of move directions.
     */

    /**
     * Return true if given position on the map is occupied. Should not be
     * confused with canMove since there might be empty positions where the animal
     * cannot move.
     *
     * @param position
     *            Position to check.
     * @return True if the position is occupied.


    /**
     * Return an object at a given position.
     *
     * @param position
     *            The position of the object.
     * @return Object or null if the position is not occupied.
     */
   
}
