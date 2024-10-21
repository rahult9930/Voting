package voting;

public class Commisoner extends Users {
    public Commisoner(int id, String name, String email) {
        super(id, name, email);
        setIsCandidate(false);         // Set isCandidate to false
        setIsCommisoner(false);      // Set isCommissioner to false
    }
}
