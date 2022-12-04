package Hotel;

import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.List;

public class RoomRepository {
    //룸리스트
    private ArrayList<RoomEntity> roomList = new ArrayList<>();

    // 객실 정보를 받아서 룸리스트에 추가하는 메소드
    public void createRoom(int roomNumber, String roomSize, int roomPrice){
        roomList.add(new RoomEntity(roomNumber, roomSize, roomPrice));
    }

    //룸리스트 조회
    public List<RoomEntity> getRoomList() {
        return this.roomList;
    }



}
