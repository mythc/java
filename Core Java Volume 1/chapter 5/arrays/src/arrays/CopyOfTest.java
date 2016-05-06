package arrays;

import java.lang.reflect.*;
import java.util.*;

/**
 * @version 1.0 2016-05-06
 * @author colin
 */
public class CopyOfTest {
    public static void main(String[] args){
        int[] a = {1, 2, 3};
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception.");
        b = (String[]) badCopyOf(b, 10);
    }

    /**
     * This method attempts to grow an array by allocating a new array and copying all elements.
     *@param a the array to grow
     *        newLength the new length
     *@return a larger array that contains all elements of a. However, the returned array has type Object[], not the same type as a
     */
    public static Object badCopyOf(Object[] a, int newLenth){
        Object[] newArray = new Object[newLenth];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLenth));
        return newArray;
    }

    /**
     * This method grows an array by allocating a new array of the same type and copying all elements.
     * @param a the array to grow. This can be an object array or a primitive type array
     * @return a larger array that contains all elements of a.
     */
    public static Object goodCopyOf(Object a, int newLength){
        Class c1 = a.getClass();
        if(!c1.isArray())
            return null;
        Class componentType = c1.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
