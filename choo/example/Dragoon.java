package org.example;

public class Dragoon extends Protos {

    Dragoon() {
        super("Dragoon", 3, 15, false, index++);
    }

    @Override
    public int attackUnit(Unit enemy) {
        enemy.setHp(enemy.getHp() - this.getAttackpoint());
        return enemy.getHp();
    }
}
