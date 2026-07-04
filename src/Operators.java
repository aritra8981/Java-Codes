public class Operators {
    static void main() {

        //Arithmatic Operator
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek / 7;  // int/int = int
        int remainder = solvedThisWeek % 7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);


        //Relational Operators
        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);
        System.out.println(currentStreak != targetStreak);
        System.out.println(currentStreak > targetStreak);
        System.out.println(currentStreak < targetStreak);
        System.out.println(currentStreak >= targetStreak);
        System.out.println(currentStreak <= targetStreak);

        //Logical Operator
        boolean completedDSA = true;
        boolean completedcore = false;

        System.out.println(completedDSA && completedcore);
        System.out.println(completedDSA || completedcore);
        System.out.println(!completedcore);


        //Assignment Operator
        int ratingPoints = 100;

        ratingPoints += 20; // ratingPoints = ratingPoints + 20;
        System.out.println(ratingPoints); // 100 + 20 = 120

        ratingPoints -= 10;  // ratingPoints = ratingPoints - 10;
        System.out.println(ratingPoints); // 120 - 10 = 110

        ratingPoints *= 2;  // ratingPoints = ratingPoints * 2;
        System.out.println(ratingPoints); // 110 * 2 = 220

        ratingPoints /= 4;  // ratingPoints = ratingPoints / 20;
        System.out.println(ratingPoints); // 220 / 4 = 55

        ratingPoints %= 30; // ratingPoints = ratingPoints % 30;
        System.out.println(ratingPoints); // 55 % 30 = 25


        //Unary inc/dec Operator
        int activeUsers = 100;
        int prefix = ++activeUsers;
        //First activeUsers got incremented and it is now 101
        //now prefix value is changed and its value is 101
        int postfix = activeUsers++;
        //activeUsers = 101
        //first utilize it as postfix value is 101
        //now increment it, now the activeUser is 102

        System.out.println(prefix);
        //101
        System.out.println(postfix);
        //101
        System.out.println(activeUsers);
        //102
    }
}
