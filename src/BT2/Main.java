package BT2;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,6,3,43,5,657,87,13};
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            treeMap.put(arr[i],0);
        }
//     Xóa phần tử  lớn nhất:
        treeMap.pollLastEntry();
//        System.out.println( treeMap);
        Map.Entry<Integer, Integer> entry = treeMap.lastEntry();
        System.out.println("Phần tử lớn thứ hai trong mảng là : " + entry.getKey() );
    }
}
