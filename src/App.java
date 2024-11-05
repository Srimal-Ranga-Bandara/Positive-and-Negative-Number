public class App {
    public static void main(String[] args)  {
        
        checkNumber(2);//Test Case
        checkNumber(-2);//Test Case
        checkNumber(0);//Test Case
        checkNumber(-4);//Test Case


}
public static void checkNumber(int number){

    if(number>0){

        System.out.println(" ....... Positive Number .......... ");
    }

    else if(number<0) {

        System.out.println(" ....... Negative Number .......... ");
        
    } 
    else {

        System.out.println(" ........ Zero Number .......... ");
        
    }
    }
}

