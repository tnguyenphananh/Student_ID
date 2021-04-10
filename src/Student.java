public class Student {
    private String name;
    private double id;

    public Student(String name, double id){
        this.name = name;
        this.id = id;
    }
    
    public double getID(){
        return id;
    }

    public String getName(){
        return name;
    }
}
