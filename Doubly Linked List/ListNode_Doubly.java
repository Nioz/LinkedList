//Nicholas B

public class ListNode_Doubly<Type> {
	
	private Type value;
	private ListNode_Doubly<Type>next;
	private ListNode_Doubly<Type>previous;
	
	
	//Constructor #1
	public ListNode_Doubly(Type initvalue)
	{
		value = initvalue;
		next = null;
		previous = null;
	}
	
	public ListNode_Doubly(Type initValue, ListNode_Doubly<Type>initNext, ListNode_Doubly<Type>initPrevious)
	{
		value = initValue;
		next = initNext;
		previous = initPrevious;
	}
	
	//Getter Method(s)
	public Type getValue()
	{
		return value;
	}
	
	public ListNode_Doubly<Type> getPrevious()
	{
		return previous;
	}
	

	public ListNode_Doubly<Type> getNext()
	{
		return next;
	}//ENDS GETTER(S)
	
	//Setter Method(s)
	public void setValue(Type newValue)
	{
		value = newValue;
	}
	
	public void setPrevious(ListNode_Doubly<Type>newPrevious)
	{
		previous = newPrevious;
	}
	
	public void setNext(ListNode_Doubly<Type>newNext)
	{
		next = newNext;
	} //ENDS SETTER(S)
	
	
} //ENDS ListNode_DoublyCLASS
