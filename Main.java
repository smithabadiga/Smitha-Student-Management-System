import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        StudentManager stdmanager=new StudentManager();
        Student student=new Student(101, "smitha", "CSE");
        Student student1=new Student(102, "siri", "b-pharm");
        Student student2=new Student(103, "nithin", "Mpc");
        Student student3=new Student(104, "tharun", "diploma");
        stdmanager.addStudent(student);
        stdmanager.addStudent(student1);
        stdmanager.addStudent(student2);
        stdmanager.addStudent(student3);
        while(true){
            System.out.println("1. Add Student\n" + //
                        "2. View Students\n" + //
                        "3. Search Student\n" + //
                        "4. Update Student\n" + //
                        "5. Delete Student\n" + //
                        "6. Exit\n");
            System.out.println("enter your choice:");  
            int choice=obj.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter ID:");
                    int studentID=obj.nextInt();
                    obj.nextLine();
                    System.out.println("enter name:");
                    String studentName=obj.nextLine();
                    System.out.println("enter course:");
                    String studentCourse=obj.nextLine();
                    Student std=new Student(studentID, studentName, studentCourse);
                    stdmanager.addStudent(std);
                    System.out.println("added successfully");
                    break;
                case 2:
                    stdmanager.viewstudents();
                    break;
                case 3:
                    System.out.println("enter ID:");
                    int searchID=obj.nextInt();
                    stdmanager.searchStudent(searchID);
                    break;
                case 4:
                    System.out.println("enter ID for update:");
                    int updateID=obj.nextInt();
                    obj.nextLine();
                    System.out.println("enter newname:");
                    String newName=obj.nextLine();
                    System.out.println("enter newcourse:");
                    String newCourse=obj.nextLine();
                    stdmanager.updateStudent(updateID, newName, newCourse);
                    break;
                case 5:
                    System.out.println("enter ID for delete:");
                    int deleteID=obj.nextInt();
                    obj.nextLine();
                    stdmanager.deleteStudent(deleteID);
                    break;
                case 6:
                    System.out.println("you are exiting");
                    return;
           }
          
        } 
        
    }
}
