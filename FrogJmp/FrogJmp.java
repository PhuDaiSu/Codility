import java.util.*;

class Solution {
    public int solution(int X, int Y, int D) {
        int steps = 0;
        int position = X;
        while (position < Y) {
            position += D;
            steps++; 
        }
        return steps;
    }
}