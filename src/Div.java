public class Div {
    public static long div(String input) {
        // 10/1
        input = input.trim();

        // "/"
        String[] strings = input.split("/");

        // System.out.println(Arrays.toString(strings));

        Integer number1 = Integer.valueOf(strings[0]);
        Integer number2 = Integer.valueOf(strings[1]);
        if (number2 == 0) {
            throw new RuntimeException("0 cannot be divided");
        }
        return number1 / number2;

    }
}
