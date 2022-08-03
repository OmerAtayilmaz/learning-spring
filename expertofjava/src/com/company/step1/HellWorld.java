package com.company.step1;

import java.util.ArrayList;

public class HellWorld {

    public static void main(String[] args) {
        /*
            //Array tanımlama
            String[] myData={"ABC","DEF","FASD","ASD"};
            Character[] awesome={'A','F','R','Q'};

            //Listeler => ArrayList & LinkedList
            ArrayList<Integer> integerNumbers=new ArrayList<>();
            LinkedList<Float> floatList=new LinkedList<>();
            //List bir interface'dir oradan obje oluşturulamaz.
            //linkedlistte indexi 0 olan element olmak zorunda! yoksa error verir.
            floatList.add(0,5f);
            floatList.add(1,6F);
            //System.out.println(floatList.get(1));
            HashMap<String,String> userData=new HashMap<>();
            userData.put("name","omeratayilmaz");
            userData.put("email","omeratayilmaz@gmail.com");
            userData.put("password","omer123");
            userData.put("created_at","10-02-2022");
            System.out.println(
                userData.get("name")+
                userData.containsKey("email")+
                userData.size()+
                userData.remove("name")+
                userData.containsValue("omeratayilmaz")+
                userData.getOrDefault("name","\nNo Name")
            );

            //Condition
            /*conditions
                 if(true) System.out.println("Hello From there");
                 //ternary operator =>



            //Loop
             lopps

            for(String list: myData){
                System.out.println(list.toLowerCase(Locale.ROOT));
            }
            for (int i=5;i<10;i++) {
                System.out.println("simple.");
            }
            while (true){
                System.out.println("awesome while");
                break;
            }
            int i=0;
            do {
                i++;
                System.out.println(i);
            }while(i<5);
           loops

            //VARIABLES: int,float,double,byte,char,String
            int productcount=5;
            float product_rate=2f;
            double product_averages_count=5d;
            byte user_age= 127;
            char key='R';
            String email="My String";
            short shortint= 231;
            long user_id=23123321;

            //Expressinos
            //System.out.println((2+3)*(8/2));

            //CustomLibrary
            LinkedList<Number> myList=new LinkedList<Number>();
            myList.add(5);
            myList.add(4);
            myList.add(3);
            myList.add(2);
            myList.add(1);
            //System.out.println(AwsList.sumOfNumberInLinkedList(myList));

            //OOP
            User user=new User(1l,"Ahmet","ahmet@gmail.com");
            Employee employee=new Employee((long)5,"Filiz","filiz@gmail.com",(short)15600);//employee->parent constructor -> employee attributes -> employee constructor


            Interns intern=new Interns();
            Developers developer=new Developers();
            Managers manager=new Managers();

            intern.id=(long)1;
            intern.days=25;
            intern.email="sima@gmail.com";
            intern.score=(float)78.8;
            intern.name="Sima";
            System.out.print(intern.toString()); */
        /*
        //Ekleme çıkarma işlemlerini yaptık
        try {
            ArrayList<User> userList = new ArrayList<>();
            final UserService userService = new UserService(userList);

            User user1 = new User((long) 1, "Ahmet", "ahmet@gmail.com");
            User user2 = new User((long) 2, "Filiz", "filiz@gmail.com");
            User user3 = new User((long) 3, "Teyfik", "teyfik@gmail.com");
            User updateduser1 = new User((long) 3, "Teyfikko", "teyfikko@gmail.com");

            Interns intern=new Interns();
            intern.setEmail("intern@gmail.com");
            intern.setId((long)4);
            intern.setName("intern");
            userService.save(user1);
            userService.save(intern);
            userService.save(user2);
            userService.save(user3);
            userService.update((long) 3,updateduser1);
            userService.delete((long)1);
            for (User user : userList) {
                System.out.println(user.toString());
            }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

         */
        /*Primitive Types
         int myValue=100;

         //MAX-MIN VALUES
         System.out.println("max:"+Integer.MAX_VALUE+" | min:"+Integer.MIN_VALUE);
         System.out.println("max:"+Float.MAX_VALUE+" | min:"+Float.MIN_VALUE);
         System.out.println("max:"+Double.MAX_VALUE+" | min:"+Double.MIN_VALUE);
         System.out.println("max:"+Short.MAX_VALUE+" | min:"+Short.MIN_VALUE);
         System.out.println("max:"+Long.MAX_VALUE+" | min:"+Long.MIN_VALUE);
         System.out.println("max:"+Byte.MAX_VALUE+" | min:"+Byte.MIN_VALUE);

         //int-> primitive type variable, Integer is a wrapper class.
         //java uses the concept of a wrapper class for all eight primitve types.
         //Overflow-Underflow: if you try and put a value larger than the max value in java or a value smaller than the minimum value in java, then you will get an Overflow in the case of the maximum value or an Underflow in the case of the minimum

         //tips1: integer value can be defined like that :)))
         int myMaxIntVal=2_147_111_222;

         //tips2:
         //use this
            //Long wow=5L;
         //not that!
            //Long eh=3l;

         //char
         char myChar='C'; //single quote
         char myAwesomeChar='\u00A9'; //you can use ASCI Code directly!
         System.out.println(myAwesomeChar);

        //boolean
         boolean myBool=true; //you cannot initialize a boolean variable with null value, weird but true :))
          */
        /* Casting
         * Casting means to treat or convert a number from one type to another. We put the type we want the number to be in paranthesis like this
         * (type)myValue
         //int to float
          int num1=25;
          int num2=7;
          float floatResult=(float)num1/(float)num2;
          System.out.println(floatResult);

         //int to byte
         byte result=(byte)(num1+num2);

         //byte to int,byte to small,small to int : no need to casting!!
         byte val=100;
         int newVal=val*100;
          */
        /* Strings
          * Strings in java are Immutable(cannot be changed), you cannot change a string after its created. Instead, what happens is a new String created
          *  String Buffer - muttable String :))
          StringBuffer stringBuffer=new StringBuffer();
          stringBuffer.append("Hello Wordl");
          System.out.println(stringBuffer);
            */
        /* if-then statement
         if (5>3) System.out.println("YESSS");
        */
        /*Ternary operator
        int newValue=50;
        String result=newValue>50?"yess":"noo";
        System.out.println(result);
        */


    }
}
