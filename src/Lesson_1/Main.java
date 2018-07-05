package Lesson_1;

import Lesson_1.Competitor.Cat;
import Lesson_1.Competitor.Dog;
import Lesson_1.Competitor.Human;
import Lesson_1.Competitor.Team;
import Lesson_1.Obstacle.Course;
import Lesson_1.Obstacle.Cross;
import Lesson_1.Obstacle.Wall;

public class Main {
    public static void main(String[] args) {

        Team team = new Team("Rocket", new Human("Bob"), new Cat("Vaska"), new Dog("Bobik"));
        Course course = new Course(new Cross(80), new Wall(2), new Wall(1), new Cross(120));
        course.doIt(team);
        team.showWinners();

    }
}

