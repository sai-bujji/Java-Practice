package com.practice.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.practice.data.api.TodoService;

public class TodoBusinessImplMockTest {

	@Test
	public void testRetriveTodosRelatedToSpring_usingMock() {
		
		TodoService todoService = mock(TodoService.class);
		
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Cricket");
		
		when(todoService.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> filteredTods = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTods.size());
	}

}
