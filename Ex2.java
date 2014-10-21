import java.util.Scanner;
import java.util.Random;

abstract class Ex {
	abstract void execute();
}

class Ex2_0 extends Ex{
	void execute(){
		int x;
		int y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y ) + "です。");
		System.out.println("平均は" + (x + y ) / 2 + "です。");
	}
}

class Ex2_1 extends Ex{
	void execute(){
		double x;
		double y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y ) + "です。");
		System.out.println("平均は" + (x + y ) / 2 + "です。");
	}
}

class Ex2_2 extends Ex{
	void execute(){
		int x;
		int y;
        int z;

		x = 63;
		y = 18;
        z = 21;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
        System.out.println("zの値は" + z + "です。");
		System.out.println("合計は" + (x + y + z) + "です。");
		System.out.println("平均は" + (x + y + z) / 3 + "です。");
	}
}

class Ex2_00 extends Ex{
    void execute(){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("xとyを加減乗除します。");
        
        System.out.print("xの値：");    // xの値の入力を促す
        int x = stdIn.nextInt();
        System.out.print("yの値：");    // yの値の入力を促す
        int y = stdIn.nextInt();
        
        System.out.println("x + x = " + (x + y)); // x + yの値を表示
        System.out.println("x - x = " + (x - y)); // x - yの値を表示
        System.out.println("x * x = " + (x * y)); // x * yの値を表示
        System.out.println("x / x = " + (x / y)); // x / yの値を表示 (商)
        System.out.println("x % x = " + (x % y)); // x % yの値を表示 (剰余)
    }   
}

class Ex2_3 extends Ex{
    void execute(){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("xを表示します。入力して下さい");

        System.out.print("xの値");
        int x = stdIn.nextInt();

        System.out.println("x="+x );

    }
}

class Ex2_4 extends Ex{
    void execute(){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("xから10を加減します。");

        System.out.print("xの値");
        int x = stdIn.nextInt();

        System.out.println("x+10=" + (x + 10));
        System.out.println("x-10=" + (x - 10));
    }
}

class Ex2_5 extends Ex{
    void execute(){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("xとyの加と平均を求める");

        System.out.print("xの値");
        double x = stdIn.nextDouble();
        System.out.print("yの値");
        double y = stdIn.nextDouble();

        System.out.println("x + y ="+ (x + y));
        System.out.println("xとyの平均 =" + (x + y )/2);
    }
}

class Ex2_6 extends Ex{
    void execute(){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("三角形の面積を求める");

        System.out.print("底辺xの値");
        double x = stdIn.nextDouble();
         System.out.print("高さyの値");
        double y = stdIn.nextDouble();

        System.out.println("x * y / 2 ="+(x * y / 2));
    }
}

public class Ex2 {
	public static void main(String[] args){
		Ex a;
		a = new Ex2_0();
        a.execute();
        a = new Ex2_1();
        a.execute();
        a = new Ex2_2();
		a.execute();

        a = new Ex2_00();
        a.execute();
        a = new Ex2_3();
        a.execute();
        a = new Ex2_4();
        a.execute();
        a = new Ex2_5();
        a.execute();
        a = new Ex2_6();
        a.execute();

	} }
