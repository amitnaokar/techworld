package basic.di.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringConfigBeansBySetter {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-di-by-setter.xml");
//		context = new FileSystemXmlApplicationContext("spring-di-by-constructor.xml");
		Employee employeeContextBean = (Employee)context.getBean(Employee.class);
		System.out.println(employeeContextBean);
		
		Resource res = new ClassPathResource("spring-di-by-setter.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Employee emp = (Employee) factory.getBean("employeeBean",Employee.class);
		// emp = (Employee) factory.getBean(Employee.class);
		// emp = (Employee) factory.getBean("employeeBean");
		System.out.println(emp.toString());
	}

}
