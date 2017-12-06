package LESSON8;

/**
 * Пользователь: Dell
 * Дата: 05.12.2017
 * Время: 21:09
 * Проект: OMA-REPOSITIORY
 */
public class NamedEntity {
    private String name;

    public NamedEntity(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NamedEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
