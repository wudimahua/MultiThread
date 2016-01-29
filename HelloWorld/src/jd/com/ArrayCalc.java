package jd.com;

import java.util.*;

public class ArrayCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//        int[] intArray = new int[5];
//        long total = 0;
//        int len = intArray.length;
//       
//        // 给数组元素赋值
//        System.out.print("请输入" + len + "个整数，以空格为分隔：");
//        Scanner sc = new Scanner(System.in);
//        for(int i=0; i<len; i++){
//            intArray[i] = sc.nextInt();
//        }
//       
//        // 计算数组元素的和
//        for(int i=0; i<len; i++){
//            total += intArray[i];
//        }
//        sc.close();
//       
//        System.out.println("所有数组元素的和为：" + total);
		
		
//		String str = "wei_xue_yuan_is_good";
//        String[] strArr = str.split("_");
//        System.out.println(Arrays.toString(strArr));
		
		
        String fragment = "abcdefghijklmnopqrstuvwxyz";
        int times = 10000;
       
        // 通过String对象
        long timeStart1 = System.currentTimeMillis();
        String str1 = "";
        for (int i=0; i<times; i++) {
            str1 += fragment;
        }
        long timeEnd1 = System.currentTimeMillis();
        System.out.println("String: " + (timeEnd1 - timeStart1) + "ms");
       
        // 通过StringBuffer
        long timeStart2 = System.currentTimeMillis();
        StringBuffer str2 = new StringBuffer();
        for (int i=0; i<times; i++) {
            str2.append(fragment);
        }
        long timeEnd2 = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (timeEnd2 - timeStart2) + "ms");
		
	}
}
