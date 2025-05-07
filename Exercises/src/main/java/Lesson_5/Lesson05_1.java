package Lesson_5;


public class Lesson05_1 {
    //Exerxise 5.1
    static int quantity = 10;
    static int price = 2;

    public static void main(String[] args) {
        boolean outOfStock;
        String message1 = "Out Of Stock";
        String message2 = "Your Total is :"+ " " + "R"+price*quantity ;

        if (quantity > 1){
            outOfStock = true;
            System.out.println(message2);
        }
        else{
            outOfStock = false;
            System.out.println(message1);
            ;
        }
    }


}
