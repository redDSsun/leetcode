package maximum69Number;

import java.util.Arrays;

public class Solution {
    public int maximum69Number (int num) {
//        int flag = 0;
//        StringBuffer stringBuffer = new StringBuffer();
//        String[] num_list = String.valueOf(num).split("");
//        for (int i = 0; i < num_list.length; i++) {
//            if (num_list[i].equals("6") && flag == 0){
//                num_list[i] = "9";
//                flag = 1;
//            }
//            stringBuffer.append(num_list[i]);
//        }
//        Integer integer = Integer.valueOf(stringBuffer.toString());
//        return integer;


        /*
        replaceFirst通过正则表达式
         */
        return Integer.valueOf(String.valueOf(num).replaceFirst("6", "9"));


    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximum69Number(9969));
    }
}
