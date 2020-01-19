package bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        boolean lower, upper, num;

        List<String> arguments = Arrays.asList(args);

        num =arguments.contains("num");
        lower = arguments.contains("lower");
        upper = arguments.contains("upper");

        // return if no command line arguments were given
        if (!(lower || upper || num)) {
            System.out.println("[!] No command line arguments given");
            return;
        }


        Dictionary dic = new Dictionary(lower, upper, num);
        int[] array={0};
        int characterCount = 1;
        String pass = "";


        System.out.println("[+] Dictionary created: " + dic.toString());


        do {
            pass = Bruteforce.arrayToString(array, dic);
            array = Bruteforce.iterate(array,dic.size()-1);
        } while (!Bruteforce.checkPassword(pass));

        System.out.println("\n[+] Password found: " + pass);

    }

}
