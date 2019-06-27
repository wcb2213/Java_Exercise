package Java_Test;

import java.io.*;
import java.util.*;

public class ArrayTest {

    public static void main(String[] args){
        func1();
        int[] scores = {13,17,12,15,11};
        func2(scores);
        System.out.println(Arrays.toString(scores));// [15, 17, 15, 15, 15]
    }
    private static void func1() {
        int[] e = {0,2,4,6,8};
        e[1] = e[3]+e[4];
        System.out.println("e is " + Arrays.toString(e));
    }
    // 即传引用时（object）
    // When an object is passed as a parameter, it will affect the original object.
    private static void func2(int[] scores) {
        for (int i=0; i<scores.length; i++){
            if (scores[i]<15){
                scores[i] = 15;
            }
        }
    }
}
