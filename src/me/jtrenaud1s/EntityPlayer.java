package me.jtrenaud1s;

public class EntityPlayer extends Entity{
    public EntityPlayer(int health, int maxhealth) {
        super(health, maxhealth);
        setName("Player");
        setHandler(this);
    }

    public EntityPlayer(String name, int health, int maxhealth) {
        super(health, maxhealth);
        setName(name);
        setHandler(this);
    }
    @Override
    public void onAttack(Entity attackedEntity) {
        attackedEntity.setHealth(attackedEntity.getHealth() - 1);
        System.out.println("Attacked " + attackedEntity.getName() + " for 10 damage: " + attackedEntity.getHealth() + "/" + attackedEntity.getMaxhealth());
        if (attackedEntity.getHealth() == 0) {
            System.out.println(attackedEntity.getName() + " is dead!");
        }
    }
}
