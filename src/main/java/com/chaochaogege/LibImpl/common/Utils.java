package com.chaochaogege.LibImpl.common;

import java.util.ArrayList;

public class Utils {
    public static boolean AssertIsTrue(boolean r) {
        if (!r) {
            throw new AssertionError("Is not true");
        }
        return true;
    }

    public static SingleListNode getSingleList(ArrayList<Integer> list) {
        list = new ArrayList<>(list);
        int v = list.remove(0);
        final SingleListNode node = new SingleListNode(v);
        SingleListNode n1 = node;
        for (Integer i : list) {
            n1.next = new SingleListNode(i);
            n1 = n1.next;
        }
        return node;
    }
    public static ArrayList<Integer> iteratorSingleList(SingleListNode node) {
        ArrayList<Integer> list = new ArrayList<>();
        while(node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list;
    }
    public static ArrayList<Integer> getListOfArrayInteger(SingleListNode node) {
        ArrayList<Integer> result = new ArrayList<>();
        while(node != null) {
            result.add(node.val);
            node = node.next;
        }
        return result;
    }

    public static void reverseArray(ArrayList<Integer> list) {

        for(int i = 0 ; i < list.size() / 2; i ++) {
            int temp = list.get(i);
            list.set(i,list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }

    }
}
