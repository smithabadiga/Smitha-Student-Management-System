import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> student=new ArrayList<>();
    public void addStudent(Student std){
      student.add(std);

    }    
    public void viewstudents(){
        for(int i=0;i< student.size();i++){
            Student std=student.get(i);
            std.displayStudent();
        }
    }
    public void searchStudent(int studentID){
         boolean found=false;
         for(int i=0;i<student.size();i++){
            Student currentstd=student.get(i);
            if(currentstd.studentID==studentID){
               found=true;
               System.out.println("student datails found");
               currentstd.displayStudent();
               return;
            }
         }
         if(!found){
            System.out.println("student datails not found");
         }
    }
    public void deleteStudent(int studentID){
        for(int i=0;i<student.size();i++){
            Student currentstd=student.get(i);
            if(currentstd.studentID==studentID){
                student.remove(currentstd);
                System.out.println("student successfully deleted!");
                return;
            }
        
        }
        System.out.println("ID not found");    
    }
    public void updateStudent(int studentID,String newName,String newCourse){
        for(int i=0;i<student.size();i++){
            Student currentstd=student.get(i);
            if(currentstd.studentID==studentID){
                currentstd.studentName=newName;
                currentstd.studentCourse=newCourse;
                System.out.println("student data updated successfully😍");
                return;
            }
        }  
        System.out.println("student Id not found");  
    }
}

