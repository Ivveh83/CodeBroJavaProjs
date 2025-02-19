public class Varargs {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(add(numbers));
        System.out.println(average(numbers));
    }
    static int add(double... numbers){
        int sum = 0;
        for (int i = 0;i<numbers.length; i++)
            sum += i;
        return sum;
    }

    static double average(double... numbers){
        double sum = add(numbers);
        sum = sum / numbers.length;
        return sum;
    }

}
