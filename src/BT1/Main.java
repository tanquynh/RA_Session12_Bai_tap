package BT1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3, 5, 4, 3, 5, 6, 2, 7, 8};
        Map<Integer, Integer> Number = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int count =1;
            if(Number.containsKey(arr[i])) {
                continue;
            }
            for (int j = i +1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                     count++;
                }
            }
            Number.put(arr[i],count);
        }

       // in ra kue và value số trung nhiều nhất
        int maxCount = 0;
        int value = 0;

        for (Map.Entry<Integer, Integer> numberMax : Number.entrySet()) {
            if (numberMax.getValue() > maxCount) {
                maxCount = numberMax.getValue();
                value = numberMax.getKey();
            }
        }


        System.out.println("Số xuất hiện nhiều nhất là " + value + " với " + maxCount + " lần.");
    }
}
