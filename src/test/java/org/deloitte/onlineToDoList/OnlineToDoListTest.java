package org.deloitte.onlineToDoList;

import static org.junit.jupiter.api.Assertions.*;

import org.deloitte.onlineToDoList.config.ExposeEntityIdRestConfiguration;
import org.deloitte.onlineToDoList.models.Todo;
import org.deloitte.onlineToDoList.repositories.TodoRepository;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@RunWith(PowerMockRunner.class)
public class OnlineToDoListTest {
	TodoApp todoApp;
	@Autowired
	TodoRepository todoRepository;
	ExposeEntityIdRestConfiguration exposeEntityIdRestConfiguration;
		
	public OnlineToDoListTest(){}
	
	 @Ignore
	 @Test
	 public void maintest() {
		 PowerMockito.mockStatic(SpringApplication.class);		
	      todoApp.main(new String[]{"todos"});
	      PowerMockito.verifyStatic();
	        SpringApplication.run(Todo.class, new String[]{"", ""});
	       
	   }
	 @Test
	 @Bean
	 public void exposeEntityIdRestConfigurationtest() {
	     Mockito.mock(ExposeEntityIdRestConfiguration.class);
	 }
	 
	 @Test
	  public void saveTest() {		
	    Todo todo = new Todo();
	    todoRepository.save(todo);
	    Assert.assertNotNull(todoRepository.findAll());
	  }

}
