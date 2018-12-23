package homework;

//Повторить тему анотации
//если не успели создать проект Spring + Maven по примеру из видео то создать
//в проекте реализовать класс Robot
//содержащий три интерфейса
//Head
//Hand
//Leg
//напистаь классы реализующие их (хотя бы по одному)
//Каждый интерфейс содержит по одному методу вщзвращающий бренд детали (например getBrand() или PrintHead())
//указать в файле настройки спринга бин Робота
//Запустить приложение используя механизм Бинов

import homework.robot.IRobot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Robot {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        IRobot robot = (IRobot) context.getBean("r2d2");
        System.out.println(robot);
    }
}