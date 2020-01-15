package com.capgemini.carcase.branching.switching.answers;

public class DateCalculator {

    public int getDaysForMonth(int month) {

        int result = 0;

        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                result = 31;

                break;


            case 2:
                result = 29;
                break;

            case 4:
            case 6:
            case 9:
            case 11:

                result = 30;

                break;


            default:

                result = -1;

                break;

        }

        return result;
    }
}
