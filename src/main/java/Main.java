import MyException.MyArraySizeException;
import MyException.MyArrayDataException;


public class Main {

    static int summ = 0;

    public static void main(String[] args) {
        String[][] st = new String[4][4];
        for (int i = 0; i < st.length; i++) {
            st[0][i] = ""+ ((i + 5) *2) ;
            st[1][i] = ""+ ((i + 5) *3);
            st[2][i] = ""+ ((i + 5) *4);
            st[3][i] = ""+ ((i + 5) *5) ;

            st[2][3] = "dsd";
        }


        try {
            Array4x4(st);
        } catch (MyArrayDataException e) {
            System.out.println(e.toString());
        } catch (
                MyArraySizeException e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("\njava 2 lesson 2 complete");
            System.out.println(summ);
        }

    }

    public static int Array4x4(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 && array[0].length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!tryParseInt(array[i][j])) {
                    throw new MyArrayDataException(i, j);
                }
                summ += Integer.parseInt(array[i][j]);
            }
        }
        return summ;
    }

    public static boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
