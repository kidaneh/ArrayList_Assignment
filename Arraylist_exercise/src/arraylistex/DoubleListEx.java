/*
 This program shows how to double list items and remove even length item
 Date April 27, 2020
 By Kidane Hailemichael
 */
package arraylistex;
import java.util.ArrayList;

public class DoubleListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> oldlist= new ArrayList<String>();
		ArrayList<String> list= new ArrayList<String>();
		oldlist.add("How");
		oldlist.add("are");
		oldlist.add("you");
		list.add("Blue");
		list.add("Red");
		list.add("Yellow");
		list.add("Orange");
		doubleList(oldlist);
		System.out.println(oldlist);
		removeEvenLength(list);
		
		}
	
public static void doubleList(ArrayList<String> arrayList){

ArrayList<String> templist= new ArrayList<String>();
for(int i=0; i<arrayList.size(); i++)
	templist.add(i, arrayList.get(i));

for(int index=0; index <templist.size(); index ++)
arrayList.add(1+index *2, templist.get(index));

		
}
public static void removeEvenLength(ArrayList<String> arrayList) {
	
	
 ArrayList<String> oddList = new ArrayList<String>();
    for( String word : arrayList ) {
        if( word.length() % 2 == 1 ) {
            oddList.add( word );
        }
        
    }
    
    System.out.println(oddList);
    
    
}
}