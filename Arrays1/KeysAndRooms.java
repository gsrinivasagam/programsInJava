import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class KeysAndRooms {
    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList();
        List newList = new ArrayList();
        newList.add(1);
        List newList2 = new ArrayList();
        newList2.add(2);
        List newList3 = new ArrayList();
        newList3.add(3);
        List newList4 = new ArrayList();
        rooms.add(newList);
        rooms.add(newList2);
        rooms.add(newList3);
        rooms.add(newList4);

        //List<List<Integer>> rooms = [[1],[2],[3],[]];
        System.out.println(canVisitAllRooms(rooms));
    }
        public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
            boolean[] vis = new boolean[rooms.size()];
            vis[0] = true;
            Stack<Integer> stack = new Stack<>();
            stack.push(0);
            int count = 1;
            while (stack.size() > 0)
                for (int k : rooms.get(stack.pop()))
                    if (!vis[k]) {
                        stack.push(k);
                        vis[k] = true;
                        count++;
                    }
            return rooms.size() == count;
        }
}
