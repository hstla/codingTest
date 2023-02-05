package _1stringCodingTest;//4. n을 받은 후 n개의 단어 뒤집기
import java.util.ArrayList;
import java.util.Scanner;

public class _4flipWord {
    //SringBuilder는 객체를 생성하지 않아 String을 쓰는 것보다 메모리 절약이 가능
    public ArrayList<String> solution(int n, String[] str){
         ArrayList<String> answer = new ArrayList<>();
         for(String x : str){
             String tmp = new StringBuilder(x).reverse().toString();
             answer.add(tmp);
         }
         return answer;
    }
    //직접 단어 뒤집기
//    public ArrayList<String> solution(int n, String[] str){
//        ArrayList<String> answer = new ArrayList<>();
//        for(String x : str){
//            char[] s = x.toCharArray();
//            int lt=0, rt = x.length()-1;
//            while(lt<rt){
//                char tmp = s[lt];
//                s[lt] = s[rt];
//                s[rt] = tmp;
//                lt++;
//                rt--;
//            }
//            String tmp = String.valueOf(s);
//            answer.add(tmp);
//        }
//        return answer;
//    }

    public static void main(String[] args){
         _4flipWord T = new _4flipWord();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
         String[] str =new String[n];
        for(int i=0;i<n;i++){
          str[i]= kb.next();
         }
        for(String x : T.solution(n, str)){
             System.out.println(x);
        }
    }
}
