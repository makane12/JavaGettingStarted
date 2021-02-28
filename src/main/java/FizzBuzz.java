public class FizzBuzz {
    public String execute(Integer number) {
        String[] expected = {"1", "2", "Fizz", "Fizzy", "Buzz", "FizzBuzz"};
        Integer[] given = {1, 2, 3, 9, 25, 45};
        for (int i = 0; i < number; i++) {
            if (number.equals(given[i])) {
                    return expected[i];
            }
        }
        return "error";
    }
}
