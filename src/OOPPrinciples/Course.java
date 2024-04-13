package OOPPrinciples;

public class Course {

    private int courseId;
    private String title;

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private String description;
    private double price;

    private Teacher teacher;
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String courseInfo(){
        return "Course Description \n" +
                "Course Title: " + this.getTitle()  + "\n" +
                "Course Description: " + this.getDescription() + "\n" +
                "Course Price : " + this.getPrice() + "\n" +
                "Teacher: " + this.getTeacher().getFirstName() + " " + this.getTeacher().getLastName();
    }



    @Override
    public String toString(){
        return this.title;
    }




}

