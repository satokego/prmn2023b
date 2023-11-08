//練習問題１
package lecture02;
import java.util.Scanner;

public class P_prac1 {
    public static void main(String[] args) {
        String number = "B2001000";

        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください");
        String gakuseki = scan.next();

        P_Gakuseki g = new P_Gakuseki();
        g.discrimination(number,gakuseki);



    }
}
