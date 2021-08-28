package com.github.makewheels.algorithm.exam.wangyihuyu_8_28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Monster {
    int attack;
    int defense;
    int health;

    @Override
    public String toString() {
        return "Monster{" +
                "attack=" + attack +
                ", defense=" + defense +
                ", health=" + health +
                '}';
    }
}

/**
 * 网易互娱，2021年8月28日15:42:31
 * 第一题，魔塔：
 * <p>
 * 输入：
 * 2
 * 1
 * 1 1
 * 10 5 10
 * 3
 * 10 5
 * 10 5 6
 * 10 5 7
 * 10 5 8
 * <p>
 * 输出：
 * -1
 * 9
 */
public class T1 {
    private static int handle(List<Monster> monsterList, int myAttack, int myDefense) {
        int myHealth = 0;
        for (Monster monster : monsterList) {
            if (myAttack < monster.defense) {
                return -1;
            }
            while (true) {
                monster.health -= myAttack - monster.defense;
                if (monster.health <= 0) {
                    myHealth += -monster.health;
                    break;
                }
                int attackValue = monster.attack - myDefense;
                if (Math.abs(myHealth) < attackValue) {
                    myHealth = -attackValue;
                }
                myHealth -= attackValue;
            }
        }
        return -myHealth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            int monsterCount = Integer.parseInt(scanner.nextLine());

            String[] myArr = scanner.nextLine().split(" ");
            int[] myProperties = new int[myArr.length];
            for (int j = 0; j < myArr.length; j++) {
                myProperties[j] = Integer.parseInt(myArr[j]);
            }

            List<Monster> monsterList = new ArrayList<>(monsterCount);
            for (int j = 0; j < monsterCount; j++) {
                String[] monsterArr = scanner.nextLine().split(" ");
                int[] monsterProperties = new int[monsterArr.length];
                for (int k = 0; k < monsterArr.length; k++) {
                    monsterProperties[k] = Integer.parseInt(monsterArr[k]);
                }

                Monster monster = new Monster();
                monster.attack = monsterProperties[0];
                monster.defense = monsterProperties[1];
                monster.health = monsterProperties[2];
                monsterList.add(monster);
            }
            int handle = handle(monsterList, myProperties[0], myProperties[1]);
            System.out.println(handle);
        }
    }
}
