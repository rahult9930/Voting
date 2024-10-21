package voting;

import  java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CandidateManager {
    private static CandidateManager candidateManagerinstance;
    private List<Candidates> candidates;
    
    private CandidateManager(){
        candidates=new ArrayList<>();
    };

    public static CandidateManager getCandidateManager(){
        if(candidateManagerinstance==null){
            candidateManagerinstance= new CandidateManager();
        }
        return  candidateManagerinstance;
    }
    Scanner scanner=new Scanner(System.in);
      
    public void CandidateCreator()
    {
        System.out.println("Enter total number of Candidates") ;
        int totalCandidates=scanner.nextInt();
        for(int i=1;i<=totalCandidates;i++){
            System.out.println("Enter name of candidate");
            String name=scanner.next();
            System.out.println("Enter enail of candidate");
            String email=scanner.next();
            System.out.println("Enter Symbol of candidate");
            String Symbol=scanner.next();
            candidates.add(new Candidates(i,name,email,Symbol));
        }
    }
    public void banCandidate(Candidates candidate){
        candidate.setIsBanned();
        System.out.println("candidate "+ candidate.getName() + " is banned from election");
    }
    public boolean isValidID(int n){
    return n < candidates.size();
    }
    public void Vote(int n){
        candidates.get(n).setTotalVotes();
    }
    public void displayCandidates(){
        for(Candidates candi:candidates){
            System.out.println(candi.getId() +"          "+candi.getName()+"           "+candi.getSymbol());
          }
    }
    public List<Candidates> getCandidates(){
        return candidates;
    }
    

    public void finalVoteCount(){
       
          System.out.println("Name" +"          "+"Symbol"+"           "+"Total Votes");
          for(Candidates candi:candidates){
            System.out.println(candi.getId() +"          "+candi.getSymbol()+"           "+candi.getTotalVotes());
          }
    }
    public Candidates WinnerCandidate() {
        // Initialize Winner as the first candidate, or null if no candidates are available
        if (candidates.isEmpty()) {
            System.out.println("No candidates available.");
            return null;
        }

        // Start comparison with the first candidate
         Candidates Winner = candidates.get(0); 

        // Iterate over the list to find the candidate with the highest votes
        for (Candidates candi : candidates) {
            if (Winner.getTotalVotes() < candi.getTotalVotes()) {
                Winner = candi; // Update winner if another candidate has more votes
            }
        }
        return Winner;
    }
}
