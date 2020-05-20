public class MainClass {
    final static int WORKHOURS = 8;
    final static int WORKDAYS = 5;

    static Competitor[] competitors = {
      new Human("Vasiliy", 1500, 2),
      new Cat("Barsik", 150, 1),
      new Robot("XR12/64", 8000, 5)
    };

    static Obstacle[] obstacles = {
      new Wall(2),
      new runningTrack(2500)
    };

    public static void main(String[] args) {
        System.out.println("It's time for the first task!");
        System.out.println();

        for (Competitor c:competitors) {
            for (Obstacle o:obstacles) {
                if (c.isOnDistance()){
                    o.doIt(c);
                } else {
                    break;
                }
            }
        }

        for (Competitor c:competitors) {
            c.info();
        }


        System.out.println();
        System.out.println("It's time for the second task!");
        getWorkingHours (DayOfWeek.Thursday);

    }

    static void getWorkingHours(DayOfWeek day){
        if ((day.name().equals("Sunday")) || (day.name().equals("Saturday"))){
            System.out.println("Today is a day off!!!!");
        } else {
            System.out.println((WORKDAYS - day.ordinal() +1) * WORKHOURS + " hours left");
        }
    }

}
