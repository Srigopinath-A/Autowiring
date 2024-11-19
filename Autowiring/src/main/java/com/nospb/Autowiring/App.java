package com.nospb.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
    	
    	// we can either getbean by name or getbean by type , both will work 
    	//Junction obj = (Junction) con.getBean("Junction"); // it is get bean by name 
    	Junction obj = (Junction) con.getBean(Junction.class); // it is get bean by type 
    	
    	obj.ready();
    }
}
