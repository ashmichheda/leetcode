class Problem227 {
    public int calculate(String s) {
        int result = 0, num = 0;
        char operator = '+'; // to handle the 1st number
        Stack<Integer> calculator = new Stack<Integer>();
        for(char ch : (s + "+").toCharArray()){

            if(ch == ' ')
                continue;
            else if(Character.isDigit(ch))
                num = num * 10 + (ch - '0');
            else{
                switch(operator){
                    case '+':
                        calculator.push(num);
                        break;
                    case '-':
                        calculator.push(-num);
                        break;
                    case '*':
                        calculator.push(calculator.pop() * num);
                        break;
                    case '/':
                        calculator.push(calculator.pop() / num);
                        break;
                }
                operator = ch;
                num = 0;
            }
        }

        while(!calculator.isEmpty())
            result += calculator.pop();

        return result;
    }
}
