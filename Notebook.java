import java.util.UUID;

public class Notebook {

    public final String name;
    public final Color color;
    public final Integer price;
    public final Integer memory;
    public final UUID id;

    Notebook(String name, Color color, Integer price, Integer memory) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.color = color;
        this.price = price;
        this.memory = memory;
    }
}
