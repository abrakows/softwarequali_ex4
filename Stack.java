package qm.ex2;

/**
 * The Stack class represents a stack data structure.
 * Provides methods to push, pop, check the top element, and retrieve the stack's size.
 * Stack is implemented as a fixed-size integer array.
 */
public class Stack {  
	
	private int maxSize = 0;
	int pos = -1;
	int[] stackArr = null;

       /**
     	* @param size the maximum capacity of the stack
    	*/
	public Stack(int size) {
		maxSize = size;
		stackArr = new int[size];
	}	  

       /**
     	* @return true if the stack is empty, false otherwise
    	*/
	public boolean isEmpty() {  
		if (this.size() == 0)  
			return true;  
		return false;  
	}

       /**
     	* @return the top element, or -1 if the stack is empty
     	*/
	public int top(){
		if(!isEmpty()) {
			return stackArr[pos];
		} else{
			return -1;
		}
	}

       /**
        * @return the top element, or -1 if the stack is empty
        */
	public int pop() {  
		if (pos == -1)  
			return -1;
		int element = stackArr[pos];  
		stackArr[pos] = -1;  
		pos--;  
		return element;  
	}  

       /**
	* @param element the integer to be added to the stack
        * @throws StackOverflowError if the stack is full
        * @throws IllegalArgumentException if the element is negative
        */
	public void push(int element) throws StackOverflowError,IllegalArgumentException {  		
		if (element<0)
			throw new IllegalArgumentException();
		int npos = pos + 1;  
		if (npos == maxSize)  
			throw new StackOverflowError("Stack is full");  
		pos = npos;  
		stackArr[pos] = element;  
	}  

	public int size() { 		
		return pos + 1;  
	}  	

}  
