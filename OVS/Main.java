import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VotingSystem system = new VotingSystem();

        system.addCandidate(new Candidate(1, "Candidate A"));
        system.addCandidate(new Candidate(2, "Candidate B"));
        system.addCandidate(new Candidate(3, "Candidate C"));

        system.addVoter(
            new Voter("V101", "Student 1", "1234")
        );

        system.addVoter(
            new Voter("V102", "Student 2", "5678")
        );

        System.out.println("================================");
        System.out.println("     ONLINE VOTING SYSTEM");
        System.out.println("================================");

        System.out.print("Enter Voter ID: ");
        String voterId = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (!system.login(voterId, password)) {
            System.out.println("Invalid voter ID or password.");
            return;
        }

        System.out.println("Login successful!");

        system.displayCandidates();

        System.out.print("\nEnter Candidate ID: ");
        int candidateId = scanner.nextInt();

        if (system.castVote(voterId, candidateId)) {
            System.out.println("Vote cast successfully!");
        } else {
            System.out.println("Vote could not be cast.");
        }

        system.displayResults();

        scanner.close();
    }
}