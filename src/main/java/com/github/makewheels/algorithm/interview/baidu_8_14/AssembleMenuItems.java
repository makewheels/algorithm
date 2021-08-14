package com.github.makewheels.algorithm.interview.baidu_8_14;

import java.util.ArrayList;
import java.util.List;

public class AssembleMenuItems {
    public static void main(String[] args) {
        //数据库查出来的列表
        List<MenuItem> allMenuItems = new ArrayList<>();

        //返回结果
        List<MenuItem> result = new ArrayList<>();
        //找到root节点
        for (MenuItem menuItem : allMenuItems) {
            if (menuItem.parentId == 0) {
                result.add(menuItem);
            }
        }
        for (MenuItem menuItem : result) {
            setChildren(menuItem, allMenuItems);
        }
    }

    /**
     * 获取第一级孩子列表
     */
    private static List<MenuItem> getLevelOneChildren(
            int parentId, List<MenuItem> allMenuItems) {
        List<MenuItem> result = new ArrayList<>();
        for (MenuItem menuItem : allMenuItems) {
            if (menuItem.parentId == parentId) {
                result.add(menuItem);
//                allMenuItems.remove(menuItem);
            }
        }
        return result;
    }

    /**
     * 设置孩子
     */
    private static void setChildren(
            MenuItem menuItem, List<MenuItem> allMenuItems) {
        List<MenuItem> children = getLevelOneChildren(
                menuItem.itemId, allMenuItems);
        if (!children.isEmpty()) {
            menuItem.children = children;
        }
        for (MenuItem item : children) {
            setChildren(item, allMenuItems);
        }
    }
}
