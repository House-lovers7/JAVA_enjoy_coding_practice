/*
開発者：Houser 作成日：2020年6月19日
*/

import javax.management.DynamicMBean;
import java.text.BreakIterator;

class Main {
  // ここからメインメソッド
    public static void main (String[] args){
    System.out.println("ようこそ、占いの館へ");
    System.out.println("あなたの名前を入力してください");
    String yourname = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
    String yourageString = new java.util.Scanner(System.in).nextLine();
    int myage = Integer.parseInt(yourageString);
    int fortune = new java.util.Random().nextInt(4);
    System.out.println("占いの結果がでました!!");
    System.out.println( myage + "歳の" + yourname + "さん、" + "あなたのいまの運気は" + fortune + "です!!"  );
    switch (fortune) {
      case 4:
        System.out.println("大吉");
        break;
      case 3:
        System.out.println("中吉");
        break;
      case 2:
        System.out.println("吉");
        break;
      case 1:
        System.out.println("凶");
        break;
      default:
        System.out.println("吉");
    }
  }
}
