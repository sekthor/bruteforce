package bruteforce;

public class Dictionary {

    char[] letters;

    public Dictionary(boolean lower, boolean upper, boolean num) {
        int size = 0; // desired size of array
        int pos = 0; // position when filling the array
        if (lower) size += 26;
        if (upper) size += 26;
        if (num) size += 10;

        letters = new char[size];

        if (lower) {
            for (int i=97; i<123; i++){
                letters[pos] = (char) (i);
                pos++;
            }
        }

        if (upper) {
            for (int i=65; i<91; i++){
                letters[pos] = (char) (i);
                pos++;
            }
        }

        if (num) {
            for (int i=48; i<58; i++){
                letters[pos] = (char) (i);
                pos++;
            }
        }

    }


    @Override
    public String toString() {
        String str = "";
        for (char c : letters) {
            str += c;
        }
        return str;
    }

    public int size() {
        return letters.length;
    }

    public char get(int pos) {
        return letters[pos];
    }

    public void addChars(char[] additional) {
        char[] newArray = new char[letters.length + additional.length];

        for (int i = 0; i < letters.length; i++){
            newArray[i] = letters[i];
        }

        for (int i=0; i < additional.length; i++){
            newArray[letters.length+i] = additional[i];
        }

        this.letters = newArray;
    }
}
