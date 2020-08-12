import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduleII210 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer, DependentTreeNode> map = new HashMap<>();

        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prerequisite = pre[1];

            if (map.containsKey(prerequisite)) {
                DependentTreeNode child = new DependentTreeNode(course);
                map.get(prerequisite).addChildren(child);
                child.addParent(map.get(prerequisite));
                map.putIfAbsent(course, child);
            } else {
                DependentTreeNode node = new DependentTreeNode(prerequisite);
                DependentTreeNode child = new DependentTreeNode(course);
                map.put(prerequisite, node);
                map.putIfAbsent(course, child);
                child.addParent(node);
                node.addChildren(child);
            }
        }

        Queue<DependentTreeNode> re = new LinkedList<>();
        for(DependentTreeNode n : map.values()){
            if(n.parent == null){
                re.add(n);
            }
        }

        HashSet<Integer> result = new HashSet<>();
        while(!re.isEmpty()){
            DependentTreeNode n = re.remove();
            result.add(n.val);

            for(DependentTreeNode c : n.children){
                re.add(c);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

    }
}