package coreJava;

import java.util.*;

public class ConcurrentModificationExc {
	
	public static void main(String args[]){
		List<String> myList = new ArrayList<String>();
		//List<String> myList = new CopyOnWriteArrayList<String>();
		
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		
		Iterator<String> it = myList.iterator();
		while(it.hasNext()){
			String value = it.next();
			System.out.println("List Value:"+value);
			if(value.equals("3")) { 
				//while list is iterating we can't remove an element from the list
				//myList.remove(value);
				//we can remove from the iterator object like
				it.remove();
			}
		}
		//3 is removed in the loop
		
		System.out.println("list after iteration: "+myList);
		
		Map<String,String> myMap = new HashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while(it1.hasNext()){
			String key = it1.next();
			System.out.println("Map Value:"+myMap.get(key));
			if(key.equals("2")){
				myMap.put("1","4");
				//myMap.put("4", "4");
			}
		}

	}
	
}
