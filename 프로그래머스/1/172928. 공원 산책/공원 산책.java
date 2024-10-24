import java.util.*;

class Solution {
    int h;
    int w;
    public int[] solution(String[] park, String[] routes) {
        int[] point = init(park);
        h = park.length;
        w = park[0].length();
        

        for (String route : routes) {
            String[] routeArr = route.split(" ");
            String direction = routeArr[0];
            int distance = Integer.parseInt(routeArr[1]);
            

            move(park, point, direction, distance);
        }
        return point;
    }

    public int[] init(String[] park) {
        int[] result = new int[2];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    result[0] = i; 
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
    public void move(String[] park, int[] point, String direction, int distance) {
        int x = point[1]; 
        int y = point[0]; 


        switch (direction) {
            case "E":
                for (int i = 1; i <= distance; i++) {
                    if (x + i >= w || park[y].charAt(x + i) == 'X') {
                        return; 
                    }
                }
                point[1] += distance;
                break;
            case "W":
                for (int i = 1; i <= distance; i++) {
                    if (x - i < 0 || park[y].charAt(x - i) == 'X') {
                        return;
                    }
                }
                point[1] -= distance;
                break;
            case "S": 
                for (int i = 1; i <= distance; i++) {
                    if (y + i >= h || park[y + i].charAt(x) == 'X') {
                        return;
                    }
                }
                point[0] += distance; 
                break;
            case "N":
                for (int i = 1; i <= distance; i++) {
                    if (y - i < 0 || park[y - i].charAt(x) == 'X') {
                        return;
                    }
                }
                point[0] -= distance;
                break;
            default:
                break;
        }
    }
}