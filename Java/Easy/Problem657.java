class Problem657 {
    public boolean judgeCircle(String moves) {

        int value = 0;
        for(int i = 0; i<moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                value += 1;
            }
            else if(moves.charAt(i) == 'R'){
                value -= 1;
            }
            else if(moves.charAt(i) == 'U'){
                value += 2;
            }
            else{
                value -= 2;
            }
        }
        if(value == 0){
            return true;
        }
        else
            return false;
    }
}
