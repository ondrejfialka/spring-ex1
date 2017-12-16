package cz.ucl.jee.camelot.commoners;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import cz.ucl.jee.camelot.nobility.BraveKnight;

//TODO fill annotations to make this class Aspect and Spring bean
public class Minstrel {
	
	@Before("execution(* cz.ucl.jee.camelot.nobility.BraveKnight.*(..))")		
    public void singAboutKnight(JoinPoint jp) throws Throwable {
        
		BraveKnight knight = (BraveKnight) jp.getTarget();	
       //TODO sing something about the knight       
    }
	
	//TODO create method for singing after the knight has done something

}
