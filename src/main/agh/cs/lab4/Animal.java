package agh.cs.lab4;


public class Animal {
    private MapDirection orient = MapDirection.NORTH;
    private Vector2d position = new Vector2d(2, 2);
    private IWorldMap map;

    public Animal(IWorldMap map){
        this.map=map;
    }

    public Animal(IWorldMap map, Vector2d initialPosition){
        this.map=map;
        this.position=initialPosition;

    }
    public MapDirection getDirection() {
        return orient;
    }


    Vector2d getPosition(){
        return this.position;
    }



    public String toString() {
        switch(this.orient){
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
        return String.format("pozycja: %s | kierunek: %s", position.toString(), orient.toString());
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
                if(map.canMoveTo(this.position.add(orient.toUnitVector()))) {
                    Vector2d newPos = this.position.add(orient.toUnitVector());

                    this.position=newPos;
                }
                break;

            case BACKWARD:
                if(map.canMoveTo(this.position.add(orient.toUnitVectorback()))) {
                    Vector2d newPos = this.position.add(orient.toUnitVectorback());

                    this.position=newPos;
                }
                break;
        }


    }

}