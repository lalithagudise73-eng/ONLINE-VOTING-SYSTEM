# Online Voting System

## Introduction

The Online Voting System is a Java-based application that allows
registered voters to authenticate themselves and cast a vote for
their preferred candidate.

## Objectives

- Provide a simple electronic voting process.
- Authenticate registered voters.
- Allow voters to cast one vote.
- Prevent duplicate voting.
- Count and display election results.

## Technologies Used

- Java
- Object-Oriented Programming
- Collections Framework
- VS Code / IntelliJ IDEA
- Git and GitHub

## Features

1. Voter authentication
2. Candidate management
3. Vote casting
4. Duplicate-vote prevention
5. Vote counting
6. Election result display
7. Testbench verification
8. Simulation

## Project Structure

src/
Contains the main Java source code.

testbench/
Contains test cases.

simulation/
Contains simulation output.

## How to Run

Compile:

javac src/*.java

Run:

java -cp src Main

Run the testbench:

javac -cp src testbench/VotingSystemTest.java

java -cp src:testbench VotingSystemTest

## Testing

The testbench verifies:

- Valid login
- Invalid login
- Successful vote
- Prevention of duplicate voting

## Limitations

This is an educational prototype and does not provide the
security, privacy, cryptographic verification, auditability,
or infrastructure required for a real public election.

## Future Enhancements

- Database integration
- Admin dashboard
- Secure cryptographic voting
- Encrypted data storage
- Web-based interface
- Audit logs
- Stronger authentication

## Conclusion

The project demonstrates how Java and object-oriented programming
can be used to implement the basic workflow of an electronic
voting application.