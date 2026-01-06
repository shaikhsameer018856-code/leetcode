class Solution{
    public int evalRPN(String[] tokens){
        Stack<Integer> st = new Stack<>();
        for (String t : tokens){
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                int b = st.pop();
                int a = st.pop();
                int ans = 0;

                if (t.equals("+")) ans = a + b;
                else if (t.equals("-")) ans = a - b;
                else if (t.equals("*")) ans = a * b;
                else if (t.equals("/")) ans = a / b;
                st.push(ans);
            }
            else{
                st.push(Integer.parseInt(t));
            }
        }
        return st.pop();
    }
}