package boots;

import java.util.ArrayList;

public class MathBoot {

/*
* by @Omer Atayilmaz
* Perfect Number
* driver licence checker
* */
    public static int sumOfArrayList(ArrayList<Object> arrayList){
       int result=0;
       for(Object no:arrayList){
            result +=(int)no;
        }
        return result;
    }

    public static int sumOfArray(Number[] arr){
        int result=0;
        for(int i=0;i<arr.length;i++)
            result +=i;
        return result;
    }



}
