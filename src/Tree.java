import java.awt.*;

public class Tree {
    private double heightFt;
    private double trunkDiameterInches;
    private final TreeType treeType;
    static Color TRUNK_COLOR = new Color(102,51,0);

    public Tree(double heightFt, double trunkDiameterInches,
         TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    public void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    public void isTallTree() {
        if (this.heightFt > 100) {
            System.out.println(this.treeType + " is a tall tree!");
        } else {
            System.out.println(this.treeType + " is not a tall tree.");
        }
    }

    public TreeType getTreeType() {
        return this.treeType;
    }

    public double getHeightFt() {
        return this.heightFt;
    }

    public double getTrunkDiameterInches() {
        return this.trunkDiameterInches;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }
}
