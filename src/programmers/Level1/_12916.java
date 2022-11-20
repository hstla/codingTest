package programmers.Level1;
//문자열 내 p와 y의 개수

public class _12916 {
  boolean solution(String s) {
    boolean answer = true;
    int pcount = 0;
    int ycount = 0;
    for (char c :s.toLowerCase().toCharArray()) {
      if (c=='p') pcount++;
      if (c=='y') ycount++;
    }
    if (pcount!=ycount) return false;
    return answer;
  }
}
