// Constructors are special methods for building the objects

class Student1{
    int id;
    String name,branch;
    double score;

    // Constructor Chaining
    public Student1(int id) {
        this.id = id;
    }

    public Student1(int id, String name) {
        this(id);
        this.name = name;
    }

    public Student1(int id, String name, String branch) {
        this(id,name);
        this.branch = branch;
    }

    public Student1(int id, String name, String branch, double score) {
        this(id,name,branch);
        this.score = score;
    }

    // copy constructors
    public Student1(Student1 obj){
        this.id = obj.id;
        this.name = obj.name;
        this.branch = obj.branch;
        this.score = obj.score;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student1 s1 = new Student1(23,"Rahul","IT",73.50);
        Student1 s2 = new Student1(45,"Tejas");
        Student1 s3 = new Student1(56,"John","CS");
        Student1 copyS3 = new Student1(s3);
    }
}
