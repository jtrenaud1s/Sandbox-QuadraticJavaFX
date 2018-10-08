package me.jtrenaud1s;

import java.util.UUID;

public abstract class Entity implements OnEntityAttackHandler{
    private UUID id;
    private String name;
    private int health;
    private int maxhealth;
    private OnEntityAttackHandler handler;

    public Entity(int health, int maxhealth) {
        id = UUID.randomUUID();
        this.name = "Entity";
        this.health = health;
        this.maxhealth = maxhealth;
    }

    public Entity() {
        id = UUID.randomUUID();
        this.name = "Entity";
        this.health = health;
        this.maxhealth = maxhealth;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxhealth() {
        return maxhealth;
    }

    public void setMaxhealth(int maxhealth) {
        this.maxhealth = maxhealth;
    }

    public OnEntityAttackHandler getHandler() {
        return handler;
    }

    public void setHandler(OnEntityAttackHandler handler) {
        this.handler = handler;
    }

    public abstract void onAttack(Entity attackedEntity);

    public void attack(Entity entity) {
        onAttack(entity);
    }
}
