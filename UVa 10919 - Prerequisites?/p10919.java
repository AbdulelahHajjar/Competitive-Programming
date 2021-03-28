// Term 191 - Week 10
//Prerequisites?
//10919
import java.util.Scanner;
import java.util.ArrayList;
public class p10919 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<String>();
        int numCourses, numCategories, numCoursesInCategory, minNumCoursesTaken = 0, counter = 0;
        String tempCourse = "";
        boolean willGraduate;

        numCourses = kb.nextInt();
        while (numCourses > 0) {
            courses.clear();
            willGraduate = true;
            numCategories = kb.nextInt();
            tempCourse = kb.next();

            while(tempCourse.length() == 4) {
                courses.add(tempCourse);
                tempCourse = kb.next();
            }

            numCoursesInCategory = Integer.valueOf(tempCourse);

            for (int i = 0; i < numCategories; i++) {
                counter = 0;
                if(i > 0)
                    numCoursesInCategory = kb.nextInt();
                minNumCoursesTaken = kb.nextInt();

                for(int j = 0; j < numCoursesInCategory; j++)
                    if(courses.contains(kb.next())) {
                        counter++;
                }

                if(counter >= minNumCoursesTaken && willGraduate)
                    willGraduate = true;
                else
                    willGraduate = false;
            }

            if(willGraduate)
                System.out.println("yes");
            else
                System.out.println("no");
            numCourses = kb.nextInt();
        }
        kb.close();
    }
}
