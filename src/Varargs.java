public class Varargs {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3};
        System.out.println(add(numbers));
        System.out.println(average(numbers));
    }
    static double add(double... numbers){
        double sum = 0;
        for (int i = 0;i<numbers.length; i++)
            sum += numbers[i];
        return sum;
    }

    static double average(double... numbers){
        double sum = add(numbers);
        sum = sum / numbers.length;
        return sum;
    }

}
