package com.company.step1;

enum PROFESSIONS{
    BACKEND,
    FRONTEND,
    TESTER,
    FULLSTACK
}
enum DEPARTMENTS{
    ADVERTISMENT,
    ACCOUNTMENT,
    INFORMATION_TECHS
}
class Managers extends Employee{
    DEPARTMENTS department;
}

class Developers extends Employee{
    PROFESSIONS professions;
}
class Interns extends User{
    float score;
    byte days;

    @Override
    public String toString(){
        return
        super.toString()
        +"\nscore:"
        +this.score
        +"\ndays:"
        +this.days;
    }

}
class Employee extends User{
    private short salary=5500;
    public Employee(){
        System.out.println("Employee Empty Constructor Executed!");
    }

    public Employee(Long id, String name, String email,short salary){
        super(id,name,email);
        this.salary=salary;
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        return super.toString()+"\n Salary:"+this.salary;
    }
}

public class User {
    private Long id;
    private String name;
    private String email;

    public User(){
        //System.out.println("USER: Empty constructor çalıştı");
    }

    public User(Long id){
        //System.out.println("USER: Tek parametreli constructor çalıştı");
    }

    public User(Long id, String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
        //System.out.println(this.toString());
    }
    public User(Long id, String name){
        this.name=name;
        this.id=id;
    }


    @Override
    public String toString(){
        return "id:"+this.id+"\nname:"+this.name+"\nemail:"+this.email+"\n***********\n";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        if(email==null){
            System.out.println("Email boş olamaz");
        }
        this.email = email;
    }
}
