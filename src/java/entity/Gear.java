
package entity;


public class Gear {
    private int gearId;
    private int playerId;
    private String type;
    private String name;

    public Gear() {
    }

    public Gear(int gearId, int playerId, String type, String name) {
        this.gearId = gearId;
        this.playerId = playerId;
        this.type = type;
        this.name = name;
    }

    public Gear(int playerId, String type, String name) {
        this.playerId = playerId;
        this.type = type;
        this.name = name;
    }

    public int getGearId() {
        return gearId;
    }

    public void setGearId(int gearId) {
        this.gearId = gearId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
