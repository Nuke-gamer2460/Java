package Lesson_5;

public class Lesson05_3 {
    public static void main(String[] args) {
        //Examples

//        String[ ] names = {"George", "Jill", "Xinyi", "Ravi"};
//
//        for (String name : names) {
//            System.out.println("Name is " + name);

//        int passmark = 12;
//        boolean passed = false;
//        int[] scores = {4, 6, 2, 8, 12, 35, 9};
//
//        for (int unitScore : scores){
//            passed = true;
//            break;
//
//        }
//        System.out.println("At least one passed? " + passed);

        int[] sizes = {4, 18, 5, 20};
        for (int size : sizes){
            if(size > 16){break;}
            System.out.println("Sizes: " + size + ", ");
        }

    }

}
