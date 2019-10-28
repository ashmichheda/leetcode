class Problem991 {
    public int brokenCalc(int x, int y) {

        if(x >= y)
            return x-y;

        int answer = 0;
        while(x != y){
            if(y % 2 != 0){
                y++;
                answer++;
            }
            if(x >= y){
                int c = x-y;
                answer += c;
                break;
            }
            y = y/2;
            answer++;
        }
        return answer;
    }
}
