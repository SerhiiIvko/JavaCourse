package classworks.march2018.mar222018.homework.task1;

/**
 * 1)Создать объект класса Компьютер, используя классы Винчестер, Дисковод, Оперативная память, Процессор.
 * Методы: включить, выключить, проверить на вирусы, вывести на консоль размер винчестера.
 */
public class CompRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.on();
        computer.virusFinder();
        computer.getHddSize();
        computer.off();
    }
}
//Разложил составные части компьютера в отдельный пакет таким образом, чтобы в мэйне нельзя было отдельно включить
//что-то из устройств отдельно от системного блока. Наружу "торчит" только системный блок, на основе которого класс
//компьютер может создать экземпляр. Вирусы рандомно генерятся и если сгенерились - лечатся, если нет - не найдены.