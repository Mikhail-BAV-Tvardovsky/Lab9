import java.util.ArrayList;
import java.util.List;

@Table(title = "Ant52")
public class Ant {
    private static final List<Ant> antInstances = new ArrayList<>();

    public enum InsectColor {
        ЧЕРНЫЙ, БЕЛЫЙ, ЖЕЛТЫЙ;
    }

    @Column
    private String name;

    @Column
    private int lifespan;

    @Column
    private InsectColor color;

    public Ant(String name, int lifespan, InsectColor color) {
        this.name = name;
        this.lifespan = lifespan;
        this.color = color;
        antInstances.add(this);  // Добавляем текущий объект в список
    }

    public static List<Ant> getAllInstances() {
        return antInstances;
    }
}