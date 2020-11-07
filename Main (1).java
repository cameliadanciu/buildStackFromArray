/*
 * Create a stack using an array
 * Requirements:
 * Create push(object) method to add items at the top of to the stack
 * Create pop() method print and delete an item from the top of stack
 * Create peek() method to print the top element of the stack
 * Create search(object) method to look for an element in the stack and return the index of the element
 * Create isEmpty() method to check if the stack is empty and returns true or false
 */

public class Main {	
	static int currentIndex = 9;
	
	public static void Print(int[]Stack){ 	// this method is printing the stack but only the elements that have been pushed
		System.out.print("Print : ");					
		for (int i = currentIndex + 1; i < Stack.length; i++){  //this method is printing the elements in the stack
			System.out.print(Stack[i] + " ");					//from the current index to the bottom (index 9)
		}
		System.out.println();
	}
	
	public static void BabyPrint(int[]Stack){ 				// this method is printing the whole stack indexes
		System.out.print("Baby Print : ");	
		for (int i = 0; i < Stack.length; i++){
			System.out.print(Stack[i] + " ");
		}
		System.out.println();
	}
	
	public static void peek(int[]Stack){		
		System.out.println("Peek " + Stack[currentIndex+1]);
		//System.out.println("current Index "+currentIndex);
	}
	
	public static void push(int element, int[]Stack){  		//this method is pushing an item in the stack
		if(currentIndex == -1){                               		//index cannot be -1 so it will stop the insertion
			System.out.println("Your stack is full");
			return;													//returns back to the caller which is the main method
		}
		Stack[currentIndex] = element;								//starts with index 9 (which is the bottom) and assigns a value (e) to the index
		currentIndex--;	 											//decrements the index									
	}
	
	public static void pop(int[]Stack){
		System.out.println("Popped "+Stack[currentIndex+1]); 	//this method removes an element from top of the stack	
		//Stack[currentIndex+1] = 0;								// we don't need to set the element to 0 as we can just replace it with the new element(push() method) 	
		currentIndex++;												//the index is incrementing as the pop takes place
	}
	
	public static void search(int searchValue, int[]Stack){			//this method is searching for an element in the stack
		System.out.println("Starting the current index to search from " +(currentIndex + 1));   
		for(int i = currentIndex + 1; i < Stack.length; i++){						//loop to iterate through the stack
			if(Stack[i] == searchValue){											//if the element in the stack is equal to the element we are searching for 
				System.out.println("Searching "+ searchValue + " and found in index " + i); //it prints the index
				return;																//returns back to main method
			}
		}
		System.out.println("Search found no index for "+searchValue);
	}
	
	public static void isEmpty(int[]Stack){						//this method checks if the stack is empty
		if(currentIndex == 9){									//if we are at current index 9 then the stack is empty
			System.out.println("isEmpty: True");
		}
		else{
			System.out.println("isEmpty: False");
		}
	}
	
	public static void main(String[] args) {
		int[] Stack = new int [10];
		
		push(0, Stack);
		push(-2, Stack);
		push(17, Stack);
		pop(Stack);
		pop(Stack);
		search(17, Stack);
		search(0, Stack);
		isEmpty(Stack);
		
		//System.out.println("THE STACK:");
		BabyPrint(Stack);
		Print(Stack);
		push(5, Stack);
		push(5, Stack);
		BabyPrint(Stack);
		Print(Stack);
	}	
}
