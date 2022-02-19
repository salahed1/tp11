import ma.cigma.pfe.models.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.cigma.pfe.presentation.clientcontroller;
public class ApplicationRunner {
	public static void main(String[] args) {
		ApplicationContext ctx=newClassPathXmlApplicationContext("spring.xml");
		clientcontroller ctr= (clientcontroller) ctx.getBean("ctrl1");
		client client1 = new client("Omar");
		client client2 = new client("Said");
		client client3 = new client("Ahmed");
		// Test1 => save 3 Clients
		client1=ctr.save(client1);
		client2=ctr.save(client2);
		client3=ctr.save(client3);
		// Test2 => getAll Clients before modify and remove
		ctr.getAll().stream()
		.forEach(i-> System.out.println(i));
		// Test3 => getOne Client service
		System.out.println(ctr.getOne(1));
		// Test4 => modify Client service
		client1.setName("Hassan");
		ctr.modify(client1);
		// Test5 => remove Client service
		ctr.remove(2);
		// Test getAll Client after modify and remove
		ctr.getAll().stream()
		.forEach(i-> System.out.println(i));

		
}
}
