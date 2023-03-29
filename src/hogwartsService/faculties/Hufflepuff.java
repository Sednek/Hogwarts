package hogwartsService.faculties;

import hogwartsService.Hogwarts;

public class Hufflepuff extends Hogwarts {
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, String surname, int sorceryPower, int diligence, int loyalty, int honesty) {
        super(name, surname, sorceryPower);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void printStudent() {
        System.out.printf("Студент Пуффендуя %s %s.\n" +
                        "Сила колдовста: %d\n" +
                        "Трудолюбие: %d\n" +
                        "Верность: %d\n" +
                        "Честность: %d\n",
                this.getName(),
                this.getSurname(),
                this.getSorceryPower(),
                this.getDiligence(),
                this.getLoyalty(),
                this.getHonesty()
        );
    }

    public void equalsFacultyStudents(Hufflepuff student) {
        int sumStud1 = this.diligence + this.loyalty + this.honesty;
        int sumStud2 = student.getDiligence() + student.getLoyalty() + student.getHonesty();
        if (sumStud1 > sumStud2) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Пуффендуец, чем " + student.getName() + " " + student.getSurname());
        } else if (sumStud1 < sumStud2) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Пуффендуец, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(this.getName() + " " + this.getSurname() + " такой же Пуффендуец, как и " + student.getName() + " " + student.getSurname());
        }
    }
}
