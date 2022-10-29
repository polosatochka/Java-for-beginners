package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student){
        Random random = new Random();
        int number = random.nextInt(6-2)+2;
        String mark = null;
        switch (number){
            case 5:
                mark = "отлично";
                break;
            case 4:
                mark = "хорошо";
                break;
            case 3:
                mark = "удовлетворительно";
                break;
            case 2:
                mark = "неудовлетворительно";
                break;
        }
        System.out.println("Преподаватель "+ getName() +" оценил студента с именем "+ student.getName()+ " по предмету "+ getSubject() +" на оценку "+ mark);
    }
}
