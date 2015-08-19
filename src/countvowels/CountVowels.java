package countvowels;
import javax.swing.JOptionPane;

public class CountVowels {

    public static void main(String[] args) {
        CountVowels cv = new CountVowels(); // Declare Object
        String text = JOptionPane.showInputDialog(null, "To Count Vowels in a string, \nenter some text");
        JOptionPane.showMessageDialog(null, "The Number of Vowels in the String is " + cv.vowelCount(text));
    } // End main

    public int vowelCount(String text){
        int counter = 0;
        char[] vowels = {'a','e','i','o','u'};

        for(int i=0; i<text.length(); i++){
            if( (text.charAt(i) == vowels[0]) || (text.charAt(i) == vowels[1]) ||
                (text.charAt(i) == vowels[2]) || (text.charAt(i) == vowels[3]) || (text.charAt(i) == vowels[4]) ){
                    counter++; 
            } // End if
        } // End for loop
        return counter;
    } // End vowelCount() method

} // End class