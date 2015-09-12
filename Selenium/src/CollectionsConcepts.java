

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arraylist no need defined the size but array need to give the size
		ArrayList <Integer> al = new ArrayList<Integer> ();
		al.add(20);
		al.add(10);
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		//System.out.println(al.get(2));
		al.add(30);
		System.out.println(al);
        al.remove(0);
		System.out.println(al);
		al.add(0,99);
		System.out.println(al);


		for(int i =0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		System.out.println("Reverse by for loop");

		for(int i=al.size()-1;i>=0;i--){
			System.out.println(al.get(i));
		}
		
		System.out.println("Reverse By Collections Reverse");
		Collections.reverse(al);
         for(int i:al){
        	 System.out.println(i);
         }
		
     	for(int i =0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		
       LinkedList<Integer> ll = new LinkedList<Integer> ();
       ll.add(10);
	   ll.add(20);
	   System.out.println(ll);
	   System.out.println(ll.get(0));

	   
	   //int[] myArray = new int[10];
	   int[] myArray = {1,2,3};

	   String myString = "hello world!";
	   List<Integer> myList = new ArrayList<Integer>();

	   //myArray.length;    //gives the length of the array
	   System.out.println(myString.length()); //gives the length of the string
	   System.out.println(myList.size());     //gives the length of the list


	}

}
