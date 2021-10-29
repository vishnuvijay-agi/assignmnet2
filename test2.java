package mavan.assignment;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class test2 {
	@Before("execution(public void main())")
	public void  main1()
	{
		int DA = 5;
		int HRD = 8;
		int result =DA+HRD; 
 		System.out.println(result);
		
	 
	}

}