package java8;

public class Test1 {
public void test(Bird bird){
	System.out.println(bird.getName()+"能飞"+bird.fly()+"米远");
}
	public static void main(String[] args) {
		Test1 test=new Test1();
		test.test(new Bird(){
			public int fly(){
				return 10000;
			}
			public String getName(){
				System.out.print("test");
				return "大雁";
			}
		});
	}
}



