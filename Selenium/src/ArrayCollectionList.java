import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayCollectionList {

    public static void main(String[] args) 
    {
        Collection<String> collection=new ArrayList<String>();
        List<String>list=new ArrayList<String>();
        ArrayList<String>arrayList=new ArrayList<String>();        

        collection.add("A1");
        collection.add("B1");

        list.add("A2");
        list.add("B2");

        arrayList.add("A3");
        arrayList.add("B3");

        Iterator<String>collectionIterator=collection.iterator();
        Iterator<String>listIterator=list.iterator();
        Iterator<String>arrayListIterator=arrayList.iterator();

        while(collectionIterator.hasNext())
        {
            System.out.println(collectionIterator.next());
        }

        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }

        while(arrayListIterator.hasNext())
        {
            System.out.println(arrayListIterator.next());
        }
    }
}