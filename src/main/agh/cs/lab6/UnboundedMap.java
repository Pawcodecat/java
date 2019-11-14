package agh.cs.lab5;



import java.util.ArrayList;
import java.util.List;

public abstract class UnboundedMap extends AbstractWorldMap {
        protected List<Grass> grasses = new ArrayList<>();

    public UnboundedMap(List<Grass> grasses) {
        this.grasses = grasses;
    }


    public String toString() {
        Vector2d first = animals.get(0).getPosition();
        Vector2d last = animals.get(0).getPosition();
        for (Animal a : this.animals) {
            first = first.lowerLeft(a.getPosition());
            last = last.upperRight(a.getPosition());

        }
        return new MapVisualizer(this).draw(first, last);
    }

    public boolean isOccupied(Vector2d position) {
        boolean ifexist = super.isOccupied(position);
        if(!ifexist) {
            for (Grass a : this.grasses) {
                if (a.getPosition().equals(position)) {
                    return true;
                }
            }
        }
        return false;
    }





    public Object objectAt(Vector2d position) {
        Object object = super.objectAt(position);

        if(object == null){
            for (Grass r : this.grasses) {
                if (r.getPosition().equals(position)) {
                    return object;
                }
            }

        }
        return null;

    }
}