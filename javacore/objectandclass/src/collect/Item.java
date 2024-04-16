package collect;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Item implements Comparable<Item> {
    public String getDescription() {
        return description;
    }

    public int getPartNumber() {
        return partNumber;
    }

    private String description;
    private int partNumber;

    public Item(String description, int partNumber) {
        this.description = description;
        this.partNumber = partNumber;
    }

    @Override
    public int compareTo(Item o) {
        int diff = Integer.compare(partNumber, o.partNumber);
        return diff != 0 ? diff : description == null ? 0 :description.compareTo(o.description);
    }

    @Override
    public String toString() {
        return "[" +
                "description='" + description + '\'' +
                ", partNumber=" + partNumber +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Item item)) return false;
        return partNumber == item.partNumber && Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }
}