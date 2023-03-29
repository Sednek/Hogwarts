package hogwartsService.faculties;

import hogwartsService.Hogwarts;

public class Ravenclaw extends Hogwarts {
    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creation;

    public Ravenclaw(String name, String surname, int sorceryPower, int mind, int wisdom, int wit, int creation) {
        super(name, surname, sorceryPower);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    public void printStudent() {
        System.out.printf("Студент Когтеврана %s %s.\n" +
                        "Сила колдовста: %d\n" +
                        "Ум: %d\n" +
                        "Мудрость: %d\n" +
                        "Остроумие: %d\n" +
                        "Творчество: %d\n",
                this.getName(),
                this.getSurname(),
                this.getSorceryPower(),
                this.getMind(),
                this.getWisdom(),
                this.getWit(),
                this.getCreation()
        );
    }

    public void equalsFacultyStudents(Ravenclaw student) {
        int sumStud1 = this.mind + this.wisdom + this.wit + this.creation;
        int sumStud2 = student.getMind() + student.getWisdom() + student.getWit() + student.getCreation();
        if (sumStud1 > sumStud2) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Когтевранец, чем " + student.getName() + " " + student.getSurname());
        } else if (sumStud1 < sumStud2) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Когтевранец, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(this.getName() + " " + this.getSurname() + " такой же Когтевранец, как и " + student.getName() + " " + student.getSurname());
        }
    }
}
