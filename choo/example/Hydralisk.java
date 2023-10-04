package org.example;

public class Hydralisk extends Zerg {

    Hydralisk() {
        super("Hydralisk", 3, 7, false, index++);
    }

    @Override
    public int attackUnit(Unit enemy) {
        enemy.setHp(enemy.getHp() - this.getAttackpoint());
        return enemy.getHp();
    }
}
