public class runningTrack implements Obstacle {
    int dist;

    public runningTrack(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor c) {
        c.run(dist);
    }
}
