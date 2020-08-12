import java.util.ArrayList;

public class DependentTreeNode{
    int val;
    ArrayList<DependentTreeNode> children;
    int childSize;
    DependentTreeNode parent;

    DependentTreeNode(int v){
        this.val = v;
        this.children = new ArrayList<>();
        this.childSize= 0;
    }

    public void addParent(DependentTreeNode p){
        this.parent = p;
    }

    public DependentTreeNode getParent(){
        return this.parent;
    }

    public void addChildren(DependentTreeNode child){
        this.children.add(child);
        this.childSize +=1;
    }

    public ArrayList<DependentTreeNode> getChildren(){
        return this.children;
    }
}