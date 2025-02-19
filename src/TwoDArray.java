public class TwoDArray {
    public static void main(String[] args) {
        telephone(args);
//
//        String[] fruits = {"apple", "pear", "orange"};
//        String[] meats = {"pork", "chicken", "beef", "shrimp"};
//        String[] protein = {"rice", "potatoes", "qous-qous"};
//
//        String[][] groceries = {fruits, meats, protein};
//
//        for (String[] foods : groceries){
//            for (String food : foods)
//                System.out.print(food + " ");
//            System.out.println();
//        }
    }

    public static void telephone(String[] args) {

        char[][] phone = {{'1', '2', '3'},
                          {'4', '5', '6'},
                          {'7', '8', '9'},
                          {'+', '0', '*'},
        };
        for (char[] row : phone) {
            for (char sign : row)
                System.out.print(sign + " ");
            System.out.println();
        }
    }
}
