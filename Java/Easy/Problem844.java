class Problem844 {
    class Solution {
    public boolean backspaceCompare(String S, String T) {
        return backspaceString(S).equals(backspaceString(T));
}

private String backspaceString(String s) {
    if (s == null || s.length() == 0) 
		return "";

    StringBuilder sb = new StringBuilder();
    int count = 0;
	
    for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) == '#') {
            count++;
        } else if (count != 0) {
            count--;
        } else {
            sb.append(s.charAt(i)); 
        }
    }
    return sb.toString();
    }
}



// OTHER SOLUTION (Takes longer time than the above solution)

class Solution {
    public boolean backspaceCompare(String a, String b) {
       if(a.length() == 0 || b.length() == 0)
		return true;
	
	
	char[] aChar = a.toCharArray();
	List<Character> listA = new ArrayList<>();
	for(char ele : aChar)
		listA.add(ele);
	
	
	
	char[] bChar = b.toCharArray();
	List<Character> listB = new ArrayList<>();
	for(char ele : bChar)
		listB.add(ele);
	
	boolean result = false;
	for(int i = 0; i<listA.size(); i++) {
		if(listA.get(i) == '#') {
			if(i == 0) {
				listA.remove(i);
				i = -1;
			}
			
			else {
				listA.remove(i);
				listA.remove(i-1);
				i = -1;
			}
		}
		
	}
	
	for(int i = 0; i<listB.size(); i++) {
		if(listB.get(i) == '#') {
			if(i == 0) {
				listB.remove(i);
				i = -1;
			}
				
			else {
				listB.remove(i);
				listB.remove(i-1);
				i = -1;
			}
		}
		
	}
	result = listA.equals(listB);
    return result;
    }
}


}