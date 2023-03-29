package hogwartsService;

public class Hogwarts {
    private final String name;
    private final String surname;
    private final int sorceryPower;

    public Hogwarts(String name, String surname, int sorceryPower) {
        this.name = name;
        this.surname = surname;
        this.sorceryPower = sorceryPower;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSorceryPower() {
        return sorceryPower;
    }

    public void equalsStudents(Hogwarts student){
        if (this.sorceryPower > student.getSorceryPower()){
            System.out.println(this.name + " " + this.surname + " обладает большей мощностью магии, чем " + student.getName() + " " + student.getSurname());
        } else if(this.sorceryPower < student.getSorceryPower()){
            System.out.println(student.getName() + " " + student.getSurname() + " обладает большей мощностью магии, чем " + this.name + " " + this.surname);
        } else {
            System.out.println(this.name + " " + this.surname + " и студент " + student.getName() + " " + student.getSurname() + " облдаюат одинаковой магической силой");
        }
    }
}