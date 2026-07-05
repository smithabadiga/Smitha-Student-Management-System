public class Student {
    int studentID;
    String studentName;
    String studentCourse;
    Student (int id,String name,String course){
      studentID=id;
      studentName=name;
      studentCourse=course;
    }
    void displayStudent(){
        System.out.println(studentID);
        System.out.println(studentName);
        System.out.println(studentCourse);
    }
}
