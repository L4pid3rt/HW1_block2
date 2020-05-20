public class Robot implements Competitor {
    private String name;
    private boolean isOnDistance;

    private int maxRunDistance;
    private int maxJumpHeight;


    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.isOnDistance = true;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int dist) {
        if ((isOnDistance) && (dist <= maxRunDistance)) {
            System.out.println("Robot " + name + " successfully runs " + dist + " meters.");
        } else {
            System.out.println("Robot " + name + " can't run " + dist + " meters.");
            isOnDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if ((isOnDistance) && (height <= maxJumpHeight)) {
            System.out.println("Robot " + name + " successfully jumps " + height + " meters.");
        } else {
            System.out.println("Robot " + name + " can't jump " + height + " meters.");
            isOnDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void info() {
        System.out.println("Robot " + name + (isOnDistance ? " is on distance" : " is not on distance"));
    }
}
