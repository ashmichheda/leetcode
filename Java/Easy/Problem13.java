public class RomanToInteger {

	public static void main(String[] args) {

		String s = "LVIII";
		int result = romanToInt(s);
		System.out.println(result);

	}

	private static int romanToInt(String s) {

		// check for null and 0 length
				if(s.length() == 0 || s == null)
					return 0;
				char sample[] = s.toCharArray();
				Map<Character, Integer> input = new HashMap<Character, Integer>();
				input.put('I', 1);
				input.put('V', 5);
				input.put('X', 10);
				input.put('L', 50);
				input.put('C', 100);
				input.put('D', 500);
				input.put('M', 1000);
				if(s.length() == 1)
					return input.get(sample[0]);
				int sum = input.get(sample[s.length() - 1]);
				for(int i = s.length() - 2; i >= 0; i--) {
					int a = input.get(sample[i]);
					int b = input.get(sample[i+1]);
		            if(a < b)
		                sum = sum - a;
		            else
		                sum = sum + a;
				}
				return sum;
    }

}
