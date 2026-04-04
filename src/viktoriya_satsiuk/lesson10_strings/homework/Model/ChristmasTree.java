package viktoriya_satsiuk.lesson10_strings.homework.Model;

public class ChristmasTree extends Tree {
    private int countToys;

    public ChristmasTree(int id, String name, TypeTree typeTree, int countToys) {
        super(id, name, typeTree);
        this.countToys = countToys;
    }

    public int getCountToys() {
        return countToys;
    }

    public void setCountToys(int countToys) {
        this.countToys = countToys;
    }

}
