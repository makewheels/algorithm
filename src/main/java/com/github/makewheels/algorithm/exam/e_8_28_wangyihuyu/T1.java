package com.github.makewheels.algorithm.exam.e_8_28_wangyihuyu;

import java.util.ArrayList;
import java.util.Collections;
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
    private static Boolean check(List<Monster> monsterList, int myHealth, int myAttack, int myDefense) {
        for (Monster monster : monsterList) {
            while (true) {
                //我没破防
                if (myAttack <= monster.defense) {
                    return null;
                }
                //我砍怪
                monster.health -= myAttack - monster.defense;
                //如果怪死了
                if (monster.health <= 0) {
                    myHealth += -monster.health;
                    break;
                }
                //如果怪破我防
                if (monster.attack > myDefense) {
                    //怪砍我
                    myHealth -= monster.attack - myDefense;
                    //如果我死了
                    if (myHealth <= 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static int test(List<Monster> monsterList, int myAttack, int myDefense) {
        for (int i = 1; i < 10000; i++) {
            List<Monster> copyMonsterList = new ArrayList<>(monsterList.size());
            for (Monster monster : monsterList) {
                Monster tempMonster = new Monster();
                tempMonster.health = monster.health;
                tempMonster.attack = monster.attack;
                tempMonster.defense = monster.defense;
                copyMonsterList.add(tempMonster);
            }
            Boolean check = check(copyMonsterList, i, myAttack, myDefense);
            if (check == null) {
                return -1;
            } else if (check) {
                return i;
            }
        }
        return -1;
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
            int handle = test(monsterList, myProperties[0], myProperties[1]);
            System.out.println(handle);
        }
    }
}
