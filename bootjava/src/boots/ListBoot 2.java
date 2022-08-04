package boots;

import java.util.ArrayList;

public class ListBoot {
    public static ArrayList<Object> reverseArrayList(ArrayList<Object> arrayList){
        ArrayList<Object> newList=new ArrayList<>();
        int size=arrayList.size()-1;
        for(int i=0;i< arrayList.size();i++){
            newList.add(i,arrayList.get(size));
            size--;
        }
        return newList;
    }
    public static void showArrayList(ArrayList<Object> arrayList){
        int size= 0;
        for(Object o:arrayList) System.out.println((++size)+". item | value => "+o);
    }
}
