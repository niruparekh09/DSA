package LeetCode;

import java.util.*;

public class List_Of_Requests {
    public static List<String> getLatestRequests(List<String> requests, int K) {
        HashSet<String> distinctReq = new LinkedHashSet<>();
        for (int i = requests.size() - 1; i >= 0; i--) {
            distinctReq.add(requests.get(i));
            if (distinctReq.size() == K) {
                break;
            }
        }
        return new ArrayList<>(distinctReq);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("item3", "item2", "item1", "item2", "item3");
        List<String> ans = getLatestRequests(list, 3);
        ans.forEach(System.out::println);
    }
}
