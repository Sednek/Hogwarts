package hogwartsService.faculties;

import hogwartsService.Hogwarts;

public class Griffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Griffindor(String name, String surname, int sorceryPower, int nobility, int honor, int bravery) {
        super(name, surname, sorceryPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void printStudent() {
        System.out.printf("Студент Гриффиндора %s %s.\n" +
                        "Сила колдовста: %d\n" +
                        "Благородство: %d\n" +
                        "Честь: %d\n" +
                        "Храбрость: %d\n",
                this.getName(),
                this.getSurname(),
                this.getSorceryPower(),
                this.getNobility(),
                this.getHonor(),
                this.getBravery()
        );
    }

    public void equalsFacultyStudents(Griffindor student) {
        int sumStud1 = this.bravery + this.honor + this.nobility;
        int sumStud2 = student.getBravery() + student.getHonor() + student.getNobility();
        if (sumStud1 > sumStud2) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Гриффиндорец, чем " + student.getName() + " " + student.getSurname());
        } else if (sumStud1 < sumStud2) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Гриффиндорец, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(this.getName() + " " + this.getSurname() + " такой же Гриффиндорец, как и " + student.getName() + " " + student.getSurname());
        }
    }
}
