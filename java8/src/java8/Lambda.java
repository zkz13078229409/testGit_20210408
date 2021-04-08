package java8;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.BinaryOperator;

import org.junit.Test;

public class Lambda {
	
	public static void main(String[] args) {
		
		
	/*	//匿名内部类
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("执行匿名内部类....");
				
			}
		};
		*/
//lambda表达式
		Runnable r1=()->System.out.println("lambda~");
		r1.run();

	}
	@Test
	public void testLOneParam(){
	/*	//匿名内部类作为参数传递
		TreeSet<String> ts=new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.length(), o2.length());
			}
			
		});
		*/
		//使用lambda表达式
		/*TreeSet<String> ts=(Integer o1, Integer o2)->{
			return Integer.compare(o1.length(), o2.length());
					};*/
		TreeSet<String> ts=new TreeSet<String>(
				(o1,o2)->Integer.compare(o1.length(), o2.length())
				
				);
		ts.add("dawdwa");
		ts.add("dd");
		ts.add("你");
		
		
		for (String string : ts) {
			System.out.println(string);
		}
	}

	
	@Test
	public void testTwoParamReturn(){
		//使用内部类并且实现该方法
		/*BinaryOperator<Long> binaryOperator=new BinaryOperator<Long>() {

			@Override
			public Long apply(Long t, Long u) {
				
				return t+u;
			}
		};
		*/
		//使用lambda表达式\

	}
	
}
