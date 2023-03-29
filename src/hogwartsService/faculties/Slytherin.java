package hogwartsService.faculties;

import hogwartsService.Hogwarts;

public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public Slytherin(String name, String surname, int sorceryPower, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, sorceryPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void printStudent() {
        System.out.printf("Студент Слизерина %s %s.\n" +
                        "Сила колдовста: %d\n" +
                        "Хитрость: %d\n" +
                        "Решительность: %d\n" +
                        "Амбициозность: %d\n" +
                        "Находчивость: %d\n" +
                        "Жажда власти: %d\n",
                this.getName(),
                this.getSurname(),
                this.getSorceryPower(),
                this.getCunning(),
                this.getDetermination(),
                this.getAmbition(),
                this.getResourcefulness(),
                this.getThirstForPower()
        );
    }


    public void equalsFacultyStudents(Slytherin student) {
        int sumStud1 = this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower;
        int sumStud2 = student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.thirstForPower;
        if (sumStud1 > sumStud2) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Слицеринец, чем " + student.getName() + " " + student.getSurname());
        } else if (sumStud1 < sumStud2) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Слицеринец, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(this.getName() + " " + this.getSurname() + " такой же Слицеринец, как и " + student.getName() + " " + student.getSurname());
        }
    }
}
