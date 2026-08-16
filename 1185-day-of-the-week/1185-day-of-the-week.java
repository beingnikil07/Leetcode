class Solution {
    public String dayOfTheWeek(int day, int month, int year) {

        String days[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        //take 4 becz 1 jan 1971 the prevoius day was Thursday
        int sum = 4;

        //count total days from 1971 to given year
        for (int i = 1971; i < year; i++) {
            //In leap year :366 days
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
                sum = sum + 366;
            else
                sum = sum + 365;
        }

        for (int i = 0; i < month - 1; i++) {
            //if leap year then feb will be 29 ,so add 1 to sum
            if (i == 1 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                sum = sum + months[i] + 1;
            } else {
                sum = sum + months[i];
            }
        }

        //add remaining days
        sum = sum + day;
        String dayOfWeek = days[sum % 7];
        return dayOfWeek;

    }
}
