/*
開発者：Houser 作成日：2020年6月19日
*/

import javax.management.DynamicMBean;

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
    int a; a = 3;
    int b; b = 5;
    System.out.println("縦幅" + a + "横幅" + b + "の長方形の面積は、" + a*b );
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

    age = 32;

    System.out.println("私の年齢は" + age + "歳です");
    age = 24;
    System.out.println("嘘です、実は私の年齢は" + age + "歳です");

    final double PI;
    PI = 3.14;
    int pie;
    pie = 5;

    System.out.println("半径" + pie + "cmのパイの面積は");
    System.out.println(pie * pie * PI);
    System.out.println("もし、パイの半径を倍にしたら");
    pie = 2 * pie;
    System.out.println(pie * pie * PI);
  }
}
