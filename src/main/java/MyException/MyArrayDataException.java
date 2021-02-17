package MyException;

import java.io.IOException;

public class MyArrayDataException extends IOException {

    int i;
    int j;
    public MyArrayDataException(int i,int j) {
    }

    String str = String.format("MyArrayDataException { array [%d][%d] is not a number}",i,j);

    @Override
    public String toString() {
        return str;
    }
}
