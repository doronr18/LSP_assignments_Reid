package org.howard.edu.lsp.assignment6.junit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;
import org.howard.edu.lsp.assignment6.integerset.Integerset;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class IntegersetTest {
	@Test
    @DisplayName("Test case for the clear fuction")
     public void testIsEmpty() {
		ArrayList<Integer> set1= new ArrayList<>();
    	Integerset s1 = new Integerset(set1);
    	assertTrue(s1.isEmpty());
    	
    	s1.add(0);
    	assertFalse(s1.isEmpty());
    }
	
	
	
	@Test
    @DisplayName("Test case for the add fuction")
    public void testAdd() {
		ArrayList<Integer> set1= new ArrayList<>();
    	Integerset s1 = new Integerset(set1);
    	
    	s1.add(2);
    	s1.add(3);
    	s1.add(4);
    	
    	assertEquals("[2, 3, 4]", s1.toString());
    	assertNotEquals("[3, 4]", s1.toString());
    	assertNotEquals("[]", s1.toString());
    }
	
	@Test
    @DisplayName("Test case for the length fuction")
    public void testLength() {
		ArrayList<Integer> set1= new ArrayList<>();
    	Integerset s1 = new Integerset(set1);
    	s1.add(2);
    	s1.add(3);
    	s1.add(4);
    	
    	
    	assertEquals(s1.length(), 3);
    	
    	s1.add(5);
    	s1.add(6);

    	assertEquals(s1.length(), 5);
    }
	
	
	@Test
    @DisplayName("Test case for the equal fuction")
    public void testEquals() {
		ArrayList<Integer> set1= new ArrayList<>();
    	Integerset s1 = new Integerset(set1);
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        
        ArrayList<Integer> set2= new ArrayList<>();
    	Integerset s2 = new Integerset(set2);
        s2.add(1);
        s2.add(2);
        s2.add(3);
        s2.add(4);
        
        assertTrue(s1.equals(s2));
        
        s1.add(5);
        s1.add(6);
        
        s2.add(7);
        s2.add(8);
        
        assertFalse(s1.equals(s2));
    }
	
	@Test
    @DisplayName("Test case for the contains fuction")
    public void testContains() {
		ArrayList<Integer> set1= new ArrayList<>();
    	Integerset s1 = new Integerset(set1);
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        
        assertTrue(s1.contains(2));
        assertTrue(s1.contains(4));
        assertFalse(s1.contains(5));
    }
	
	@Test
	@DisplayName("IntegerSet.remove test case")
	public void testRemove() {
		ArrayList<Integer> set1= new ArrayList<>();
		Integerset s1= new Integerset(set1);
		
		assertTrue(set1.isEmpty());
		s1.add(1);
		s1.add(4);
		assertTrue(set1.contains(4));
		s1.remove(4);
		assertEquals(false, set1.contains(4));
		
		s1.remove(1);
		assertTrue(s1.isEmpty());
	}

	
	@Test
    @DisplayName("Test case for the toString fuction")
    public void testToString() {
		ArrayList<Integer> set1= new ArrayList<>();
    	Integerset s1 = new Integerset(set1);
        s1.add(5);
        s1.add(8);
        s1.add(9);
        s1.add(3);
        
        assertEquals("[5, 8, 9, 3]", s1.toString());
    }
	
	
	@Test
    @DisplayName("Test case for the largest fuction")
    public void testLargest() throws IntegerSetException{
		ArrayList<Integer> set1= new ArrayList<>();
	    Integerset s1 = new Integerset(set1);
        s1.add(10);
        s1.add(21);
        s1.add(9);
        s1.add(11);
        
        assertEquals(21, s1.largest());
        assertNotEquals(10, s1.largest());
    }
	
	@Test
    @DisplayName("Test case for the smallest fuction")
    public void testSmallest() throws IntegerSetException {
		ArrayList<Integer> set1= new ArrayList<>();
		Integerset s1 = new Integerset(set1);
		s1.add(10);
	    s1.add(21);
	    s1.add(9);
	    s1.add(11);
        
	    assertEquals(9, s1.smallest());
	    assertNotEquals(11, s1.smallest());
    }
	
//	@Test
//	@DisplayName("IntegerSet.union test case")
//	public void testUnion() {
//		
//		ArrayList<Integer> set1= new ArrayList<>();
//		Integerset s1= new Integerset(set1);
//		
//		ArrayList<Integer> set2= new ArrayList<>();
//		Integerset s2= new Integerset(set2);
//		
//		set1.add(3);
//		set1.add(4);
//		
//
//		set2.add(1);
//		
//		
//		try {
//			s1.union(s2);
//		} catch (RuntimeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		
//		assertTrue(s1.toString().equals("[3, 4, 1]"));
//	}
//	
	
//	@Test
//	@DisplayName("IntegerSet.Unionthrows exception")
//	public void testUnion_THROWS_EXCEPTION() {
//		ArrayList<Integer> set1= new ArrayList<>();
//		Integerset s1= new Integerset(set1);
//
//		ArrayList<Integer> set2= new ArrayList<>();
//		Integerset s2= new Integerset(set2);
//		
//		Exception exception = assertThrows(RuntimeException.class, () -> {
//			s1.union(s2);
//			
//		}
//	
//				);
		
	
//	@Test
//    @DisplayName("Test case for the intersect fuction")
//    public void testIntersect() {
//    	IntegerSet s1 = new IntegerSet();
//    	s1.add(1);
//		s1.add(3);
//		s1.add(4);
//		s1.add(6);
//		
//    	IntegerSet s2 = new IntegerSet();
//    	s2.add(1);
//		s2.add(2);
//		s2.add(3);
//		s2.add(4);
//		s2.add(5);
//		s2.add(6);
//		
//		assertEquals("[1, 3, 4, 6]", s1.intersect(s2));
//		assertNotEquals("[1, 3, 4, 5, 6]", s1.intersect(s2));
//    }
	
//	@Test
//    @DisplayName("Test case for the diff fuction")
//    public void testDiff() {
//    	IntegerSet s1 = new IntegerSet();
//    	s1.add(1);
//		s1.add(3);
//		s1.add(4);
//		s1.add(6);
//		s1.add(7);
//		
//    	IntegerSet s2 = new IntegerSet();
//    	s2.add(1);
//		s2.add(2);
//		s2.add(3);
//		s2.add(4);
//		s2.add(5);
//		s2.add(6);
//		
//		assertEquals("[2, 5, 7]", s1.diff(s2));
//		assertNotEquals("[1, 3, 4, 6]", s1.diff(s2));
//    }
	
	
	
	
//	@Test
//    @DisplayName("Test case for the Union fuction")
//    public void testUnion() {
//       IntegerSet s1 = new IntegerSet();
//       s1.add(1);
//       s1.add(2);
//       
//       IntegerSet s2 = new IntegerSet();
//       s2.add(3);
//       
//       s1.union(s2);
//       assertEquals("[1, 2, 3]", s1.toString());
//       assertNotEquals("[3, 2, 1]", s1.toString());
//       
//    }
	
	
	
	
	
	
	
	
	
	
	
	
}

