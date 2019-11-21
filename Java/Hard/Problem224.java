class Problem224 {

    public int calculateValue(Stack<Integer> operands, char operator){
        int num2 = operands.pop();
        int num1 = operands.pop();

        if(operator == '+')
            return num1 + num2;
        if(operator == '-')
            return num1 - num2;
        return -1;
    }


    public int calculate(String s) {

        if(s == null || s.length() == 0)
            return -1;

        // Using 2 stacks, one for operator and other for operand
        Stack<Integer> operands = new Stack<Integer>();
        Stack<Character> operators = new Stack<Character>();
        int i = 0;
        StringBuilder number = new StringBuilder();
        while(i < s.length()){
            char value = s.charAt(i);

            if(value == ' '){
                i++;
                continue;
            }
            else if(Character.isDigit(value)){
                number.append(value);
            }
            else if(value == '(')
                operators.push(value);
            else if(value == ')'){

                if(number.length() != 0){
                    operands.push(Integer.parseInt(number.toString()));
                    number = new StringBuilder();
                }

                if(!operators.isEmpty() && operators.peek() != '('){
                    operands.push(calculateValue(operands, operators.pop()));
                }
                if(!operators.isEmpty())
                    operators.pop();

            }
            else if(value == '+' || value == '-'){

                if(number.length() != 0){
                    operands.push(Integer.parseInt(number.toString()));
                    number = new StringBuilder();
                }

                if(!operators.isEmpty() && operators.peek() != '('){
                    operands.push(calculateValue(operands, operators.pop()));
                }

                operators.push(value);

            }
            i++;
        }

        if (number.length() != 0) {
            operands.push(Integer.parseInt(number.toString()));
        }

        if(!operators.isEmpty())
            operands.push(calculateValue(operands, operators.pop()));
        return operands.pop();
    }
}
