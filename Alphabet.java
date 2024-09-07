import java.util.*;
class Alphabet{
    public static void main(String[] args) {
        String str; 

        //Create scanner class object
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string: ");
        str=in.nextLine();

        //process to sort a string in ascending order
        char charArray[]=str.toCharArray();
        str.toLowerCase();
        Arrays.sort(charArray);
        System.out.println("After arranging a string in ascending order:");
        System.out.println(String(charArray));

        System.out.println("To arrange string Names in alphabetical order Enter list of names ");
        System.out.println("Enter no. of words: ");
        int n=in.nextInt();

        String[] words=new String[n];
        //Taking input from the user
        System.out.println("Enter Words:");
        for(int i=0;i<=n;i++){
            words[i]=in.nextLine();
        }
        sortAlphabetically(words);
        in.close();
    }
    static void sortAlphabetically(String[] words){
        //Sorting array
        Arrays.sort(words);
        System.out.println("After sorting Words in ascending order:" + Arrays.toString(words));
        
    }
}