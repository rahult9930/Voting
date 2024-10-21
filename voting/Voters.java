package voting;

public class Voters extends Users {
    private boolean isVoted=false;
    public Voters(int id, String name, String email) {
        super(id, name, email);
        setIsCandidate(false);         // Set isCandidate to false
        setIsCommisoner(false);      // Set isCommissioner to false
    }
    public boolean getIsVoted()
    {
        return isVoted;
    }
    public void setIsVoted(){
        this.isVoted=true;
    }
}
