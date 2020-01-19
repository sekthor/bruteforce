package bruteforce;

public class Bruteforce {


    public static int[] iterate(int[] array, int max){
        int min = 0;
        int pos = array.length-1;

        // move back in the array until position isn't maxed out
        while (array[pos] >= max) {

            // if all elements are maxed out, add new element to end
            if (pos == 0) {
                int[] newArray = new int[array.length + 1];
                for (int i=0; i<newArray.length; i++) {
                    newArray[i] = min;
                }

                System.out.println("[*] Number of characters: " + newArray.length);

                return newArray;
            }
            pos -= 1;
        }

        // increase element
        array[pos]++;

        // set following elements to min
        for (int i=pos+1; i < array.length; i++) {
            array[i] = min;
        }

        return array;

    }

    public static String arrayToString(int[] array, Dictionary dic){
        String string = "";

        for (int c : array){
            string += dic.get(c);
        }
        return string;
    }

    public static boolean checkPassword(String attempt) {
        // replace this code with how you want to check the password
        String password = "hello1";
        return (attempt.equals(password));


    }

}
