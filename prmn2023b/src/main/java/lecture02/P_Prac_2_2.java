package lecture02;

import java.util.Scanner;

public class P_Prac_2_2 {
    public static void main(String[] args) {

        String name_1 = "千歳花子";
        int num_1 = 2110000;
        Scanner scan = new Scanner(System.in);
        P_Login log = new P_Login(name_1,num_1);

        System.out.println("名前を入力してください");
        String name_2 = scan.next();
        System.out.println("学籍番号を入力してください");
        int num_2 = scan.nextInt();
        String message = log.sys(name_2,num_2);
        massege.mes();  //これは何?
    }
}
