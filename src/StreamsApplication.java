import java.util.ArrayList;
import java.util.List;

//      Create the StreamsApplication class. Write the next points of this exercise inside the main method.
public class StreamsApplication {
    public static void main(String[] args) {
//      Create a list of the first twenty numbers. Use a loop for this, please.
        List<Integer> numbers = new ArrayList<>();
        for (int number = 1; number <= 20; number++) {
            numbers.add(number);
        }System.out.println("List of numbers: " + numbers);
//      Create a list of the odd numbers. Display it.
        List<Integer> numbersOdd = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 ==1) {
                numbersOdd.add(number);
            }
        }System.out.println("Odd numbers from our list: " + numbersOdd);
//      Create a list of the even numbers. Display it.
        List<Integer> numbersEven = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 !=1) {
                numbersEven.add(number);
            }
        }System.out.println("Even numbers from our list: " + numbersEven);
//      Create a list of the numbers divisible by 3 and bigger than 10. Display it.
        List<Integer> divisibleBy3AndBiggerThan10 = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > 10 && number % 3 ==0 ) {
                divisibleBy3AndBiggerThan10.add(number);
            }
        } System.out.println("Numbers divisible by 3 and bigger than 10: " + divisibleBy3AndBiggerThan10);
//      Create a list of the numbers smaller than 5 and multiply them by 3. Display it.
        List<Integer> numbersSmallerThan5AndMultiplyThemBy3 = new ArrayList<>();
        for (Integer number : numbers) {
            if (number < 5 ) {
                Integer number1 = number*3;
                numbersSmallerThan5AndMultiplyThemBy3.add(number1);
            }
        }System.out.println("Numbers smaller than 5 and multiplied by 3: " + numbersSmallerThan5AndMultiplyThemBy3);
//      Create a list of String where every element follows the format “number <number> has <digit> digits”. The numbers
// considered have to be bigger than 8 and smaller than 12. Display it.
        List<Integer> numbersBiggerThan8AndSmallerThan12 = new ArrayList<>();
        List<String> numbersBiggerThan8AndSmallerThan12String = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > 8 && number < 12 ) {
                numbersBiggerThan8AndSmallerThan12.add(number);
            }
        }
        for (Integer number : numbersBiggerThan8AndSmallerThan12) {
            numbersBiggerThan8AndSmallerThan12String.add(number + " has " + number.toString().length());
        }
        System.out.println(numbersBiggerThan8AndSmallerThan12String);
    }
}
