package airlines;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	Bg_Flight obj = (Bg_Flight)context.getBean("welcome");
    	System.out.println(obj.getMessage());
    }
}
