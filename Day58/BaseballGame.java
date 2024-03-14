class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> s = new Stack<>();
        int sum =0;

        for(int i=0; i<operations.length; i++) {
            if(operations[i].equals("D")) {
                int d = s.peek() * 2;
                s.push(d);
            } else if(operations[i].equals("C")) {
                s.pop();
            } else if (operations[i].equals("+")) {
                int a = s.pop();
                int c = a + s.peek();
                s.push(a);
                s.push(c);
            } else{
                int b = Integer.parseInt(operations[i]);
                s.push(b);
            }
        }

        while(!s.isEmpty()){
            sum += s.pop(); 
        }
        return sum;
    }
}

