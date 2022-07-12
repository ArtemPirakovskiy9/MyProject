import java.util.Scanner;

public class Student {
    private  String firstName;
    private  String lastName;
    private  int gradeYear;
    private  String studentID;
    private  String courses=null;
    private  int balance=0;
    private static int costOfCourse=600;
    private static int id=1000;


    public Student(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName= in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName= in.nextLine();

        System.out.println("Enter student class level: ");
        this.gradeYear= in.nextInt();
        setStudentId();

    }

    private void setStudentId(){
        id++;
       this.studentID= gradeYear+""+ id;

    }
    public void enroll(){
        do {


        System.out.print("Enter course to enroll(Q to quite): ");
        Scanner in=new Scanner(System.in);
        String course=in.nextLine();
        if (!course.equals("Q")){
            courses=courses+"\n"+ course;
            balance=balance+costOfCourse;
                    }
        else{break;}
                }
        while (1!=0);
           }

    public void viewBalance(){
        System.out.println("Your balance is: $ " + balance);
    }
    public void payBalance(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in=new Scanner(System.in);
        int payment= in.nextInt();
        balance=balance-payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
    }

    public String showInfo(){
        return "Name:"+firstName+" "+ lastName+"\nGrade Level"+gradeYear +"\nStudent ID:" +studentID+"\nCourses Enrolled"+courses+"\nBalance: $"+ balance;
    }
}
