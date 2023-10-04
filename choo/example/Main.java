package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends Unit {

    private static List<Unit> user;
    private static List<Unit> computer;
    private static String userrace = "";
    private static String comrace = "";

    Main(String name, int attackpoint, int hp, boolean canfly, int index) {
        super(name, attackpoint, hp, canfly, index);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("1.Terran 2.Protos 3.Zerg");

        int urace = scanner.nextInt();

        int randomint = 0;

        switch (urace) {
            case 1:
                userrace = "Terran";
                System.out.println("사용자의 종족은 테란입니다");
                user = new ArrayList<>(5);
                for (int i = 0; i < 5; i++) {
                    randomint = (int) ((Math.random() * 5) + 1);
                    switch (randomint) {
                        case 1:
                            user.add(new Marine());
                            break;
                        case 2:
                            user.add(new Tank());
                            break;
                        case 3:
                            user.add(new Goliath());
                            break;
                        case 4:
                            user.add(new Wraith());
                            break;
                        case 5:
                            user.add(new Valkyrie());
                            break;
                    }
                }
                break;
            case 2:
                userrace = "Protos";
                System.out.println("사용자의 종족은 프로토스입니다");
                user = new ArrayList<>(4);
                for (int i = 0; i < 4; i++) {
                    randomint = (int) ((Math.random() * 5) + 1);
                    switch (randomint) {
                        case 1:
                            user.add(new Zealot());
                            break;
                        case 2:
                            user.add(new Dragoon());
                            break;
                        case 3:
                            user.add(new HighTempler());
                            break;
                        case 4:
                            user.add(new Scout());
                            break;
                        case 5:
                            user.add(new Corsair());
                            break;
                    }
                }
                break;
            case 3:
                userrace = "Zerg";
                System.out.println("사용자의 종족은 저그입니다");
                user = new ArrayList<>(8);
                for (int i = 0; i < 8; i++) {
                    randomint = (int) ((Math.random() * 5) + 1);
                    switch (randomint) {
                        case 1:
                            user.add(new Zergling());
                            break;
                        case 2:
                            user.add(new Hydralisk());
                            break;
                        case 3:
                            user.add(new Ultralisk());
                            break;
                        case 4:
                            user.add(new Mutalisk());
                            break;
                        case 5:
                            user.add(new Guardian());
                            break;
                    }
                }
                break;
        }


        System.out.println(user);
        index = 0;


        int crace = (int) (Math.random() * 3) + 1;
        switch (crace) {
            case 1:
                comrace = "Terran";
                System.out.println("컴퓨터의 종족은 테란입니다");
                computer = new ArrayList<>(5);
                for (int i = 0; i < 5; i++) {
                    randomint = (int) ((Math.random() * 5) + 1);
                    switch (randomint) {
                        case 1:
                            computer.add(new Marine());
                            break;
                        case 2:
                            computer.add(new Tank());
                            break;
                        case 3:
                            computer.add(new Goliath());
                            break;
                        case 4:
                            computer.add(new Wraith());
                            break;
                        case 5:
                            computer.add(new Valkyrie());
                            break;
                    }
                }
                break;
            case 2:
                comrace = "Protos";
                System.out.println("컴퓨터의 종족은 프로토스입니다");
                computer = new ArrayList<>(4);
                for (int i = 0; i < 4; i++) {
                    randomint = (int) ((Math.random() * 5) + 1);
                    switch (randomint) {
                        case 1:
                            computer.add(new Zealot());
                            break;
                        case 2:
                            computer.add(new Dragoon());
                            break;
                        case 3:
                            computer.add(new HighTempler());
                            break;
                        case 4:
                            computer.add(new Scout());
                            break;
                        case 5:
                            computer.add(new Corsair());
                            break;
                    }
                }
                break;
            case 3:
                comrace = "Zerg";
                System.out.println("컴퓨터의 종족은 저그입니다");
                computer = new ArrayList<>(8);
                for (int i = 0; i < 8; i++) {
                    randomint = (int) ((Math.random() * 5) + 1);
                    switch (randomint) {
                        case 1:
                            computer.add(new Zergling());
                            break;
                        case 2:
                            computer.add(new Hydralisk());
                            break;
                        case 3:
                            computer.add(new Ultralisk());
                            break;
                        case 4:
                            computer.add(new Mutalisk());
                            break;
                        case 5:
                            computer.add(new Guardian());
                            break;
                    }
                }
                break;
        }


        System.out.println(computer);

        int attackUnitNumber = 0;
        int defensiveUnitNumber = 0;


        while (isEnd(user, computer)) {
            System.out.println("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요: ");
            attackUnitNumber = scanner.nextInt();
            defensiveUnitNumber = scanner.nextInt();
            attack(attackUnitNumber, defensiveUnitNumber);

            if (!isEnd(user, computer)) {
                break;
            }

            List<Integer> comarray = new ArrayList<>(); //attackUnitNumber
            List<Integer> comarray2 = new ArrayList<>(); //defensiveUnitNumber
            System.out.println("아군: " + userrace);
            System.out.println(user);
            System.out.println("적군 " + comrace);
            System.out.println(computer);

            for (int i = 0; i < computer.size(); i++) {
                comarray.add(computer.get(i).getNumber());
            }


            for (int i = 0; i < user.size(); i++) {
                comarray2.add(user.get(i).getNumber());
            }

            comattack(comarray, comarray2);

        }

    }

    private static void comattack(List<Integer> comarray, List<Integer> comarray2) {
        int random = (int) (Math.random() * comarray.size());
        int attackUnitNumber = comarray.get(random);
        int random2 = (int) (Math.random() * comarray2.size());
        int defensiveUnitNumber = comarray2.get(random2);
        computer.get(attacker(computer, attackUnitNumber)).attackUnit(victim(user, defensiveUnitNumber));

        if (victim(user, defensiveUnitNumber).getHp() <= 0) {
            removeunit(user, defensiveUnitNumber);
        }
    }

    private static int attacker(List<Unit> computer, int attackUnitNumber) {

        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).getNumber() == attackUnitNumber) {
                return i;
            }
        }
        return 99;
    }

    private static void attack(int attackUnitNumber, int defensiveUnitNumber) {
        user.get(attackUnitNumber).attackUnit(victim(computer, defensiveUnitNumber));

        if (victim(computer, defensiveUnitNumber).getHp() <= 0) {
            removeunit(computer, defensiveUnitNumber);
        }
    }

    private static Unit victim(List<Unit> computer, int defensiveUnitNumber) {
        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).getNumber() == defensiveUnitNumber) {
                return computer.get(i);
            }
        }


        return null;
    }

    private static void removeunit(List<Unit> computer, int defensiveUnitNumber) {
        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).getNumber() == defensiveUnitNumber) {
                computer.remove(i);
            }
        }
    }

    private static boolean isEnd(List<Unit> user, List<Unit> computer) {
        if (user.size() == 0 || computer.size() == 0) {
            if (user.size() == 0) {
                System.out.println("컴퓨터 승리!");
            } else if (computer.size() == 0) {
                System.out.println("유저 승리");
            }
            return false;
        }
        return true;
    }


}
