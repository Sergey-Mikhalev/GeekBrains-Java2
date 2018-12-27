package Marathon.Obstacle;


import Marathon.Competitor;
import Marathon.Team;

public class Course {
    private Obstacle[] course;

    public Course(Obstacle... course){
        this.course = course;
    }

    public void doIt(Team team){
        for (Competitor c: team.getSquad()){
            for (Obstacle o: course){
                if(!c.isOnDistance()){
                    break;
                }
            }
        }
    }

}
