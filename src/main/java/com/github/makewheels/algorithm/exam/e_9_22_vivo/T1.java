package com.github.makewheels.algorithm.exam.e_9_22_vivo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class T1 {
    static class User {
        int id;
        double cost;
        double convert;
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 计算满足条件：”确保avg_cost <= K，同时能给平台吸引到最多的新用户“ 的用户集合。
     * 返回列表格式，按用户id升序排序
     *
     * @param userIdList     int整型一维数组 用户id列表
     * @param costList       double浮点型一维数组 用户的成本列表，和用户id列表一一对应
     * @param conversionList double浮点型一维数组 用户转化概率列表，和用户id列表一一对应
     * @param avg_cost       double浮点型 约束的最高期望推广成本
     * @return int整型一维数组
     */
    public int[] calculateUserList(int[] userIdList, double[] costList, double[] conversionList, double avg_cost) {
        List<User> userList = new ArrayList<>(userIdList.length);
        for (int i = 0; i < userIdList.length; i++) {
            User user = new User();
            user.id = userIdList[i];
            user.cost = costList[i];
            user.convert = conversionList[i];
            userList.add(user);
        }
        userList = userList.stream().filter(user -> user.cost * user.convert <= avg_cost).collect(Collectors.toList());
        userList.sort((o1, o2) -> o2.id - o1.id);
        int[] arr = new int[userList.size()];
        for (int i = 0; i < userList.size(); i++) {
            arr[i] = userList.get(i).id;
        }
        return arr;
    }

}
