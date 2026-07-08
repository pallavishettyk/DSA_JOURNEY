class Solution {
    public boolean isValid(String s) {
     LinkedList<Character>l=new LinkedList<>();
     char[]a=s.toCharArray();
     for(char x:a){
        if(x=='(' || x=='[' || x=='{'){
            l.addLast(x);
        }
        else if(l.size()==0){
            return false;
        }
        else if(x==')' && l.get(l.size()-1)=='('){
            l.removeLast();
        }
        else if(x==']' && l.get(l.size()-1)=='['){
            l.removeLast();
     } 
       else if(x=='}' && l.get(l.size()-1)=='{'){
      l.removeLast();  
    }
    else{
        return false;
    }
}
if(l.size()!=0){
    return false;
}
return true;
    }
}