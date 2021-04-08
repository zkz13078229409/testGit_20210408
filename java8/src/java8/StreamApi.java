package java8;
//streamApi 对集合进行操作
/*
 *步骤
 *1：生成流
 *2：操作流（流水线） 
 * 3:终止流  出现效果
 * 不许终止流才会出现效果
 */
//4种生成流的方式

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamApi {
		@Test
		public void test(){{
			
		}
			Long start=System.currentTimeMillis();
			//1:集合的stream()或者 parallelStream()方法获取一个流
			List<String>list=new ArrayList();
			//Stream<String>stream1= list.stream();
				Stream<String> stream2=list.parallelStream();
			//通过Array的静态方法stream获取流
				Employee[] employee=new Employee[10];
			Stream <Employee> stream1=Arrays.stream(employee);
			//通过stream类的静态方法of
			Stream <String> stream3=Stream.of("aa","dd","dwad");
			stream3.forEach(System.out::println);
			//创建无限流   没有结束
			//迭代
		Stream <Integer> stream5=	Stream.iterate(0, (x)->x+2);
		stream5.limit(100).forEach(System.out::println);
			//生成
		Stream.generate(()->Math.random()).limit(100000).forEach(System.out::println);
		long end=System.currentTimeMillis();
		System.out.println(end-start+"毫秒");
		}
@Test
public void test2(){
	//筛选和切片
	//filter   过滤掉某些元素
		List<Employee> empList=Arrays.asList(
				
					new Employee("张三",12),
					new Employee("李四",33),
					new Employee("李四",43),
					new  Employee ("王五",43),
					new Employee("田七",55),
					new Employee("田七",55),
					new Employee("田七",55));
		//empList.stream().filter((emp)->emp.getAge()>30).forEach(System.out::println);;
		//empList.stream().filter((emp)->emp.getName().contains("四")).filter((emp)->emp.getAge()<40).forEach(System.out::println);
		//distinct去重，需要重写实体类的hashCode跟equals方法
		//empList.stream().distinct().forEach(System.out::println);
		//empList.stream().limit(2).forEach(System.out::println);
		
		//empList.stream().limit(2).forEach(System.out::println);
		empList.stream().skip(1).forEach(System.out::println);
}

}
