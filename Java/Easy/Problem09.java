public class Problem09 {

	public static boolean isPalindrome(int x) {

		int checkPal = x, reverse = 0;
        while(x > 0){
        reverse = reverse*10 + x%10;
        x = x/10;
        }

        if(checkPal == reverse)
            return true;
        else
            return false;
}

}
