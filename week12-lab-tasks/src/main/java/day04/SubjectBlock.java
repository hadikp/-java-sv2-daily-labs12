package day04;

public class SubjectBlock {

    private String name;
    private String subject;
    private String gradeAndClass;
    private int lessonsNumber;

    public SubjectBlock(String name, String subject, String gradeAndClass, int lessonsNumber) {
        this.name = name;
        this.subject = subject;
        this.gradeAndClass = gradeAndClass;
        this.lessonsNumber = lessonsNumber;
    }

    public String getName() {
        return name;
    }

    public int getLessonsNumber() {
        return lessonsNumber;
    }

    @Override
    public String toString() {
        return name + ": " + subject + ", " + gradeAndClass + ", " + lessonsNumber;
    }
}
