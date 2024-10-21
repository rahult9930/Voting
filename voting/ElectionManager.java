package voting;
import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;
public class ElectionManager {
    private static ElectionManager electionManagerInstance;
    

    private ElectionManager(){

    }
    public static ElectionManager getElectionManager(){
        if(electionManagerInstance==null){
            electionManagerInstance=new ElectionManager();
        }
        return electionManagerInstance;
    }
    CandidateManager candidateManager=CandidateManager.getCandidateManager();
  
    public void StartVoting(){
        candidateManager.CandidateCreator();
    
    List<Voters> voters=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter total number of Voters") ;
    int totalVoters=scanner.nextInt();
    
     for(int i=1;i<=totalVoters;i++){
         System.out.println("Enter your name: ");
         String name=scanner.next();
         System.out.println("Enter your email: ");
         String email=scanner.next();
         voters.add(new Voters(i, name, email));
         candidateManager.displayCandidates();
         System.out.println("Enter the id of candidate you want to vote : ");
         int VoteID=scanner.nextInt();
        
         if(candidateManager.isValidID(VoteID)){
            candidateManager.Vote(VoteID);
            System.out.println("your vote is successfully recorder.Next voter please ");
         }
     }
     System.out.println("Voting is ended now.Releasing the results of elections :");
     candidateManager.finalVoteCount();
    } 
    public void Winner(){
      Candidates winner=candidateManager.WinnerCandidate();
        System.out.println("Winner of the election is " + winner.getName());
      }
    }
    

