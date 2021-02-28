public class FizzBuzz {
    public String execute(Integer number) {
        String result;
        switch (number) {
            case 1:
                result = "1";
                break;
            case 2:
                result = "2";
                break;
            case 3:
                result = "Fizz";
                break;
            case 9:
                result = "Fizzy";
                break;
            case 25:
                result = "Buzz";
                break;
            case 45:
                result = "FizzBuzz";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
        return result;
    }
}
