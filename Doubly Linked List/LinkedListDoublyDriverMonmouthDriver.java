//Nicholas B

public class LinkedListDoublyDriverMonmouthDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDoubly<String>list = new LinkedListDoubly<String>();
		System.out.println("\n***Testing add (add or addLast are the same, you can change the driver to accomodate your code***");
		list.add("Long Branch");
		list.add("Asbury Park");
		list.add("Freehold");
		list.add("Seaside Heights");
		list.add("Point Pleasant");
		list.add("Belmar");
		list.add("Neptune");
		list.add("Manasquan");
		list.add("Atlantic HighLands");
		list.add("Belmar");
		list.printForwards();
	
		System.out.println("\n***Testing addFirst***");
		list.addFirst("Bayone");
		list.addFirst("Newark");
		list.addFirst("Manalapan");
		list.printForwards();
	
		System.out.println("\n***Testing removeFirst() (or deleteFirst)***");
		System.out.println("removing: "+list.removeFirst());
		System.out.println("removing: "+list.removeFirst());
		System.out.println("removing: "+list.removeFirst());
		list.printForwards();
	
		System.out.println("\n***Testing add(int i,Type obj) which is insert***");
		list.add(0,"Manalapan");
		list.add(4,"Newark");
		list.add(list.size()-1,"Bayonne");
		list.printForwards();
	
		System.out.println("\n***Testing remove(int i)***");
		System.out.println("removing: "+list.remove(0));
		System.out.println("removing: "+list.remove(4));
		System.out.println("removing: "+list.remove(list.size()-1));
		list.printForwards();
		
		System.out.println("\n***Testing removeLast (or deleteLast)***");
		System.out.println("removing: "+list.removeLast());
		System.out.println("removing: "+list.removeLast());
		System.out.println("removing: "+list.removeLast());
		list.printForwards();
		
		
		
		
		System.out.println("\nTesting remove(int)");
		System.out.println("removing: "+list.remove(2));
		System.out.println("removing: "+list.remove(0));
		System.out.println();
		list.printForwards();
		
	
		System.out.println("\n *** Testing printBackwards -- iteratively (non-recursive) ****");
		list.printBackwards();
		
	
	}

}
/*
***Testing add (add or addLast are the same, you can change the driver to accomodate your code***
Long Branch
Asbury Park
Freehold
Seaside Heights
Point Pleasant
Belmar
Neptune
Manasquan
Atlantic HighLands

***Testing addFirst***
Manalapan
Newark
Bayone
Long Branch
Asbury Park
Freehold
Seaside Heights
Point Pleasant
Belmar
Neptune
Manasquan
Atlantic HighLands

***Testing removeFirst() (or deleteFirst)***
removing: Manalapan
removing: Newark
removing: Bayone
Long Branch
Asbury Park
Freehold
Seaside Heights
Point Pleasant
Belmar
Neptune
Manasquan
Atlantic HighLands

***Testing add(int i,Type obj) which is insert***
Manalapan
Long Branch
Asbury Park
Freehold
Newark
Seaside Heights
Point Pleasant
Bayonne
Belmar
Neptune
Manasquan
Atlantic HighLands

***Testing remove(int i)***
removing: Manalapan
removing: Seaside Heights
removing: Belmar
Long Branch
Asbury Park
Freehold
Newark
Point Pleasant
Bayonne
Neptune
Manasquan
Atlantic HighLands

***Testing removeLast (or deleteLast)***
removing: Belmar
removing: Atlantic HighLands
removing: Manasquan
Long Branch
Asbury Park
Freehold
Newark
Point Pleasant
Bayonne

Testing remove(int)
removing: Freehold
removing: Long Branch

Asbury Park
Newark
Point Pleasant
Bayonne

 *** Testing printBackwards -- iteratively (non-recursive) ****
Neptune
*/