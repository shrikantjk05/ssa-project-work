package com.ssa.practice;

import java.util.Arrays;

public class SjkInterviewQuestion {

    private static int[] getSorted(int[] a){

        return a;
    }

    public static void main(String[] args) {
        int a[] = {0, 1, 2, 3, 4, 3, 2, 4, 3, 2, 1, 4, 2};

        int temp[] = {};
        int count = 0;
        int duplicateSize = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count == 1) {
                temp = addXValue(duplicateSize, temp, a[i]);
                duplicateSize++;
            }
            count = 0;
        }
        int ct = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (temp[i] == a[j]) {
                    ct++;
                }
            }
            System.out.println(temp[i] + "  is repeated times " + ct);
            ct = 0;
        }
    }

    private static int[] addXValue(int n, int[] arr, int val) {
        int newarr[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newarr[i] = arr[i];
        }
        newarr[n] = val;
        return newarr;
    }
}
