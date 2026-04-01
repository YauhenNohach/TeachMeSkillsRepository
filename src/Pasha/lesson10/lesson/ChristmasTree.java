package Pasha.lesson10.lesson;

public class ChristmasTree extends Tree {
    private int countToys;

    public ChristmasTree(int id, String name, TypeTree typeTree) {
        super(id, name, typeTree);
    }

    public int getCountToys() {
        return countToys;
    }

    public void setCountToys(int countToys) {
        countToys++;
        this.countToys = countToys;
    }
}
