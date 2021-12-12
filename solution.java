public class MyClass {
    public static void main(String args[]) {
        /*variables*/
        int x=0;
        int y=0;
        int max = 6; /*max lenght of 3 digits mult*/
        boolean win;boolean match;
        int num = -1;/*stores the result*/
        int [] vector = new int[max];
        int div;
        int i;
        int tries; int beg;int end;
        
        /*program*/
        x=999; /*first number to multiply*/
        win = false;
        while(!win){
        /*evaluates the result of multiply number 1 and number 2.*/
            y=999; /*second number to multiply*/
            while(!win && y!=0){
            /*we will evaluate the condition if we cannot find a palindromic number, or if the second number becomes zero*/
            num = x*y;
            div = 1;
            for(i=0;i<max;i++){
                vector[i] = (num/div) % 10; /*in each position of the vector, we store the digits of the number. In first iteration we will get last digit.*/
                div = div * 10; /*increasing the quotient to get the next digit*/
            }
            match = true;
            tries =0;beg = 0; end=max-1;/*because index starts from 0*/
            while(match && (beg<end)){
                beg = 0+tries; end=max-1-tries;
                /*compare first d*/
                match = vector[beg] == vector[end];
                tries++;
            }
            win = match;
            if(!win) y--;
         }
         if(!win) x--;
        }
        if(win) System.out.println("Largest palindromic is: "+ num +" = "+ x +" x " + y );
        else System.out.println("No results");
    }
}
