import java.util.*;

public class VotingSystem {

    private Map<String, Voter> voters = new HashMap<>();
    private Map<Integer, Candidate> candidates = new HashMap<>();

    public void addVoter(Voter voter) {
        voters.put(voter.getVoterId(), voter);
    }

    public void addCandidate(Candidate candidate) {
        candidates.put(candidate.getId(), candidate);
    }

    public boolean login(String voterId, String password) {
        Voter voter = voters.get(voterId);

        return voter != null && voter.authenticate(password);
    }

    public boolean castVote(String voterId, int candidateId) {

        Voter voter = voters.get(voterId);
        Candidate candidate = candidates.get(candidateId);

        if (voter == null || candidate == null) {
            return false;
        }

        if (voter.hasVoted()) {
            return false;
        }

        candidate.addVote();
        voter.castVote();

        return true;
    }

    public void displayCandidates() {

        System.out.println("\nCandidates:");

        for (Candidate candidate : candidates.values()) {
            System.out.println(
                candidate.getId() + ". " +
                candidate.getName()
            );
        }
    }

    public void displayResults() {

        System.out.println("\n===== ELECTION RESULTS =====");

        for (Candidate candidate : candidates.values()) {
            System.out.println(
                candidate.getName() +
                " : " +
                candidate.getVotes() +
                " votes"
            );
        }
    }
}