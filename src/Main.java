import hogwartsService.faculties.Griffindor;
import hogwartsService.faculties.Hufflepuff;
import hogwartsService.faculties.Ravenclaw;
import hogwartsService.faculties.Slytherin;

public class Main {
    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Гарри", "Поттер", 100, 10, 10, 10);
        Griffindor hermione = new Griffindor("Гермиона", "Грейнджер", 75, 9, 9, 9);
        Griffindor ron = new Griffindor("Рон", "Уизли", 50, 8, 8, 8);

        Hufflepuff zechariah = new Hufflepuff("Захария", "Смит", 65, 8, 7, 9);
        Hufflepuff cedric = new Hufflepuff("Седрик", "Диггори", 85, 10, 10, 10);
        Hufflepuff justin = new Hufflepuff("Джастин", "Финч-Флетчли", 55, 6, 7, 8);

        Ravenclaw zhou = new Ravenclaw("Чжоу", "Чанг", 67, 5, 6, 5, 4);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", 76, 3, 4, 5, 6);
        Ravenclaw markus = new Ravenclaw("Маркус", "Белби", 87, 8, 9, 6, 7);

        Slytherin draco = new Slytherin("Драко", "Малфой", 89, 10,10,10,10,10);
        Slytherin graham = new Slytherin("Грехем", "Монтегю", 45, 7,7,7,7,7);
        Slytherin gregory = new Slytherin("Грегори", "Гойл", 50, 5,6,7,8,7);

        harry.printStudent();
        cedric.printStudent();
        padma.printStudent();
        draco.printStudent();

        hermione.equalsFacultyStudents(ron);

        zechariah.equalsFacultyStudents(justin);

        zhou.equalsFacultyStudents(markus);

        draco.equalsFacultyStudents(graham);

        gregory.equalsStudents(draco);

        harry.equalsStudents(draco);


    }
}