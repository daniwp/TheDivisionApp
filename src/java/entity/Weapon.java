
package entity;

public class Weapon {
    private int weaponId;
    private int playerId;
    private String type;
    private String name;

    public Weapon(int weaponId, int playerId, String type, String name) {
        this.weaponId = weaponId;
        this.playerId = playerId;
        this.type = type;
        this.name = name;
    }

    public Weapon(int playerId, String type, String name) {
        this.playerId = playerId;
        this.type = type;
        this.name = name;
    }

    public Weapon() {
    }
    
    public int getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
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
