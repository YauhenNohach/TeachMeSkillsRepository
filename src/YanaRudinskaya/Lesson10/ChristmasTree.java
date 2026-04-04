package YanaRudinskaya.Lesson10;

public class ChristmasTree extends Tree {

    private int countToyes;

    public ChristmasTree(int id, String name, TypeTree typeTree, int countToyes) {
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
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", type=" + getTypeTree() +
                ", countToys=" + countToyes +
                '}';
    }
}