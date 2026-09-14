class Solution { 
    public void reverseString(char[] s) { 
        Stack<Character> stack=new Stack(); 
        int i=0; 
        while(i<s.length){ 
            stack.push(s[i]); 
            i++; 
        } 
        StringBuilder result=new StringBuilder(); 
        while(!stack.isEmpty()){ 
            char curr=stack.pop(); 
            result.append(curr); 
        } 
        for(i=0;i<s.length;i++){
            s[i]=result.charAt(i);
        }
    } 
}