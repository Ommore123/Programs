import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springexample.Address;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
				new classPathXmlApplicationContext("beans.xml");
		Address a = (Address) context.getBean("addr");
		System.out.println(a);
	}

}
