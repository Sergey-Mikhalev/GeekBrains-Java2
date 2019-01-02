package Marathon;

import Marathon.Animal.Cat;
import Marathon.Animal.Dog;
import Marathon.Obstacle.*;

public class Main {
    public static void main(String[] args) {

        Course course = new Course(new Cross(50), new Wall(3), new Cross(100), new Water(5), new Cross(10));
        Team team = new Team("Герои", new Human("Карлосн"), new Dog(" Тотошка"), new Cat("граф Соловьев"), new Human("Снорк"));
        course.doIt(team);
        team.showInfo();
        team.showWinnerTeam();


    }
}
