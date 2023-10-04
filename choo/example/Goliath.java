package org.example;

public class Goliath extends Terran {
    Goliath() {
        super("Goliath", 5, 15, false, index++);

    }

    @Override
    public int attackUnit(Unit enemy) {
        enemy.setHp(enemy.getHp() - this.getAttackpoint());
        return enemy.getHp();
    }
}