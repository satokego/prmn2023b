//練習問題２で使用
package lecture02;

public class P_Keisan {
    int sum(int[] num){
        int num_sum = 0;
        for(int j=0;j<5;j++){
            num_sum += num[j];
        }
        System.out.printf("合計値：%d”,num_sum");
        return num_sum;
    }

    void discrimination(int x){
        if(x >= 100){
            System.out.println("great!!");
        }else if(x >= 50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
}
