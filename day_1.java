// Problem statement
// Programming languages have some conditional / decision-making statements that execute when some specific condition is fulfilled.
// Switch-case is one of the ways to implement them.
// In a menu-driven program, the user is given a set of choices of things to do (the menu) and then is asked to select a menu item.
// There are 2 choices in the menu:
// Choice 1 is to find the area of a circle having radius 'r'.
// Choice 2 is to find the area of a rectangle having dimensions 'l' and 'b'.
// You are given the choice 'ch' and an array 'a'.
// If ‘ch’ is 1, ‘a’ contains a single number ‘r’. If ‘ch’ is 2, ‘a’ contains 2 numbers, ‘l’ and ‘b’.
// Consider the choice and print the appropriate area.
public class day_1{
    public static double areaSwitchCase(int ch, double[] arr){
        if (ch==1){
            double r = arr[0];
            double area = Math.PI*r*r;
            return area;
        } else if (ch==2){
            double l = arr[0];
            double b = arr[1];
            double area = l*b;
            return area;
        } else{
            System.out.println("Inavalid choice!");
            return -1;
        }
    }
    public static void main(String[] args){
        System.out.println(areaSwitchCase(1, new double[] {5.0}));
        System.out.println(areaSwitchCase(2, new double[] {4.0, 6.0}));
        System.out.println(areaSwitchCase(3, new double[] {}));
    }
}