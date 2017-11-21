package eu.example.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class BookAspect {
	
	public BookAspect() {
		
	}

	@Before("execution(* eu.example.service.BookManager.getBooks())")
	public void getBooksAdvice(){
		System.out.println("*******************************  Executing Advice on getBooks()");
	}
	
}