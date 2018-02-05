import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		//Resource resource = new ClassPathResource("beans.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1 = (Employee)context.getBean("employee");
		
		System.out.println("Employee: " + emp1);
	
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
		
		ctx.close();
		
		

	}

}
