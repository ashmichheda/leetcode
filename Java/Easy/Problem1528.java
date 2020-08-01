class Problem1528 {
    public String restoreString(String s, int[] indices) {
        char input[] = s.toCharArray();
        char ans[] = new char[indices.length];
        for(int i = 0; i<indices.length; i++){
            ans[indices[i]] = input[i];
        }
        return String.valueOf(ans);
    }
}
