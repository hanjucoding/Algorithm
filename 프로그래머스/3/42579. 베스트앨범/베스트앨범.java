import java.util.*;

class Solution {
    static class Album implements Comparable<Album>{
        int idx, playCnt;

        public Album(int idx, int playCnt) {
            this.idx = idx;
            this.playCnt = playCnt;
        }

        @Override
        public int compareTo(Album album) {
            if(this.playCnt == album.playCnt) {
                return this.idx - album.idx;
            } else {
                return album.playCnt - this.playCnt;
            }
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        int len = genres.length;
        Map<String, Integer> genreRank = new HashMap<>();
        Map<String, List<Album>> albumRank = new HashMap<>();

        for (int i = 0; i < len; i++) {
            genreRank.put(genres[i], genreRank.getOrDefault(genres[i], 0) + plays[i]);
            albumRank.putIfAbsent(genres[i], new ArrayList<>());
            albumRank.get(genres[i]).add(new Album(i, plays[i]));
        }

        List<String> sortedGenres = new ArrayList<>(genreRank.keySet());
        sortedGenres.sort((a, b) -> genreRank.get(b) - genreRank.get(a));

        List<Integer> ans = new ArrayList<>();

        for (String genre : sortedGenres) {
            List<Album> genreAlbum = albumRank.get(genre);
            Collections.sort(genreAlbum);
            for (int i = 0; i < Math.min(2, genreAlbum.size()); i++) {
                ans.add(genreAlbum.get(i).idx);
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}