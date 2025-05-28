public class stringaddition {
    public static void main(String[] args) {
        String s="1abc45";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.chatAt(i);
            if(character.isDigit(ch))
            {
                temp+=ch;
            }
            else
            {
                if(!temp.equals(""))
                {
                    sum+=Integer.parseInt(temp);
                    
                }
            }
        }
    }
}
