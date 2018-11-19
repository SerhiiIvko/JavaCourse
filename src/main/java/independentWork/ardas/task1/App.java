//package independentWork.ardas.task1;
////Написать консольное приложение на java, с использованием maven.
////Приложение должно выводить на экран приветственное сообщение, в зависимости от текущего времени суток.
////Good morning, World! в 06:00 - 09:00
////Good day, World! в 09:00 - 19:00
////Good evening, World! в 19:00 - 23:00
////Good night, World! в 23:00 - 06:00
////Код должен содержать все возможные юнит-тесты и создавать читабельный лог файл.
////Выводящиеся на консоль сообщения должны быть получены из message resource и зависеть от системной локали пользователя.
////Сделать перевод на русский язык.
////Код решения должен быть опубликован на GitHub’е без упоминания названия компании.
////В README должен присутствовать статус сборки от Travis CI (https://docs.travis-ci.com/user/status-images/)
////или Circle CI (https://circleci.com/docs/status-badges) в виде бейджика, по клику на который происходит
////переход на страницу сборки. Сборка должна быть успешной, во время сборки должны проходить тесты. Пример
////проекта с бейджиками - https://github.com/codecentric/spring-boot-admin
////README или любой другой файл в репозитории не должен содержать текст задания.
//
//import java.util.Date;
//import java.util.logging.Logger;
//
//public class App {
//    private static final Logger LOG = Logger.getLogger(String.valueOf(App.class));
//
//    public static void main(String[] args) {
//        // think that this small app must has log only in one place,
//        // but put here another one to show knowledge working with it :)
//        LOG.info("Yahooo, we have new request!");
//        MessageBuilder welcomeMessageCreator = new MessageBuilderImpl();
//        Message msg = welcomeMessageCreator.buildMessage(new Date().getHours());
//        msg.printMessage();
//    }
//}