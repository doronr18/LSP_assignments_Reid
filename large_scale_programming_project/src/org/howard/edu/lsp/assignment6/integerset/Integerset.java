package org.howard.edu.lsp.assignment6.integerset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;


public class Integerset{
	private ArrayList<Integer> setA = new ArrayList<>();


/** 
 * Default Constructor
 * 
 * @param setA
 */
	public Integerset(ArrayList<Integer> setA) {
		this.setA = setA;
	}
	
	

/**
 *  Clears the internal representation of the set
 */
	public void clear() {
		setA.clear();
	}
//
/**
 * Returns the length of the set
 * @return
 */
	public int length() {
		return setA.size();
	} 
//
///*
//          * Returns true if the 2 sets are equal, false otherwise;
/**
 *  Two sets are equal if they contain all of the same values in ANY order.
 * @param b
 * @return
 */

	public boolean equals(Integerset b) {
		boolean equal = true;
		for (int num: setA) {
			if(b.contains(num)) {
				equal = true;
			}
			else {
				return false;
			}
		}
		return equal;
	}

//
/**
 * Returns true if the set contains the value, otherwise false
 * @param value
 * @return
 */
	public boolean contains(int value) {
		if (setA.contains(value) == true) {
			return true;
		}
		else {
			return false;
		}
	}
//
/**
 * Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
 * @return
 * @throws IntegerSetException
 */
	public int largest() throws IntegerSetException{
		
		if (setA.size()==0) {
			IntegerSetException e = new IntegerSetException();
			throw e;
		}
		
		
		int large = 0;
		for (int n: setA) {
			if (n > large) {
				large = n;
			}
		}
		return large;
	}

//throws IntegerSetException {…}; 
//
/**
 * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
 * @return
 * @throws IntegerSetException
 */
	public int smallest() throws IntegerSetException {
		
		if (setA.size()==0) {
			IntegerSetException e = new IntegerSetException();
			throw e;
		}
		
		int small = setA.get(0);
		for (int n: setA) {
			if(n < small) {
				small = n;
			}
		}
		return small;
	}
//throws IntegerSetException;
//
//
/**
 * Adds an item to the set or does nothing it already there	
 * @param item
 */
	public void add(int item) {
		if (setA.contains(item) != true){
			setA.add(item);
		}
	} // adds item to the set or does nothing if it is in set
//
/**
 *  Removes an item from the set or does nothing if not there
 * @param item
 */
	public void remove(int item) {
		for (int i=0; i<setA.size();i++) {
			if(setA.get(i)==item) {
				setA.remove(i);
			}
		}
	}
	
//	Throws a IntegerSetException of the set is empty

/**
 * Set union
 * @param intSetb
 * @return
 */
	public Integerset union(Integerset intSetb) throws RuntimeException {
		if (setA.isEmpty() || setA.isEmpty())
		   throw new RuntimeException("Empty set in union");
		ArrayList<Integer> temp=intSetb.getlist();
   
	    Set<Integer> set = new HashSet<>();
	    set.addAll(setA);
	    set.addAll(temp);
	   
	    ArrayList<Integer> list3= new ArrayList<>(set);
	   
	    Integerset list4= new Integerset(list3);
	   
	    return list4;
   
	}

/**
 * Set intersection
 * @param intSetb
 * @return
 */
	public Integerset intersect(Integerset intSetb) {
		ArrayList<Integer> temp = intSetb.getlist();
		setA.retainAll(temp);
		Integerset set4 = new Integerset(setA);
		return set4;
	} 

/**
 * Set difference, i.e., s1 –s2
 * @param intSetb
 * @return
 */
public Integerset diff(Integerset intSetb) {
	ArrayList<Integer> temp = intSetb.getlist();
	setA.retainAll(temp);
	Integerset finalSet = new Integerset(setA);
	return finalSet;
	
} // set difference, i.e. s1 - s2


/**
 * Returns true if the set is empty, false otherwise
 * @return
 */
	public boolean isEmpty() {
		if (setA.isEmpty() == true) {
			return true;
		}
		else {
			return false;
		}
	}
//
/**
 * Return String representation of your set
 */
	public String toString() {
		return setA.toString();
	}	// return String representation of your set

	/**
	 * returns the set
	 * @return
	 */
	public ArrayList<Integer> getlist(){
		return setA;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}


