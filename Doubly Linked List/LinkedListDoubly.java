//Nicholas B

public class LinkedListDoubly<Type> 
{
	private ListNode_Doubly<Type> first;
	private ListNode_Doubly<Type> last;
	public int numOfNodes = 0;
	
	public int size()
	{
		return numOfNodes;
	}
	
	// ADD METHODS
	public boolean add(Type obj)
	{
		ListNode_Doubly<Type> newNode = new ListNode_Doubly<Type>(obj);
		
		if(first == null) //No nodes
		{
			first = newNode;
			last = newNode;
		}
		else if (first == last) //if there is one node
		{
			first.setNext(newNode);
			newNode.setPrevious(first);
			last = newNode;
		}
		else //more than one node
		{
			ListNode_Doubly<Type> precurrent; //Don't need here, but need to delete
			ListNode_Doubly<Type> current;
			current = first;
			
			precurrent = first;
			while(current.getNext()!= null)
			{
				current = current.getNext();
			}
			current.setNext(newNode);
			newNode.setPrevious(current);
			last = newNode;
		}//End else/if
		numOfNodes++;
		return true;
	}// End add(Type obj) method

	public void addFirst(Type obj)
	{
		ListNode_Doubly<Type> newNode = new ListNode_Doubly<Type>(obj);
		
		if(first == null) //No nodes
		{
			first = newNode;
			last = newNode;
		}
		else
		{
			newNode.setNext(first);
			first.setPrevious(newNode);
			first = newNode;
		} // end if/else
	}//end addFirst(Type obj)
	
	public void add(int i, Type obj)
	{
		if(i < 0 || i > this.size()) // Can't be negative and has to at end 0,1,2,3,4 = size of 5, no index 5
			throw new IllegalArgumentException("Index " + i + " is out of bounds");
		
		if(i == 0)
			addFirst(obj);
		else if(i == this.size())
			add(obj);
		else
		{
			ListNode_Doubly<Type> newNode = new ListNode_Doubly<Type>(obj);
			ListNode_Doubly<Type> previous, current;
			int count = 0;
			previous = current = first;
			
			while(count < i)
			{
				previous = current;
				current = current.getNext();
				count++;
			}
			newNode.setNext(current);
			previous.setNext(newNode);
			numOfNodes++;
		}
	}// END ADD(int i, Type obj)
	
//-----------------------------END ADD METHODS-------------------------------------------------
	
	//REMOVE METHODS
	public Type removeFirst()
	{
		Type returnValue = null;
		if(first == null) //No nodes
		{
			System.out.println("This is empty. ");
		}
		else
		{
			returnValue = first.getValue();
			first = first.getNext();
			first.setPrevious(null);
			numOfNodes--;
		}//end if/else	
		return returnValue;
	}//end removeFirst()
	
	public Type removeLast()
	{
		ListNode_Doubly<Type>current = first;
		Type returnValue = null;
		
		  if (first == null)
		  {
			  System.out.println("List is empty. ");
		  }
		  else if(first == last)
		  { // means that is only one node
			  returnValue = current.getValue();
			  first = last = null;
			  numOfNodes--;
		  }
		  else
		  {
		while(current.getNext() != last)
		{
			current = current.getNext();
		} // end while

		last.setPrevious(last);
		returnValue = current.getNext().getValue();
		current.setNext(null);
		last = current;
		numOfNodes--;
		  } //end if/else
		return returnValue;
	} //end removeLast()
	
	public Type remove(int i)
	{
		Type returnValue = null;
		if(i < 0 || i >= this.size() || this.size() == 0)
			throw new IndexOutOfBoundsException("Index " + i + " is out of bounds");
		
		ListNode_Doubly<Type> previous, current; // Creates 2 things to traverse the linked list
		//Start at the beginning
		previous = current = first; // starts them at beginning
		int count = 0;
		while (count < i)
		{
			previous = current;
			current = current.getNext();
			count++;
		}
		
		if(previous == current)
		{
			returnValue = current.getValue(); 
			first = first.getNext(); // First = null
		}
		else
		{
			returnValue = current.getValue();
			current = current.getNext();
			previous.setNext(current);
			current.setPrevious(previous);
		}
		
		
		numOfNodes--;
		return returnValue;
		
	}//END REMOVE(i)
	
//-----------------------------END ADD METHODS-------------------------------------------------
	
	//PRINT METHODS
	public void printForwards()
	{
	ListNode_Doubly<Type>current = first;
		 if (first == null)
		 {
			 System.out.println("List is empty. ");
		 }
		 else
		 {
		while(current.getNext() != null)
		{
			System.out.println(current.getValue());
			current = current.getNext();
		}
		 }//end if/else
	}//end printForwards()
	
	public void printBackwards()
	{
		ListNode_Doubly<Type>current = last;
		
		 if (last == null)
		 {
			 System.out.println("List is empty. ");
		 }
		 else
		 {
		while(current.getPrevious() != null)
		{
			System.out.println(current.getValue());
			current = current.getPrevious();
		}
		
		}	
	 }
}
