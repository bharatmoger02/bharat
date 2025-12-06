class Student {
    String name;
    int rollno;
    Student(String name, int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
    public static void main(String[] args){
        Student s1 = new Student("bharat", 19);
        Student s2 = new Student("abc", 12);
        System.out.println(s1.name + s1.rollno);
    }
}