package finder;

import ru.job4j.io.duplicates.FileProperty;

import java.util.Objects;
import java.util.StringJoiner;

public class FinderProperty {
    private long size;

    private String name;

    public FinderProperty(long size, String name) {
        this.size = size;
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FinderProperty that = (FinderProperty) o;
        return size == that.size && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "Файлы найдены" + " ", " ")
                .add("по пути: '" + name + "'")
                .add(" размер файла " + size + " Kb.")
                .toString();
    }
}

