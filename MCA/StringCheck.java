class StringCheck {
    public static void main(String[] args){
        int i;
        char ch;
        String s1="Racecar",s2, rev="";
        s2=s1.toLowerCase();
        
        // for(i=0;i<s1.length();i++){
        //         ch=s1.charAt(i);
        //         rev=ch+rev;
        //     }
        //     System.out.println(rev);

        for(i=s2.length()-1;i>=0;i--){
            ch=s2.charAt(i);
            rev+=ch;
        }
    
        if(s2.equals(rev)){
            System.out.println("String is Palindrome");
        }
        else
            System.out.println("String is not a Palindrome");

            
    }
}
