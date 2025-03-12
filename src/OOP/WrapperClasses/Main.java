package OOP.WrapperClasses;

public class Main {
    public static void main(String[] args) {

//        Integer a = new Integer(123);
//        Double b = new Double(3.14);
//        Character c = new Character('$');
//        Boolean d = new Boolean(true);
//        String e = new String("Pizza");

        //Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        //Unboxing
        int f = a;
        double g = b;
        char h = c;
        boolean i = d;

        //Converting datatype to a String
        String j = Integer.toString(123);
        String k = Double.toString(3.14);
        String l = Character.toString('@');
        String m = Boolean.toString(true);

        String n = j + k + l + m;
        System.out.println(n);

        //Parsing (converting) a String to a datatype

        int o = Integer.parseInt("123");
        double p = Double.parseDouble("3.14");
        char q = "Pizza".charAt(0);
        boolean r = Boolean.parseBoolean("true");

        //Other useful things about turning a datatype into an Object

        char character1 = 'b';
        char character2 = '1';
        System.out.println(Character.isLetter(character1));
        System.out.println(Character.isLetter(character2));

        System.out.println(Character.hashCode('a'));

        //😀 (U+1F600)

        System.out.println(Character.isEmoji(0x1F600));
        System.out.println(Character.isUpperCase(q));
    }
}
