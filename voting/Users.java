package voting;

public abstract class Users{
    private int id;
    private String name;
    private String email;
    private boolean isCandidate;
    private boolean isCommisoner;
    public Users(int id,String name,String email){
      this.id=id;
      this.name=name;
      this.email=email;
    } 
     public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public boolean  getIsCandidate(){
        return isCandidate;
    }
    public boolean  getIsCommisoner(){
        return isCommisoner;
    }

    public void setIsCandidate(boolean isCandidate){
        this.isCandidate=isCandidate;
    }
    public void setIsCommisoner(boolean isCommisoner){
        this.isCommisoner=isCommisoner;
    }
}