import enemies.Enemy;
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

    public void battle(Player player, Enemy enemy, BadGuyRoom room) {
        while (player.getHealthPoints() >= 0 && enemy.getHealthPoints() >= 0) {
            if (!room.checkIfCompleted());
            player.attack(player, enemy);
            enemy.attack(player, enemy);
        }
        room.checkIfCompleted();
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

    public boolean checkIfCompleted() {
        int roomCount = 0;
        for (Room room: this.roomList) {
            if (room.isCompleted()) {
                roomCount += 1;
            }
        }
        if (roomCount == getRoomListSize()){
            this.complete = true;
        }
        return this.complete;

    }

    public void quest(ArrayList<Room> roomList, Player player) {
        for (Room room: roomList) {
            if (room instanceof TreasureRoom){
                player.addItemToInventory(((TreasureRoom) room).getTreasure());
                ((TreasureRoom) room).treasureCollected();
            }else{
                battle(player, ((BadGuyRoom) room).getEnemy(), ((BadGuyRoom) room));
            }
        }
        checkIfCompleted();
    }
}

//if (room instanceof BadGuyRoom){
//        battle(player, ((BadGuyRoom) room).getEnemy(), ((BadGuyRoom) room));
//    }
