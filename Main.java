/*
開発者：Houser 作成日：2020年6月19日
*/

import javax.management.DynamicMBean;
import java.text.BreakIterator;

class Main {
  // ここからメインメソッド
  public static int[] makeArray(int size) {
    int[] newArray = new int[size];
    /*
    上と同じ
    int[] newArray;
    int型の要素を代入できる配列変数scoresを用意する
    newArray = new int[size];
    int型の要素をsizeの数だけ作成する
     */
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = i;
    }
    return newArray;
  }
  public static void main(String[] args) {
    int[] array = makeArray(3);
    for(int i :array) {
      System.out.println(i);
    }
  }
}