
package testingguesthouse;
public class Roomc {
    public int no_Room;
    public String roomtype;
    public String bed;
    public String air;
    public String fan;
    public double price;
    public Roomc(int no_room,String roomtype,String bed,String air,String fan,double price){
        this.no_Room=no_room;
        this.roomtype=roomtype;
        this.bed=bed;
        this.air=air;
        this.fan=fan;
        this.price=price;
    }
    public void setNo_room(int no_room){
        this.no_Room=no_room;
    }
    public void setRoomtype(String roomtype){
        this.roomtype=roomtype;
    }
    public void setBed(String air){
        this.air=air;
    }
    public void setFan(String fan){
        this.fan=fan;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getNo_Room(){
        return no_Room;
    }
    public String getRoomtype(){
        return roomtype;
    }
    public String getbed(){
        return bed;
    }
    public String getAir(){
        return air;
    }
    public String getFan(){
        return fan;
    }
    public double getPrice(){
        return price;
    }
}
