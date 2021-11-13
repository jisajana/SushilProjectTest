package Day27.Question2;

import java.util.ArrayList;

public class EnrollCourse {

    ArrayList<Course> courseArrayList;

    public EnrollCourse() {
        this.courseArrayList = new ArrayList<>();
    }

    public Course getCourse(int id) throws Exception {
        for (Course course : courseArrayList) {
            if (course.getId() == id) {
                return course;
            }
        }
        throw new Exception();
    }

}



