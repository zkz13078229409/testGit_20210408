package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

public class 四大内置函数式接口 {
	@Test
	public void test(){
		//comsumer  消费型接口   accept
		happy(10000D,(m)->System.out.println("这是多少钱?"+m));
	}

public void happy(double money ,Consumer<Double> base){
	base.accept(money);
} 
@Test
//供给型接口  将无参数方法，返回一个集合
public void test2(){
	List list=gongji(10,()->(int)(Math.random()*100));
	for (Object object : list) {
		System.out.println(object);
	}
}
//获取一个整数并且存入到集合中
public List gongji(int num,Supplier<Integer> supp){
	List list=new ArrayList<>();
	for(int i=0;i<num;i++){
		Integer k=supp.get();
		list.add(k);
	}
	return list;
}
@Test
public void test3(){
	System.out.println(funTest("asdadw",(str)->str.toUpperCase()));
	System.out.println(funTest("多好玩大红的哈哈",(str)->str.substring(1, 5)));
			}
//函数型接口 Function<T, R> fun 方法 apply
public String funTest(String str,Function<String, String> fun){
	return fun.apply(str);
}

@Test
public void test4(){
	List<String> list=Arrays.asList("aaa","da","dawdadwa","你是","你是谁");
	List <String>newList=testPre(list,(s)->s.length()>=3 );
	for (String object : newList) {
		System.out.println(object);
	}
}
//断言型接口   对某个类型的数据进行一些判断，返回判断结果
//需求：将满足字符串的添加到集合当中
public List<String> testPre(List<String> str,Predicate<String> pre){
	List<String> newlist=new ArrayList<String>();
	for (String str2 : str) {
		if(pre.test(str2)){
			
				newlist.add(str2);
			
		}
	}
	return newlist;
}
}
