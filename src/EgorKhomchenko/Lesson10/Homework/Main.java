package EgorKhomchenko.Lesson10.Homework;

public class Main {
    public static void main(String[] args) {
        TreeService treeService = new TreeService();

        try {

            treeService.add(new OrdinaryTree(1, "Oak", 200));
            treeService.add(new ChristmasTree(2, "Fir", 50));
            treeService.add(new OrdinaryTree(3, "Birch", 120));


            System.out.println("After adds:");
            treeService.printAll();


            System.out.println("Find id=2 -> " + treeService.find(2));


            OrdinaryTree updated = new OrdinaryTree();
            updated.setName("Birch (updated)");

            treeService.update(3, new OrdinaryTree(3, "Birch (updated)", 130));
            System.out.println("After update id=3 -> " + treeService.find(3));


            treeService.delete(1);
            System.out.println("After delete id=1:");
            treeService.printAll();


            try {
                treeService.find(1);
            } catch (TreeNotFoundExceptions ex) {
                System.out.println("Expected: " + ex.getMessage());
            }


            treeService.add(new ChristmasTree(4, "Spruce", 30));
            treeService.add(new OrdinaryTree(5, "Maple", 80));
            treeService.add(new OrdinaryTree(6, "Pine", 90)); // возможно триггер расширения
            System.out.println("After more adds:");
            treeService.printAll();

        } catch (TreeNotFoundExceptions e) {
            System.err.println("Tree not found: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
