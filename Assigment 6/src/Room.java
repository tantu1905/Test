public class Room {
    private int dailyCost;
    String roomType;
    boolean hasBath;
    int roomSize;
    public void setCost(int dailyCost){this.dailyCost=dailyCost;}
    public int getCost(){return dailyCost;}
}
class Single extends Room{
    Single(){
        super();
        roomType="Single";
        hasBath = false;
        roomSize=15;
        setCost(100);
    }
}
class Double extends Room{
    Double(){
        super();
        roomType="Double";
        hasBath=false;
        roomSize=30;
        setCost(180);
    }
}