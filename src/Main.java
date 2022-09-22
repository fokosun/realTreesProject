public class Main {

    public static void main(String[] args) {
        Tree oakTree = new Tree(125, 5, TreeType.OAKTREE);
        Tree mapleTree = new Tree(25, 5, TreeType.MAPLETREE);

        mapleTree.grow();
        oakTree.grow();

        oakTree.isTallTree();
        mapleTree.isTallTree();

        System.out.println(Tree.TRUNK_COLOR.getAlpha());
    }
}
