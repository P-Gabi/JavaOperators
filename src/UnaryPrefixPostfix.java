public class UnaryPrefixPostfix {
    public static void main(String[] args) {
        int number = 1;
        System.out.println(number++); // varianta postfixata, afieseaza valoare dupa executa ++;
        System.out.println(number);
        System.out.println(++number); // varianta prefixata. incrementeaza apoi afiseaza

        System.out.println(number--);
        System.out.println(number);
        System.out.println(--number);

    }
}
