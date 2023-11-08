//練習問題3
package lecture02;

import java.util.Scanner;

public class P_Prac3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stu_num = 0;
        //生徒の人数の登録
        while(true) {
            System.out.print("生徒の人数を入力してください(5人以上)");
            stu_num = scan.nextInt();
            if (stu_num >= 5) {
                break;
            }else{
                System.out.println("5人未満です。入力をやり直してください。");
            }
        }
        String[][] gakuseki_pass = new String[stu_num][2];
        //実際に実行するクラスのインタンス化
        P_Input i = new P_Input(gakuseki_pass, stu_num);
        i.first_input();  //学籍番号とパスワードの登録
        i.discrimination();
    }
}
