package java8;

import org.junit.Test;

public class Test_Lambda_fun {
	
	public String toUpperString(Lambda_fun<String> mf,String str){
		return mf.getValue(str);
	}
	@Test
	public void test1(){
		String str=toUpperString((test)->test.toUpperCase(),"abcdf");
		System.out.println(str);
	}
	

}
