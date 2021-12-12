public class MyClass {
    public static void main(String args[]) {
        /*variables*/
        int x=0; /*First number*/
        int y=0; /*Second number*/
        int max = 6; /*max lenght of 3 digits mult*/ 
        int num = -1; /*stores the result*/
        int [] vector = new int[max]; /*array to store each digit of the number*/
        /*aux variables*/
        int div; 
        int i;
        int tries; int beg;int end;
        boolean win;boolean match;
        
        /*program*/
        x=999; /*first number to multiply, initialized in the largest 3 digit number*/
        win = false;
        while(!win){
        /*evaluates the result of multiplying the number 1 and the number 2, while the palindromic is not found*/
            y=999; /*second number to multiply,initialized in the largest 3 digit number*/
            while(!win && y!=0){
            /*while we cannot find a palindromic number, or if the second number becomes zero*/
            num = x*y; /*perform the multiplication*/
            div = 1; /*variable div initialized in 1. We will use it to reduce the number and get with the digits.*/
            for(i=0;i<max;i++){
                vector[i] = (num/div) % 10; /*in each position of the vector, we store the digits of the number. In first iteration we will get last digit.*/
                div = div * 10; /*increasing the quotient to get the next digit*/
            }
            match = true; /*initializing in true*/
            tries =0;beg = 0; end=max-1; /*remember index starts from 0*/
            while(match && (beg<end)){
                /*while did not find and not finished evaluating the vector*/
                beg = 0+tries; end= (max-1)-tries;
                /*in each round compare digit first digit with the last*/
                match = vector[beg] == vector[end];
                tries++; /*to compare the next two digits*/
            }
            win = match;
            if(!win) y--; /*if not, decrease the second number in 1*/
         }
         if(!win) x--; /*if not, decrease the first number in 1*/
        }
        if(win) System.out.println("Largest palindromic is: "+ num +" = "+ x +" x " + y );
        else System.out.println("No results");
    }
}
