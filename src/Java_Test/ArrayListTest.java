package Java_Test;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        // ArrayList<Integer> list1 = new ArrayList<>();
        // func1(list1);// 传引用 所以 ok
        // System.out.println(list1.toString());

        int[] array1 = {1, 4, 8, 9, 11, 15, 17, 28, 41, 59};
        int[] array2 = {4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81};
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> res = func2(list2,list3,array1,array2);
        System.out.println(res.toString());
    }
    private static void func1(ArrayList list1){
        // ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i=1; i<=5; i++){
            list1.add(2*i);
        }
        int numOfSize = list1.size();
        int index = 1;
        for (int i=0; i<numOfSize; i++){
            list1.add(index, 42);
            index += 2;
        }
        System.out.println(index);
        for (int i=0; i<numOfSize; i++){
            list1.remove(index-2);
            index -= 2;
        }
        System.out.println(index);
    }
    private static ArrayList<Integer> func2(ArrayList<Integer> list1, ArrayList<Integer> list2, int[] array1, int[] array2){
        for (int i = 0; i < array1.length; i++) {
            int value = array1[i];
            list1.add(value);
        }
        for (int i=0; i<array2.length; i++){
            list2.add(array2[i]);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=0; i<list1.size(); i++){
            if (list2.indexOf(list1.get(i)) != -1){
                res.add(list1.get(i));
            }
        }
        return res;
    }
}
