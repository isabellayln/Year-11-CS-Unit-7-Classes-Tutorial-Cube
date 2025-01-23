public class Cube {

    private int side;

    public Cube(int side){
        this.side = side;
        if(side<1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
    }

    public Cube(){
        this.side = 1;
    }

    public int getSide(){
        return side;
    }

    public void setSide(int side){
        this.side = side;
        if(side<1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
    }

    public int calculateSurfaceArea(){
        return 6*(getSide()*getSide());
    }

    public int calculateVolume(){
        return (int) (Math.pow(getSide(),3));
    }

    public String toString(){
        return "Cube{side=" + getSide() + "}";
    }



}
