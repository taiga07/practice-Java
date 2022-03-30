import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercises {
	public static void main(String[] args) throws IOException
	{
    int sum = 0;
    for(int i = 1; i <=100; i++){
      if(i % 2 == 1){
        sum += i;
      }
    }
    System.out.println("1から100の奇数の総和は"+sum);
//		北ソフト工房
//		2.入力

//		2-1
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String s = br.readLine();
		// System.out.println(s);

    // 2-2
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int x = Integer.parseInt(br.readLine());
		// System.out.println(x);

//		2-3
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int x = Integer.parseInt(br.readLine());
//		System.out.println(x);
//		System.out.println(x*x);
//		System.out.println(x*x*x);

//		2-4
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int x = Integer.parseInt(br.readLine());
//		int y = Integer.parseInt(br.readLine());

//		System.out.println(x + y);
//		System.out.println(x - y);
//		System.out.println(x * y);
//		System.out.println(x / y);
//		System.out.println(x % y);

//		2-5
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int x = Integer.parseInt(br.readLine());
//		int y = Integer.parseInt(br.readLine());

//		System.out.println((x+y)/2);

//		2-6
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println("年齢を入力してください。");
		// int x = Integer.parseInt(br.readLine());

		// System.out.println(x*365);



//		4.繰り返し
		
//		4-1
//		for(int i = 1; i <= 10; i++) {
//			System.out.println("SPAM");
//		}
		
//		4-2
//		for(int i = 1; i < 10; i++) {
//			System.out.println(3 * i);
//		}
		
//		4-3
//		for( int i = 1, x = 2 ; i <= 8 ; i++, x *= 2 )
//		    System.out.println( "2の" + i + "乗=" + x );
		
//		4-4
//		int x = 1;
//		for(int i = 1; i <= 7; i++)
//			x *= i;
//		System.out.println(x);
		
//		4-5
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int sum = 0;
    // for(int i = 1; i <= 10; i++) {
    //   int x = Integer.parseInt(br.readLine());
    //   sum += x;
    // }
    // System.out.println(sum/10);

//    4-6
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int x = 0;
// 		int y = 0;
// 		System.out.println("0を負け、1を勝ちとし入力してください。");
// 		for(int i = 1; i <= 10; i++) {
// 			int n = Integer.parseInt(br.readLine());
// 			if(n == 0) {
// 				x = x+1;
// 			}else if (n == 1) {
// 				y = y+1;
// 			}
// 		}
// 		System.out.println("勝ちの総数："+ y +"負けの総数："+ x);

//		4-7
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int x = 0;
		// int y = 0;
		
		// for(int i = 1; i <= 9; i++) {
		// 	System.out.println(i + "回表、巨人の得点は？");
		// 	x += Integer.parseInt(br.readLine());
			
		// 	System.out.println(i + "回裏、阪神の得点は？");
		// 	y += Integer.parseInt(br.readLine());
		// }
		// System.out.println("巨人："+ x + "点、" + "阪神：" + y + "点");
		// if(x > y) {
		// 	System.out.println("巨人の勝ち");
		// }else {
		// 	System.out.println("阪神の勝ち");
		// }

    //		4-8
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int max = 0;
		// for(int i = 1; i <= 10; i++) {
		// 	int x = Integer.parseInt(br.readLine());
		// 	if(x > max) {
		// 		max = x;
		// 	}
		// }
		// System.out.println("最大値＝" + max);

    //		4-9
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int max = 0;
		// int min = 0;
		// for(int i=1; i<=10; i++) {
		// 	int x =Integer.parseInt(br.readLine());
		// 	if(i==1) {
		// 		max = x;
		// 		min = x;
		// 	}else {
		// 		if(x > max) {
		// 			max = x;
		// 		}else if(x < min) {
		// 			min = x;
		// 		}
		// 	}
		// }
		// System.out.println("最大値：" + max + "最小値：" + min);





	}
}
