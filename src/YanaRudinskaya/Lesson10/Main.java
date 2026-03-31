package YanaRudinskaya.Lesson10;

public class Main {
    public static void main(String[] args) {

        //Tree[] trees1 = new Tree[10];

        TreeService treeService = new TreeService();

        Tree LIPA1 = new OrdinaryTree(1, "LIPA", TypeTree.LIPA, 2000);
        Tree BEREZA1 = new OrdinaryTree(2, "BEREZA", TypeTree.BEREZA, 3000);
        Tree SOSNA1 = new ChristmasTree(3, "SOSNA", TypeTree.SOSNA, 20);
        OrdinaryTree LIPA2 = new OrdinaryTree(1, "LIPA2", TypeTree.LIPA, 4000);

        //add
        System.out.println("ADD:");
        treeService.add(LIPA1);
        treeService.add(BEREZA1);
        treeService.add(SOSNA1);
        treeService.printAll();

        //find
        System.out.println("FIND:");
        try {

            System.out.println(treeService.find(0));
        } catch (TreeNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //update
        System.out.println("UPDATE:");
        try {
            treeService.update(1, LIPA2);
        } catch (TreeNotFoundException e) {
            System.out.println(e.getMessage());
        }
        treeService.printAll();

        //delete
        System.out.println("DELETE:");
        try {
            treeService.delete(1);
        } catch (
                TreeNotFoundException e) {
            System.out.println(e.getMessage());
        }
        treeService.printAll();
    }
}
