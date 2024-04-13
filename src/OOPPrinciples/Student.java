package OOPPrinciples;

import java.util.ArrayList;

public class Student extends User{
    private String role = "STUDENT";

    ArrayList<Course> enrolledCourses = new ArrayList<>();



    public void enrollInCourse(Course course){
        this.enrolledCourses.add(course);
    }

    public void courses(){
        for(Course course : this.enrolledCourses){
            System.out.print(course.getTitle() + " ,");
        }
        System.out.println("\n");
    }

    @Override
    public void login(){
        System.out.println("Logged in");
        System.out.println("redirecting to student dashboard ");
    }




}

