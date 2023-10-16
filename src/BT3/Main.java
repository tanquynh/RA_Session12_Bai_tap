package BT3;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 23, 8, 5, 4, -1, -10};
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            treeMap.put(arr[i],0);
        }
        Map.Entry<Integer, Integer> entry = treeMap.firstEntry();
        System.out.println("Số nhỏ nhất trong mảng là : " + entry.getKey());
    }
}
