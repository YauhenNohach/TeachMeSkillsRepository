package veranika_slesarchyk.lesson10_string_processing.practice.model.type;

public class ChristmasTree extends Tree {
    private int countToys;

    public ChristmasTree(int id, String name, int countToys) {
        super(id, name, TypeTree.CHRISTMAS);
        this.countToys = countToys;
    }

    public int getCountToys() {
        return countToys;
    }

    public void setCountToys(int countToys) {
        this.countToys = countToys;
    }
}
