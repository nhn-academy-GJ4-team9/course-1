package org.example;

public class Unit {

    private String name = "";
    private int attackpoint = 0;
    private int hp = 0;
    private boolean canfly = false;

    private int number = 0;

    public String getName() {
        return name;
    }

    public int getAttackpoint() {
        return attackpoint;
    }

    public int getHp() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttackpoint(int attackpoint) {
        this.attackpoint = attackpoint;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setCanfly(boolean canfly) {
        this.canfly = canfly;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isCanfly() {
        return canfly;
    }

    public int getNumber() {
        return number;
    }

    static int index = 0;

    Unit(String name, int attackpoint, int hp, boolean canfly, int index) {
        this.name = name;
        this.attackpoint = attackpoint;
        this.hp = hp;
        this.canfly = canfly;
        this.number = index;
    }

    public int attackUnit(Unit enemy) {
        if (this.canfly || !enemy.isCanfly()) {
            enemy.setHp(enemy.getHp() - this.getAttackpoint());
            return enemy.getHp();

        } else {
            System.out.println("공격 실패");
            return enemy.getHp();
        }
    }

    @Override
    public String toString() {
        return number + ". " +
                name + " (" +
                "현재 체력: " + hp + ")\n";
    }
}
