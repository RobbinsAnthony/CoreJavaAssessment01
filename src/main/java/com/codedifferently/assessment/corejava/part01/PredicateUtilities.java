package com.codedifferently.assessment.corejava.part01;

public class PredicateUtilities {
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */
    public Boolean isEven(Integer value) {
        Boolean b = value % 2 == 0;
        return b;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */
    public Boolean isOdd(Integer value) {
        Boolean c = value % 2 == 1;
        return c;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public Boolean isMultipleOf3(Integer value) {
        Boolean d = value % 3 == 0;
        return d;
    }

    /**
     *
     * @param value - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public Boolean isMultipleOfN(Integer value, Integer multiple) {
        Boolean e = value % multiple == 0;
        return e;
    }

    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     */
    public Boolean startsWithCapitalLetter(String string) {
        Character character = string.charAt(0);
        Boolean f = character.isUpperCase(string.charAt(0));
        return f;
    }
}
