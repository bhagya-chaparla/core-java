public class StudentManagementSystem{
    public static void main(String[] args) {
       int id =405;
       String name ="Bhagya";
       int age=22;
       int quiz=75;
       int assignment=80;
       int exam=85;
       int attendance=82;
       System.out.println("Student ID:"+id);
       System.out.println("Stduent Name:"+name);
       System.out.println("Student Age:"+age);
       System.out.println("Quiz Marks:"+quiz);
       System.out.println("Assignment Marks:"+assignment);
       System.out.println("Exam Marks:"+exam);
       System.out.println("Attendance:"+attendance);
       int totalscore = quiz + assignment + exam;
       System.out.println("totalscore of a student:"+totalscore);
       int average = totalscore/3;
       System.out.println("average score of a student:"+average);
       boolean passed = average > 75;
       System.out.println("student passed:"+passed);
       int dailyattendance = attendance+1;
       System.out.println("Increased Attendance by one day:" +dailyattendance);
       boolean awarded = (average>=80) && (dailyattendance>75);
       System.out.println("Student get awarded:"+awarded);
    }
}