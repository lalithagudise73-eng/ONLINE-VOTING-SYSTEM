public class VotingSystemTest {

    public static void main(String[] args) {

        VotingSystem system = new VotingSystem();

        system.addCandidate(new Candidate(1, "Candidate A"));
        system.addCandidate(new Candidate(2, "Candidate B"));

        system.addVoter(
            new Voter("V101", "Student 1", "1234")
        );

        // Test 1: Valid login
        boolean test1 =
            system.login("V101", "1234");

        System.out.println(
            "Test 1 - Valid Login: " +
            (test1 ? "PASS" : "FAIL")
        );

        // Test 2: Invalid login
        boolean test2 =
            !system.login("V101", "9999");

        System.out.println(
            "Test 2 - Invalid Login: " +
            (test2 ? "PASS" : "FAIL")
        );

        // Test 3: Valid vote
        boolean test3 =
            system.castVote("V101", 1);

        System.out.println(
            "Test 3 - Cast Vote: " +
            (test3 ? "PASS" : "FAIL")
        );

        // Test 4: Prevent duplicate voting
        boolean test4 =
            !system.castVote("V101", 2);

        System.out.println(
            "Test 4 - Prevent Re-voting: " +
            (test4 ? "PASS" : "FAIL")
        );

        System.out.println("\nAll tests completed.");
    }
}