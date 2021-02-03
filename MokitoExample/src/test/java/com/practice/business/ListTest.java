package com.practice.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void lestMockLitsSize() {
		
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
	}
	
	@Test
	public void lestMockLitsSize_ReturnMultipleValues() {
		
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
	}
	
	@Test
	public void lestMockLitsSizeGet() {
		
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("Sai");
		assertEquals("Sai", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	@Test(expected=RuntimeException.class)
	public void lestMockLitsSizeGet_throwRuntimeException() {
		
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException());
		assertEquals("Sai", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}

}
