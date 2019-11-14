package agh.cs.lab5;




public class Animal implements IMapElement {
    private MapDirection direction = MapDirection.NORTH;
    private Vector2d position = new Vector2d(2,2);
    private IWorldMap map;

    public Animal(IWorldMap map){
        this.map=map;
    }

    public Animal(IWorldMap map, Vector2d initialPosition){
        this.map=map;
        this.position=initialPosition;

    }
    public MapDirection getDirection() {
        return direction;
    }


   public Vector2d getPosition(){
        return this.position;
    }



    public String toString() {
        switch(this.direction){
            case SOUTH:
                return "S";
            case NORTH:
                return "N";
            case EAST:
                return "E";
            case WEST:
                return "W";
        }
        return null;
    }
    public String toStringLong() {
        return String.format("pozycja: %s | kierunek: %s", position.toString(), direction.toString());
    }
    public void  move(MoveDirection direction) {
        switch (direction) {
            case LEFT:
                this.direction =this.direction.previous();
                break;
            case RIGHT:
                this.direction =this.direction.next();
                break;
            case FORWARD: {
                Vector2d newPos = this.position.add(this.direction.toUnitVector());
                if (map.canMoveTo(newPos)) {


                    this.position = newPos;
                }
                ;
                break;
            }
            case BACKWARD: {
                Vector2d newPos = this.position.add(this.direction.toUnitVectorback());
                if (map.canMoveTo(newPos)) {


                    this.position = newPos;
                }
                ;
                break;
            }
        }


    }

}