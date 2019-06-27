package Java_Test;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		/*
		string与char 拼接的不同
		 */
		// String s1 = "a";
		// char s2 = 'a';
		// System.out.println(s1+0); //a0
		// System.out.println(s2+0); //97

		String x = "ab";//存储在字符串常量值中的地址，存储内容相同，字符串地址也相同，方便使用哈希
		char a = 'a';
		change(x, a);	// 无论是传值还是传引用，到函数中都是新开辟一个空间存储，不return是无法改变主函数的值的
		System.out.printf("%-16s %s\n", "reference", x);
		System.out.printf("%-16s %s\n", "reference", a);
		
		StringBuilder y = new StringBuilder("ab");//存储在堆中的地址，即使存储内容相同，字符串地址也不同,即当值处理
		change2(y);	//
		System.out.printf("%-16s %s\n", "no new object", y);
	}
	private static void change(String x, char a) {
	    x = "cd";
	    a = 'b';
	}
	private static void change2(StringBuilder y) {
		// y = "cd"; //Error:(29, 21) java: 不兼容的类型: java.lang.String无法转换为java.lang.StringBuilder
		y.delete(0, 2).append("cd");
	}
}
