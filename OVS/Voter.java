public class Voter {
    private String voterId;
    private String name;
    private String password;
    private boolean hasVoted;

    public Voter(String voterId, String name, String password) {
        this.voterId = voterId;
        this.name = name;
        this.password = password;
        this.hasVoted = false;
    }

    public String getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void castVote() {
        hasVoted = true;
    }
}