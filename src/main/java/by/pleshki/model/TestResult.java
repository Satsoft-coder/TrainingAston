package by.pleshki.model;

public class TestResult {
    private Student student;
    private Course course;
    private Teacher teacher;
    private int subjectGrade;

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getSubjectGrade() {
        return subjectGrade;
    }

    @Override
    public String toString() {
        return "Результат: " + student +", "+ course+", " + teacher +
                ", Оценка=" + subjectGrade;
    }

    public TestResult(Student student, Course course, Teacher teacher, int subjectGrade) {
        this.student = student;
        this.course = course;
        this.teacher = teacher;
        this.subjectGrade = subjectGrade;
    }
}
