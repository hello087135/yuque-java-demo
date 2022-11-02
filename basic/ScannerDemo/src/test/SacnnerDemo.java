package test;
import java.util.Scanner;
public class SacnnerDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 接受整数
    if(sc.hasNextInt()){   // 判断是否是整数
      int i=sc.nextInt(); // 接受整数
      System.out.println("输入的整数为："+i);
    }
    if(sc.hasNextLine()){  // 判断是否是字符串
      String str=sc.nextLine(); // 接受字符串
      System.out.println("输入的字符串为："+str);
    }
  }
}
