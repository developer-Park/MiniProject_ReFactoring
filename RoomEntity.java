package Hotel;

public class RoomEntity {
    // 객실호수, 사이즈, 가격
    private int roomNumber;
    private String roomSize;
    private int roomPrice;

    //초기화
    public RoomEntity(int roomNumber, String roomSize, int roomCharge) {
        super();
        this.roomNumber = roomNumber;
        this.roomSize = roomSize;
        this.roomPrice = roomCharge;
    }

    public int getRoomNumber(){

        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) { //없어도 되는 set 같음.
        this.roomNumber =roomNumber;
    }

    public String getRoomSize(){

        return roomSize;
    }

    public void setRoomSize(String roomSize) {  //없어도 되는 set 같음.
        this.roomSize = roomSize;
    }

    public int getRoomCharge(){

        return roomPrice;
    }

    public void setRoomCharge(int roomCharge) { //없어도 되는 set 같음.
        this.roomPrice = roomCharge;
    }

    @Override
    public String toString() {
        return"Room[호수 : " + roomNumber + "호" + "사이즈 : " + roomSize + "숙박비 : " + roomPrice + "원" + "]";
    }
}
