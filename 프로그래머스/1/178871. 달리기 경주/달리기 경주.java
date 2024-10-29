import java.util. *;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> rank = new HashMap<>();
        for(int i = 0 ; i<players.length ; i++){
            rank.put(players[i],i);
        }
        for(String name : callings){
            int num = rank.get(name);
            String back = players[num-1];
            
            players[num-1] = name;
            players[num] = back;
            
            rank.put(name,num-1);
            rank.put(back,num);
        }
        return players;
    }
}