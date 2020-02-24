public class Student {

    private String name;
    private String className;
    private int stuID;
    private double average;
    private char letterGrade;

    public Student() {
        name = "Default";
        className = "Default Class";
        stuID = -1;
        average = -1;
        letterGrade = 'F';
    }

    public Student(String name, int stuID, String className) {
        this.name = name;
        this.stuID = stuID;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public int getStuID() {
        return stuID;
    }

    public double getAverage() {
        return average;
    }

    public char getLetterGrade() {
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        return letterGrade;
    }

    public void setName(String userName) {
        name = userName;
    }

    public void setClassName(String userClass) {
        className = userClass;
    }

    public void setStuID(int userID) {
        stuID = userID;
    }

    public void setAverage(double userAverage) {
        average = userAverage;
    }
}
