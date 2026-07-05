public class conditionals {
    static void main() {

        //If Statement
        int dailyPractice = 12;

        if (dailyPractice >= 10) {
            System.out.println("Good Consistency");
        }

        int age = 19;
        if (age > 18) {
            System.out.println("You are eligible to vote");
        }


        //If-else Statement
        int score = 42;
        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        //If-else-If ladder
        int accuracy = 78;

        if (accuracy >= 90) {
            System.out.println("Excellent");
        } else if (accuracy >= 75) {
            System.out.println("Good");
        } else if (accuracy >= 60) {
            System.out.println("Average");
        } else {
            System.out.println("Needs Improvement");
        }


        int day = 3;

        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("Thrusday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else {
            System.out.println("Saturday");
        }


        //Nested if-else
        boolean hasSubscription = true;
        int solvedProblems = 220;

        if (hasSubscription) {

            if (solvedProblems >= 200) {
                System.out.println("Unlock Advanced Sheet");
            } else {
                System.out.println("Practice More Problems");
            }

        } else {
            System.out.println("Upgrade to Premium");
        }

        //Ternary Operator
        int streakDays = 35;

        String status = (streakDays >= 30) ? "Consistent" : "Irregular";
        System.out.println(status);
    }
}
