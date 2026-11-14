public class Main {
    public static void main(String[] args) {

        // Sposob 1: klasyczna petla for z indeksem
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + ", ");
        }
        System.out.println();

        // Sposob 2: petla for-each
        for (String arg : args) {
            System.out.print(arg + ", ");
        }
        System.out.println();

        // Sposob 3: petla while
        int j = 0;
        while (j < args.length) {
            System.out.print(args[j] + ", ");
            j++;
        }
        System.out.println();
    }
}
