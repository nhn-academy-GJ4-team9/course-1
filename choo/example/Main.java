package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends Unit {

    static List<Unit> user;
    static List<Unit> computer;

    static String userrace = "";

    static String comrace2 = "";

    Main(String name, int attackpoint, int hp, boolean canfly, int index) {
        super(name, attackpoint, hp, canfly, index);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("1.Terran 2.Protos 3.Zerg");

        int race = scanner.nextInt();

        int randomint = 0;


        switch (race) {
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


        int comrace = (int) (Math.random() * 3) + 1;
        switch (comrace) {
            case 1:
                comrace2 = "Terran";
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
                comrace2 = "Protos";
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
                comrace2 = "Zerg";
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

        int first = 0;
        int second = 0;

        int first2 = 0;
        int second2 = 0;


        while (isEnd(user, computer)) {


            System.out.println("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요: ");
            first = scanner.nextInt();
            second = scanner.nextInt();
            attack(first, second);

            if (!isEnd(user, computer)) {
                break;
            }

            List<Integer> comarray = new ArrayList<>(); //first
            List<Integer> comarray2 = new ArrayList<>(); //second
            System.out.println("아군: " + userrace);
            System.out.println(user);
            System.out.println("적군 " + comrace2);
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
        int first = comarray.get(random);
        int random2 = (int) (Math.random() * comarray2.size());
        int second = comarray2.get(random2);
        System.out.println(first + " " + second);
        computer.get(attacker(computer, first)).attackUnit(vitim(user, second));

        if (vitim(user, second).getHp() <= 0) {
            removeunit(user, second);
        }
    }

    private static int attacker(List<Unit> computer, int first) {

        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).getNumber() == first) {
                return i;
            }
        }
        return 99;
    }

    private static void attack(int first, int second) {
        user.get(first).attackUnit(vitim(computer, second));

        if (vitim(computer, second).getHp() <= 0) {
            removeunit(computer, second);
        }
    }

    private static Unit vitim(List<Unit> computer, int second) {
        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).getNumber() == second) {
                return computer.get(i);
            }
        }


        return null;
    }

    private static void removeunit(List<Unit> computer, int second) {
        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).getNumber() == second) {
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
