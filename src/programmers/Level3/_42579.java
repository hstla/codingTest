package programmers.Level3;

import java.util.*;

/*
베스트 앨범
너무 어렵
 */
public class _42579 {
    static public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> totalPlays = new HashMap<>(); // 장르별 총 재생 횟수
        Map<String, PriorityQueue<int[]>> genreSongs = new HashMap<>(); // 장르별 노래 정보 (재생 횟수, 고유번호)

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            int[] song = new int[]{play, i};

            // 장르별 총 재생 횟수 계산
            totalPlays.put(genre, totalPlays.getOrDefault(genre, 0) + play);

            // 장르별 노래 정보 저장
            if (!genreSongs.containsKey(genre)) {
                genreSongs.put(genre, new PriorityQueue<>((a, b) -> {
                    if (a[0] != b[0]) {
                        return b[0] - a[0]; // 재생 횟수 내림차순
                    } else {
                        return a[1] - b[1]; // 고유번호 오름차순
                    }
                }));
            }
            genreSongs.get(genre).add(song);
        }

        // 장르별로 베스트 앨범에 들어갈 노래 선택
        List<Integer> bestSongs = new ArrayList<>();
        List<String> genresList = new ArrayList<>(totalPlays.keySet());
        Collections.sort(genresList, (a, b) -> totalPlays.get(b) - totalPlays.get(a)); // 총 재생 횟수 내림차순 정렬

        for (String genre : genresList) {
            PriorityQueue<int[]> pq = genreSongs.get(genre);
            int cnt = 0;
            while (!pq.isEmpty() && cnt < 2) {
                int[] song = pq.poll();
                bestSongs.add(song[1]);
                cnt++;
            }
        }

        // 리스트를 배열로 변환하여 반환
        int[] answer = new int[bestSongs.size()];
        for (int i = 0; i < bestSongs.size(); i++) {
            answer[i] = bestSongs.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] arr1 = {"classic", "pop", "classic", "classic", "pop"};
        int[] arr2 = {500, 600, 150, 800, 2500};
        for (int i : solution(arr1, arr2)) System.out.print(i + " ");
    }
}
