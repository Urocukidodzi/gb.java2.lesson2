package MyException ;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {

    @Override
    public String toString() {
        return "MyArraySizeException{Array is not 4x4}";
    }
}
