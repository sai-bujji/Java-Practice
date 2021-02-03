package com.practice.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.practice.data.api.TodoService;
import com.practice.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetriveTodosRelatedToSpring() {
		
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTods = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTods.size());
	}

}
