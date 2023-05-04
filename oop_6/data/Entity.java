package oop_6.data;

// Общие присущие всем сущнастям в модели в  класс а также на будущее сюда добвалять логику для расширения методы и т.д.
public class Entity {

    private Long Id;

    protected Long getId() {
        return this.Id;
    }

    protected void setId(Long id) {
        this.Id = id;
    }
}
