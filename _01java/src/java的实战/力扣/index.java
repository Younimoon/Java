package java的实战.力扣;

import java.util.ArrayList;

public class index {
    public static void main(String[] args) {
        //输入：nums = [2,7,11,15], target = 9
        //输出：[0,1]
        //解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

        // 随机输出1-10的整数
        // 错误的因为是先执行（int）Math.random()
        // int num =(int) Math.random()*10+1;

        //正确的
        int num = (int) (Math.random() * 10) + 1;
        int target = (int) (Math.random() * 100) + 1;
        //int[] arr = new int[num];
        if(num<3){
            num = 5;
        }
        System.out.println(num);

        int[] Arr = {2, 7, 11, 15};
        ArrayList<Integer> arr = new ArrayList<Integer>();

        //for (int i = 0; i < num; i++) {
        //    int num1 = (int) (Math.random() * 100) + 1;
        //    arr.add(num1) ;
        //}

        for (int i = 0; i < Arr.length; i++) {
            arr.add(Arr[i]);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 4; j++) {
                if(arr.get(i)+arr.get(j) == target){
                    System.out.println("成功");
                    return;
                }
                else {
                    System.out.println("失败");
                    return;
                }
            }
        }
        System.out.println(arr);

    }
}
