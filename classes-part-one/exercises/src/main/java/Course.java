import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String topic;
    private String instructor;
    private ArrayList<Student> enrolledStudents;



    public Course(String topic, String instructor, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    public String getTopic() {
        return topic;
    }

    public String getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String toString() {
        int classSize = enrolledStudents.size();
        String myOutput = String.format("The course '%s' is taught by Prof. %s and has %i students enrolled", this.topic, this.instructor, classSize);
        return myOutput;
    }

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null || toBeCompared.getClass() != getClass()) {
            return false;
        }

        Course someCourse = (Course) toBeCompared;
        return someCourse.getTopic() == getTopic();
    }
}

