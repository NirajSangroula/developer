// File: `src/dipan/Student.java`
package dipan.school;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Integer> marks;

    public Student(int id, String name, int expectedSubjects) {
        this.id = id;
        this.name = name;
        this.marks = new ArrayList<>(expectedSubjects);
    }

    public void addMark(int mark) {
        marks.add(mark);
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < marks.size(); i++) { // requirement: use for loop
            total += marks.get(i);
        }
        return total;
    }

    public double getAverage() {
        if (marks.isEmpty()) return 0.0;
        return (double) getTotal() / marks.size();
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) {
            return "A";
        } else if (avg >= 75) {
            return "B";
        } else if (avg >= 60) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public boolean isPass() {
        return getAverage() >= 60.0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}