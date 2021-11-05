package com.codedifferently.assessment.corejava.part02;

public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {

        //create a new array
        // new array should be the length of the original array + 1
        // add the  old contents to the new array
        // add the new value to the new array
        //return the new array
        Integer[] iHateArrays = new Integer[integerArray.length + 1];
        for(int i = 0; i < integerArray.length; i++){
            iHateArrays[i] = integerArray[i];
        }
        iHateArrays[iHateArrays.length - 1] = valueToBeAdded;
        return iHateArrays;
    }

    /**
     * @param integerArray2 - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray2, int indexToInsertAt, Integer valueToBeInserted) {

        integerArray2[indexToInsertAt] = valueToBeInserted;
        return integerArray2;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        return null;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        return null;
    }
}
