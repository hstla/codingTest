class Solution {
    public String predictPartyVictory(String senate) {
        List<Character> senateList = new ArrayList<Character>();
        for (char c : senate.toCharArray()) {
            senateList.add(c);
        }
        Deque<Integer> D = new LinkedList<>();
        Deque<Integer> R = new LinkedList<>();
        for (int i = 0; i < senateList.size(); i++) {
            char c = senateList.get(i);
            if (c == 'R') {
                R.add(i);
            } else {
                D.add(i);
            }
        }
        while (!D.isEmpty() && !R.isEmpty()) {
            int dTurn = D.pollFirst();
            int rTurn = R.pollFirst();
            if (rTurn < dTurn) {
                R.add(rTurn + senateList.size());
            } else {
                D.add(dTurn + senateList.size());
            }
        }
        return R.isEmpty() ? "Dire" : "Radiant";
    }
}