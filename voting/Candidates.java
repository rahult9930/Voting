package voting;

public class Candidates extends Users {
    private String Symbol;
    private int totalVotes=0;
    private boolean isBanned=false;
    public Candidates(int id, String name, String email,String Symbol) {
        super(id, name, email);
        setIsCandidate(true);         // Set isCandidate to false
        setIsCommisoner(false);  
        this.Symbol=Symbol;
        }
        public int getTotalVotes()
        {
            return totalVotes;
        }
        public void setTotalVotes(){
            this.totalVotes=getTotalVotes()+1;
        }
        public boolean getIsBanned()
        {
            return isBanned;
        }
        public void setIsBanned(){
            this.isBanned=true;
        }
        public String getSymbol(){
            return Symbol;
        }
        
        
        
}
