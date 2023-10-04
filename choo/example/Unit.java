package org.example;

public class Unit {

    String name="";
    int attackpoint=0;
    int hp=0;
    boolean canfly=false;

    int number=0;

    static int index=0;

    Unit(String name,int attackpoint,int hp,boolean canfly,int index){
        this.name=name;
        this.attackpoint=attackpoint;
        this.hp=hp;
        this.canfly=canfly;
        this.number=index;
    }

    public int attackUnit(Unit enemy){
        if (this.canfly || !enemy.canfly){
            enemy.hp=enemy.hp-this.attackpoint;
            return enemy.hp;

        }else{
            return enemy.hp;
        }
    }

    @Override
    public String toString() {
        return number+". "+
                name + " (" +
                "현재 체력: " + hp +")\n";
    }
}
