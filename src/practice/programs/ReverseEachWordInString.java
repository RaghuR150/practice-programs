package practice.programs;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str = "aravindh is a senior member of the team";
        System.out.println(reverse(str));
    }

    private static String reverse( String str) {

             String[] words = str.split(" ");
             for(int i=0; i<words.length; i++){
                 char[] word = words[i].toCharArray();
                 words[i] = swap(word);
             }
            StringBuilder reversed = new StringBuilder();
             for(int i=0; i< words.length; i++){
                 reversed.append(words[i]);
                 if(i < words.length-1){
                     reversed.append(" ");
                 }
             }
             return reversed.toString();
    }


    private static String swap(char[] word) {
        int start = 0;
        int end = word.length-1;
        while(start < end){
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            start++;
            end--;
        }
        return new String(word);
    }


}
