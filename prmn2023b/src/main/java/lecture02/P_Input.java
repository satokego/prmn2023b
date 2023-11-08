//練習問題3で使用
package lecture02;

import java.util.Scanner;

public class P_Input {
    Scanner scan = new Scanner(System.in);
    int stu_num;
    String[][] gakuseki_pass = new String[100][2];
    public P_Input(String[][]gakuseki_pass,int stu_num) {
        this.stu_num = stu_num;
        this.gakuseki_pass = gakuseki_pass;
    }

    void first_input(){  //最初の学籍番号とパスワードの登録(定義)
        for(int i=0;i<stu_num;i++) {
            System.out.printf("%d番目の生徒の学籍番号を入力",i+1);
            gakuseki_pass[i][0] = scan.next();
            System.out.printf("%d番目の生徒のパスワードを入力",i+1);
            gakuseki_pass[i][1] = scan.next();
        }
    }

    void discrimination(){   //入力された学籍番号から判別
        String new_gakuseki;
        String new_pass;
        System.out.print("あなたの学籍番号を入力");
        new_gakuseki= scan.next();
        for(int j=0;j<stu_num;j++){
            if(new_gakuseki.equals(gakuseki_pass[j][0])){
                System.out.print("パスワードを入力");
                new_pass = scan.next();
                if(new_pass.equals(gakuseki_pass[j][1])){
                    System.out.println("ログイン完了");
                    return;
                }else{
                    System.out.println("不正なアクセス");
                    System.exit(0);
                }


            }
        }
        System.out.print("error!");
        System.exit(0);

    }

}
