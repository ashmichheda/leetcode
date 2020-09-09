class Problem796 {
    public boolean rotateString(String A, String B) {

        if(A.equals(B))
            return true;

        int len = A.length();

        // check whether A and B are of equal length
        if(len == B.length() && len > 0){
            String s3 = A + A;
            return s3.contains(B);
        }
        return false;
    }
}
