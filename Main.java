/*
開発者：Houser 作成日：2020年6月19日
*/

class Main {
  // ここからメインメソッド
  public static void main(String[] args) {
    String msg = "";
    msg += "Hello ";
    msg += "JAVA!";
    System.out.println(msg);

    // byteとても小さい変数
    byte glasses;
    glasses = 2;
    // short 小さい整数
    short age;
    age = 18;
    // 通常の整数
    int salary;
    salary = 152000;
    // long大きい整数
    long worldPeople;
    worldPeople = 690000000L;
    float weight;
    weight = 67.5F;
    // 少数を扱ケースは、特殊な事情がない限りdoubleを使う。
    double height;
    height = 171.2;
    // tureかfalseで判断できる型はboolean
    boolean isError;
    isError = true;
    // charは1文字
    char zodiac;
    zodiac = '辰';
    // Stringは文字の集まり
    String name;
    name = "すがわら";

    System.out.println(age);
    System.out.println(glasses);
    System.out.println(age);
    System.out.println(salary);
    System.out.println(worldPeople);
    System.out.println(weight);
    System.out.println(height);
    System.out.println(isError);
    System.out.println(zodiac);
    System.out.println(name);

  }
}
