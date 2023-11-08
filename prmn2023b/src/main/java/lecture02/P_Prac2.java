//練習問題２
package lecture02;

import java.util.Scanner;
public class P_Prac2 {
    public static void main(String[] args){
        int[] num = new int[5]; //配列の定義(C言語とほぼ同じ考え方)
        int x = 0;
        Scanner scan = new Scanner(System.in); //標準入力をするインスタンス
        for(int i=0;i<5;i++){
            System.out.printf("数字 %d つ目",i);
            num[i] = scan.nextInt();
            System.out.println(""); //改行
        }
        P_Keisan k = new P_Keisan(); //合計値を求めるメソッド
        int num_sum = k.sum(num);

        k.discrimination(num_sum);//合計値を判別するメソッド

    }
}

