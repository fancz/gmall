package com.fancz.notes;

/**
 * @author fancz
 * @Title: ${在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，
 *          但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 *          例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。}
 * @date 2020/5/24 13:29
 */
public class T3 {
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null||length<=0) return false;
        int i = 0;
        while(i<length){
            if(numbers[i]==i){
                i++;
            }else{
                if(numbers[i]==numbers[numbers[i]]){
                    duplication[0]=numbers[i];
                    return true;
                }else{
                    int temp = numbers[i];
                    numbers[i] = numbers[numbers[i]];
                    numbers[temp] = temp;//别误写为numbers[numbers[i]]=temp;
                }
            }
        }
        return false;
    }







    public static void main(String[] args) {
        int[] numbers = {2,3,1,0,2,5,3};

        int[]duplication={2,3,1,0,2,5,3};
        boolean duplicate = duplicate(numbers, numbers.length, duplication);


    }
}
