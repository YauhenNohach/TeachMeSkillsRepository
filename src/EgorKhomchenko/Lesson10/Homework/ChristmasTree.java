package EgorKhomchenko.Lesson10.Homework;

public class ChristmasTree extends Tree {
    private int countToys;

    public ChristmasTree(int id, String name, int countToys) {
        super(id, name, TreeType.CHRISTMAS);
        this.countToys = countToys;
    }

    public int getCountToys() { return countToys; }
    public void setCountToys(int countToys) { this.countToys = countToys; }

    @Override
    public String toString() {
        return "ChristmasTree{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", countToyes=" + countToys +
                '}';
    }
}