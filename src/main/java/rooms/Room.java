package rooms;

public abstract class Room {

    private String name;
    private boolean completed;


    public Room(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setAsCompleted() {
        this.completed = true;
    }

}
