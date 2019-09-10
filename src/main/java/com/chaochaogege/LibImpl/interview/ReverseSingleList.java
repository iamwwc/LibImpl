package com.chaochaogege.LibImpl.interview;

import com.chaochaogege.LibImpl.common.SingleListNode;

import java.util.ArrayList;
import java.util.Arrays;

import static com.chaochaogege.LibImpl.common.Utils.*;

public class ReverseSingleList {
    public static void main(String[] args) {
        ReverseSingleList o = new ReverseSingleList();
        ArrayList<Integer> origin = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        SingleListNode node = getSingleList(origin);
        SingleListNode l = o.reverse(node);
        ArrayList<Integer> after = getListOfArrayInteger(l);
        reverseArray(origin);
        assert after.equals(origin);
    }

    public SingleListNode reverse(SingleListNode node) {
        SingleListNode prev = null, next = null;
        while (node != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }

}

