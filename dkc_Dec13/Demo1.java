package dkc_Dec13;

import java.util.Scanner;

/*
 	数组跳跃:
 		
 */
public class Demo1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("请输入数组大小");
        int[] arr = new int[s.nextInt()];
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
		try {
            jump(0,arr[0], arr);
            System.out.println(false);
        }catch (StackOverflowError e){
            System.out.println(false);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(true);
        }
	}
	public static void jump(int bound,int num,int[]nums) {
        jump(bound+num,nums[bound+num],nums);
    }
}
