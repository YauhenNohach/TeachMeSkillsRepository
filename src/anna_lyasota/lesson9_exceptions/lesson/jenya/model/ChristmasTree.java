package anna_lyasota.lesson9_exceptions.lesson.jenya.model;

import anna_lyasota.lesson9_exceptions.lesson.jenya.model.type.TreeType;

public class ChristmasTree extends Tree {
    private int countToyes;

    public ChristmasTree(int countToyes) {
        this.countToyes = countToyes;
    }

    public ChristmasTree(int id, String name, TreeType typeTree, int countToyes) {
        super(id, name, typeTree);
        this.countToyes = countToyes;
    }

    public int getCountToyes() {
        return countToyes;
    }

    public void setCountToyes(int countToyes) {
        this.countToyes = countToyes;
    }

    @Override
    public String toString() {
        return "ChristmasTree{" +
                "countToyes=" + countToyes +
                '}';
    }
}
