package OOPPrinciples;

public class Enrollments{
    Course course;
    Student student;

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String enrollmentInfo(){
        return "Student " + this.getStudent().getFirstName() + " " + this.getStudent().getLastName() + "\n" +
                "Enrolled to the course " + this.getCourse().getTitle() + " which is thought by Teacher " + this.getCourse().getTeacher().getFirstName() +
                " "  + this.getCourse().getTeacher().getLastName();
    }
}

