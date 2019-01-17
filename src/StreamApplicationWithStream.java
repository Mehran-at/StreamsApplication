import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//      Create the StreamsApplication class. Write the next points of this exercise inside the main method.
public class StreamApplicationWithStream {
    public static void main(String[] args) {
//      Create a list of the first twenty numbers. Use a loop for this, please.
        List<Integer> numbers = new ArrayList<>();
        for (Integer number = 1; number <= 20; number++) {
            numbers.add(number);
        }System.out.println("List of numbers: " + numbers);
//      Create a list of the even numbers. Display it.
        List<Integer> collect1 = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers from our list: " + collect1);
//      Create a list of the odd numbers. Display it.
        List<Integer> collect = numbers.stream().filter(e -> e % 2 == 1).collect(Collectors.toList());
        System.out.println("Odd numbers from our list:" + collect);
//      Create a list of the numbers divisible by 3 and bigger than 10. Display it.
        List<Integer> collect3 = numbers.stream().filter(e -> e > 10 && e % 3 == 0).collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and bigger than 10:" + collect3);
//      Create a list of the numbers smaller than 5 and multiply them by 3. Display it.
        List<Integer> collect4 = numbers.stream().filter(e -> e < 5).map(e -> e * 3).collect(Collectors.toList());
        System.out.println("Numbers smaller than 5 and multiplied by 3:" + collect4);
//      Create a list of String where every element follows the format “number <number> has <digit> digits”. The numbers
// considered have to be bigger than 8 and smaller than 12. Display it.
        List<String> collect5 = numbers.stream().filter(e -> e > 8 && e < 12)
                .map(e-> "Number " + e +" has "+ e.toString().length()+ " digits").collect(Collectors.toList());
        System.out.println(collect5);
//            numbers.stream()
//        .filter(e-> e >8 && e <12)
//         .forEach(e-> System.out.print("Number " + e + " has " + e.toString().length()+ ", " + "digit/s."));
    }
}
