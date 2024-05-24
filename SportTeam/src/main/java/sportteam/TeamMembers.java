package sportteam;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class TeamMembers {
    private static LinkedHashSet<TeamCollection> sportsteam = new LinkedHashSet<TeamCollection>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        
        while (true) {
        	System.out.println("1. Add Players");
            System.out.println("2. Display Players");
            System.out.println("3. Delete Players");
            System.out.println("4. Check Players");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addPlayers();
                    break;
                case 2:
                    displayPlayers();
                    break;
                case 3:
                    System.out.println("Enter the player name");
                    String n = sc.next();
                    deletePlayers(n);
                    break;
                case 4:
                    System.out.println("Enter the player name");
                    String k = sc.next();
                    checkPlayers(k);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    private static void checkPlayers(String n) {
        System.out.println("Checking players...");
        for (TeamCollection teamMember : sportsteam) {
            if (teamMember.getPlayername().equals(n)) {
                System.out.println(n + " is in the team.");
                return;
            }
        }
        System.out.println(n + " is not in the team.");
    }

    private static void deletePlayers(String n) {
        System.out.println("Deleting...");
        TeamCollection playerToRemove = null;
        for (TeamCollection teamMember : sportsteam) {
            if (teamMember.getPlayername().equals(n)) {
                playerToRemove = teamMember;
                break;
            }
        }
        if (playerToRemove != null) {
            sportsteam.remove(playerToRemove);
            System.out.println(n + " has been removed from the team.");
        } else {
            System.out.println(n + " is not in the team.");
        }
    }

    private static void displayPlayers() {
        System.out.print("Displaying players: ");
        for (TeamCollection teamMember : sportsteam) {
            System.out.print(teamMember.getPlayername() + ", ");
        }
        System.out.println();
    }

    private static void addPlayers() {
        System.out.print("Enter the name of the player: ");
        String playerName = sc.next();
        System.out.print("Enter the player number: ");
        int playerNumber = sc.nextInt();
        sportsteam.add(new TeamCollection(playerName, playerNumber));
        System.out.println("Player added successfully.");
    }
}
