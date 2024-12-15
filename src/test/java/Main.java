import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Ant ant =
        new Ant("Муравей Силач", 12, Ant.InsectColor.ЧЕРНЫЙ);
        new Ant("Муравей Глупыш", 29, Ant.InsectColor.БЕЛЫЙ);
        new Ant("Муравей Красавчик", 10, Ant.InsectColor.ЖЕЛТЫЙ);
        new Ant("Муравей Гонщик", 4, Ant.InsectColor.ЧЕРНЫЙ);
        new Ant("Муравей Мудрец", 99, Ant.InsectColor.БЕЛЫЙ);
        new Ant("Муравей Зачинщик", 78, Ant.InsectColor.ЖЕЛТЫЙ);
        new Ant("Муравей Воин", 52, Ant.InsectColor.ЧЕРНЫЙ);
        new Ant("Муравей Главарь", 35, Ant.InsectColor.БЕЛЫЙ);
        new Ant("Муравей Задира", 17, Ant.InsectColor.ЖЕЛТЫЙ);
        // Создаем таблицу один раз
        Annotation.createTable(ant);

        // Получаем все экземпляры Eagle и вставляем их в таблицу
        List<Ant> ants = Ant.getAllInstances();
        for (Ant e : ants) {
            Annotation.insertIntoTable(e);
        }
    }
}
