package basic.scope.singleton;

import basic.di.setter.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Amit on 17-Apr-16.
 */
public class BeanScopeSingleton {
    public static void main(String[] args){
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean-scope.xml");
        Address address1 = (Address)applicationContext.getBean("addressSingletonBean");
        System.out.println("address1 - ");
        System.out.println(address1.toString());

        Address address2 = (Address)applicationContext.getBean("addressSingletonBean");
        address2.setPincode(411001);
        System.out.println("address2 - ");
        System.out.println(address2.toString());

        applicationContext.close();
    }
}
