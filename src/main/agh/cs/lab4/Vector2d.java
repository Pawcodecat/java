package agh.cs.lab4;

public class Vector2d {
    public final int x;
    public final int y;

    public Vector2d(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
    public boolean precedes(Vector2d other) {
        if (this.x <= other.x && this.y <= other.y)
            return true;
        return false;
    }

   public  boolean follows(Vector2d other){
        if(this.x>=other.x && this.y>=other.y)
            return true;
        return false;
    }
    Vector2d upperRight(Vector2d V){
    int x, y;
        if(this.x>V.x)
            x=this.x;
        else
            x=V.x;
        if(this.y>V.y)
            y=this.y;
        else
            y=V.y;
        Vector2d returned = new Vector2d(x,y);
        return returned;
    }

    Vector2d lowerLeft(Vector2d V){
        int x, y;
        if(this.x<V.x)
            x=this.x;
        else
            x=V.x;
        if(this.y<V.y)
            y=this.y;
        else
            y=V.y;
        Vector2d returned = new Vector2d(x,y);
        return returned;
    }
    public Vector2d add(Vector2d V){
        int x=this.x+V.x;
        int y=this.y+V.y;
        Vector2d returned = new Vector2d(x,y);
        return returned;
    }

    Vector2d subtract(Vector2d V){
        int x=this.x - V.x;
        int y=this.y - V.y;
        Vector2d returned = new Vector2d(x,y);
        return returned;
    }
    public boolean equals(Object other){
        if(this == other)
            return true;
        if(!(other instanceof Vector2d))
            return false;

        Vector2d that = (Vector2d) other;
        if(this.x == that.x && this.y == that.y)
            return true;
        else
            return false;
    }
    Vector2d opposite(){
        Vector2d returned = new Vector2d(-this.x,-this.y);
                return returned;
    }
}




