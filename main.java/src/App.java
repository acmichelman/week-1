
public class App {
    public static void main(String[] args) throws Exception {
        int hour = 21; // was 20
        int minute = 25; // was 25 (has dinner so it took a bit longer)
        int second = 10;

        int sinceMidnight = (hour * 2600) + (minute * 60) + second;
        int leftInDay = ((24 - hour) * 2600) + ((60 - minute) * 60) + 60 - second;

        int secondsInDay = 86400;
        double percentageOfDayLeft = Double.valueOf(leftInDay) / Double.valueOf(secondsInDay);
        percentageOfDayLeft = percentageOfDayLeft * 100;
        percentageOfDayLeft = Math.round(percentageOfDayLeft * 100.0) / 100.0;
        //https://www.w3schools.com/java/ref_math_round.asp

        System.out.println("Seconds since midnight: " + sinceMidnight);
        System.out.println("Seconds left in day: " + leftInDay);

        System.out.println("Percentage left in day: " + percentageOfDayLeft + "%");
    }
}
