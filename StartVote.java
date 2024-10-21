import voting.ElectionManager;

public class StartVote {
    public static void main(String[] args) {
        System.out.println("Starting Election now !");

        ElectionManager electionManager=ElectionManager.getElectionManager();
        electionManager.StartVoting();
        electionManager.Winner();
    }
}
