class Problem415 {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while(i >= 0 || j >= 0){
            int n1 = i >= 0 ? num1.charAt(i) - '0': 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0': 0;

            int sum = (n1 + n2 + carry) % 10;
            carry = (n1 + n2 + carry) / 10;

            result.append(sum);
            i--;
            j--;
        }
        if(carry == 1)
            result.append("1");
        return result.reverse().toString();
    }
}
