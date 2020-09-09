class Problem443 {

    int countFrequency = 0;
    int index = 0;
    char current;

    public int compress(char[] chars) {
        if(chars.length == 0 || chars == null)
            return 0;
        current = chars[0];

        for(int i = 0; i < chars.length; i++){
            if(current == chars[i]){
                countFrequency++;
            }
            else{
                updateArrayInPlace(chars);
                countFrequency = 1;
                current = chars[i]; // update current char value to latest char value i
            }

            // check when i reaches end of array
            if(i == chars.length - 1)
                updateArrayInPlace(chars);
        }
        return index;
    }
    private void updateArrayInPlace(char[] chars){
        String temp = String.valueOf(countFrequency);
        chars[index++] = current;
        if(countFrequency != 1){
            for(char c : temp.toCharArray()){
            chars[index++] = c;
            }
        }
    }
}
