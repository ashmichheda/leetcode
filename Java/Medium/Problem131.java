public class Problem131 {
  public List<List<String>> partition(String s) {

          List<List<String>> decompositions = new ArrayList<>();
          decomposeString(0, s, new ArrayList<>(), decompositions);
          return decompositions;
      }

      private void decomposeString(int workingIndex, String s, List<String> partialDecomposition, List<List<String>> decompositions) {

         if(workingIndex == s.length()){
             decompositions.add(new ArrayList<>(partialDecomposition));
             return;
         }

         for(int i = workingIndex; i<s.length(); i++){
             if(isPalindrome(workingIndex, i, s)){
                 String palindromeSnippet = s.substring(workingIndex, i+1);
                 partialDecomposition.add(palindromeSnippet);
                 decomposeString(i+1, s, partialDecomposition, decompositions);

                 partialDecomposition.remove((partialDecomposition.size() - 1));
             }
         }

      }

      private boolean isPalindrome(int left, int right, String s) {

          while(left <= right){
              if(s.charAt(left) != s.charAt(right))
                  return false;
              left++;
              right--;
          }
          return true;
      }
}
