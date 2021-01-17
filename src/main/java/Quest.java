import players.Player;
import rooms.BadGuyRoom;
import rooms.Room;
import rooms.TreasureRoom;

import java.util.ArrayList;

public class Quest {

    private boolean complete;
    private ArrayList<Room> roomList;

    public Quest(boolean complete) {
        this.complete = complete;
        this.roomList = new ArrayList<>();

    }

    public void battle(Player player, Room room) {
        while (player.getHealthPoints() >= 0 && ((BadGuyRoom) room).getEnemy().getHealthPoints() >= 0) {
                player.attack(player, ((BadGuyRoom) room).getEnemy());
                ((BadGuyRoom) room).getEnemy().attack(player, ((BadGuyRoom) room).getEnemy());
        }
        ((BadGuyRoom)room).checkIfCompleted();
    }

    public void addRoomToRoomList(Room room) {
        this.roomList.add(room);
    }

    public ArrayList<Room> getRoomList() {
        return this.roomList;
    }

    public int getRoomListSize() {
        return this.roomList.size();
    }

    public boolean checkIfQuestCompleted() {
        int completedRoomCount = 0;
        for (Room room: this.roomList) {
            if (room.isCompleted()) {
                completedRoomCount += 1;
            }
        }
        if (completedRoomCount == getRoomListSize()){
            this.complete = true;
        }
        return this.complete;

    }

    public void quest(Player player) {
        for (Room room: this.roomList) {
            if (room instanceof TreasureRoom){
                player.addItemToInventory(((TreasureRoom) room).getTreasure());
                ((TreasureRoom) room).treasureCollected();
            }
            if (room instanceof BadGuyRoom){
                while (player.getHealthPoints() >= 0 && ((BadGuyRoom) room).getEnemy().getHealthPoints() >= 0) {
                    player.attack(player, ((BadGuyRoom) room).getEnemy());
                    ((BadGuyRoom) room).getEnemy().attack(player, ((BadGuyRoom) room).getEnemy());
                }
                ((BadGuyRoom)room).checkIfCompleted();
                }
            }
        checkIfQuestCompleted();
    }
}


