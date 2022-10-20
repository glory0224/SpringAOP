package glory.spring.common;

import org.aspectj.lang.annotation.Pointcut;

public class PublicPointcut {
	
	@Pointcut("execution(public * glory.spring..*(..))")
	public void publicMethod() {
		
	}
}
