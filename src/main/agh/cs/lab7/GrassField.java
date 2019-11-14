package agh.cs.lab6;

import java.util.*;

public class GrassField extends AbstractWorldMap {

    protected List<Grass> grasses = new ArrayList<>();
    protected Map<Vector2d, Grass> grassesMap = new HashMap<>();

    public GrassField(int n){
        for(int i=0; i < n; i++) {
            addGrass(n);
        }
    }

    private void addGrass(int size){
        Vector2d position;
        Random r = new Random();
        do {
            int x = r.nextInt((int) (Math.sqrt(size * 10)));
            int y = r.nextInt((int) (Math.sqrt(size * 10)));
            position = new Vector2d(x, y);
        }
        while (this.isOccupied(position));
        Grass g = new Grass(position);
        this.grasses.add(g);
        this.grassesMap.put(g.getPosition(), g);
    }

    public Grass grassAt(Vector2d position){
        return this.grassesMap.get(position);
    }

    public Object objectAt(Vector2d position){
        Object object = super.objectAt(position);
        if(object!=null) return object;

        return this.grassAt(position);
    }

    public Vector2d getTopRightCorner(){
        int max_x=Integer.MIN_VALUE;
        int max_y=Integer.MIN_VALUE;
        for(Animal a : this.animals){
            if(a.getPosition().x > max_x) max_x=a.getPosition().x;
            if(a.getPosition().y > max_y) max_y=a.getPosition().y;
        }
        for(Grass r : this.grasses){
            if(r.getPosition().x > max_x) max_x=r.getPosition().x;
            if(r.getPosition().y > max_y) max_y=r.getPosition().y;
        }
        return new Vector2d(max_x, max_y);
    }
    public Vector2d getBottomLeftCorner(){
        int min_x=Integer.MAX_VALUE;
        int min_y=Integer.MAX_VALUE;
        for(Animal a : this.animals){
            if(a.getPosition().x < min_x) min_x=a.getPosition().x;
            if(a.getPosition().y < min_y) min_y=a.getPosition().y;
        }
        for(Grass r : this.grasses){
            if(r.getPosition().x < min_x) min_x=r.getPosition().x;
            if(r.getPosition().y < min_y) min_y=r.getPosition().y;
        }
        return new Vector2d(min_x, min_y);
    }

    public void run(MoveDirection[] directions){
        int i=0;
        int animalNumber = this.animals.size();
        for(MoveDirection dir : directions){

            Animal animalToMove = this.animals.get(i);
            this.animalsMap.remove(animalToMove.getPosition());
            animalToMove.move(dir);
            this.animalsMap.put(animalToMove.getPosition(), animalToMove);
            i=(i+1)%animalNumber;

            Grass g = this.grassAt(this.animals.get(i).getPosition());
            if(g != null) {
                this.addGrass(this.grasses.size());
                this.grasses.remove(g);
                this.grassesMap.remove(g.getPosition());
            }
        }
    }


    public boolean canMoveTo(Vector2d position){
        return !(this.objectAt(position) instanceof Animal);
    }



}
