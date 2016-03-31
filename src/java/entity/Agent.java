
package entity;

import java.util.ArrayList;
import java.util.List;


public class Agent {
    private int agentId;
    private String name;
    private int lvl;
    private int dZLvl;
    private List<Weapon> weapons = new ArrayList();
    private List<Gear> gear = new ArrayList();
    private int guildId;
    private String guildName;
    private int userId;

    public Agent(int agentId, String name, int lvl, int dZLvl, int userId) {
        this.agentId = agentId;
        this.name = name;
        this.lvl = lvl;
        this.dZLvl = dZLvl;
        this.userId = userId;
    }

    public Agent(String name, int lvl, int dZLvl, int userId) {
        this.name = name;
        this.lvl = lvl;
        this.dZLvl = dZLvl;
        this.userId = userId;
    }

    public Agent() {
    }
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getdZLvl() {
        return dZLvl;
    }

    public void setdZLvl(int dZLvl) {
        this.dZLvl = dZLvl;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public List<Gear> getGear() {
        return gear;
    }

    public void setGear(List<Gear> gear) {
        this.gear = gear;
    }

    public int getGuildId() {
        return guildId;
    }

    public void setGuildId(int guildId) {
        this.guildId = guildId;
    }

    public String getGuildName() {
        return guildName;
    }

    public void setGuildName(String guildName) {
        this.guildName = guildName;
    }
    
    
}
