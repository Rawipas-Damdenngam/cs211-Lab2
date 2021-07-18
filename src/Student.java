public class Student {
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;


    }

    public String speak(String sentence){
        return sentence;
    }

    public  void  learning(String course){
        //....
    }

    public String getId(){
            return id;
    }

    public  String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return  "ID = " + id + "Name = " + name + "Age = " + age;
    }

}
