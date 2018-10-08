package me.jtrenaud1s;

public class EntityMosquito extends Entity {
    public EntityMosquito(int health, int maxhealth) {
        super(health, maxhealth);
        setName("Mosquito");
        setHandler(this);
    }

    @Override
    public void onAttack(Entity attackedEntity) {
        attackedEntity.setHealth(attackedEntity.getHealth() - 1);
        System.out.println("You've been bitten by a Mosquito! You now have " + attackedEntity.getMaxhealth() + " Health!");
    }
}
