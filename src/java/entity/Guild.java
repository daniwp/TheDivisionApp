
package entity;

public class Guild {
    private int guildId;
    private String name;

    public Guild(int guildId, String name) {
        this.guildId = guildId;
        this.name = name;
    }

    public Guild(String name) {
        this.name = name;
    }

    public Guild() {
    }
    
    public int getGuildId() {
        return guildId;
    }

    public void setGuildId(int guildId) {
        this.guildId = guildId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
