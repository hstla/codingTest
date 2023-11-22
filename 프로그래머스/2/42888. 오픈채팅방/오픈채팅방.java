import java.util.*;

class Solution {
    
    public static Map<String, String> nameMap = new HashMap();
    
    public List<String> solution(String[] record) {
        for (int i = 0;i < record.length;i++) {
            String[] tmp = record[i].split(" ");
            if (tmp.length == 3) {
                nameMap.put(tmp[1], tmp[2]);    
            }
        }
        // System.out.println(nameMap.get("uid4567"));
        
        List<String> answer = new ArrayList<>();
        for (int i = 0;i < record.length;i++) {
            String[] tmp = record[i].split(" ");
            if ("Enter".equals(tmp[0])) {
                answer.add(nameMap.get(tmp[1])+"님이 들어왔습니다.");
            }
            if ("Leave".equals(tmp[0])) {
                answer.add(nameMap.get(tmp[1])+"님이 나갔습니다.");
            }
        }
        // for (String s : answer) {
        //     System.out.println(s);
        // }
        return answer;
    }
}