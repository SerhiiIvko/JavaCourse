package classworks.march2018.mar152018.homework.task0;

/**
 * Создайте абстрактный класс Profession с приватными полями «Имя» и «Промышленность». У этого класса должен быть
 * абстрактный метод «Делать Работу».  Создайте класс «Разработчик» с приватным полем «Специальность», который наследует
 * класс Profession и реализует абстрактный метод. Так же создайте класс «Пилот», с приватным полем «Тип самолета»,
 * который также наследует класс Profession и реализует абстрактный метод. В классе Runner должны быть созданы экземпляры
 * классов «Пилот» и «Разработчик», а также экземпляр типа Profession который создает еще одного разработчика. Все
 * параметры задаются в конструкторе, конструкторы классов наследников основаны на конструкторе класса родителя. Так же
 * во всех классах где необходимо должны быть созданы методы для работы с параметрами и организован вывод данных (toString).
 */
abstract class Profession {
    private String name;
    private String industry;

    abstract void toWork();

    public Profession(String name, String industry) {
        this.name = name;
        this.industry = industry;
    }

    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }
}