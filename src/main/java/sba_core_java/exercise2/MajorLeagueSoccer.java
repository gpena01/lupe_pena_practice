package sba_core_java.exercise2;

import java.sql.Array;

public class MajorLeagueSoccer {
    private int[] playerNumberArray;

    public MajorLeagueSoccer() {
        playerNumberArray = new int[11];
        for(int i = 0; i < playerNumberArray.length; i++) {
            playerNumberArray[i] = i + 1;
        }
    }
    void sendPlayerToMinorLeague(int playerID) {
        if(playerNumberArray[playerID - 1] != -1) {
            playerNumberArray[playerID - 1] = -1;
            System.out.printf("Player %d is sent to minor league %n", playerID);
        } else {
            System.out.printf("Player %d is no longer available %n", playerID);
        }
    }
    void transferPlayerToDifferentTeam(int playerID, String destinationTeam) {
        if(playerNumberArray[playerID - 1] != -1) {
            playerNumberArray[playerID - 1] = -1;
            System.out.printf("Player %d is transferred to %s %n", playerID, destinationTeam);
        } else {
            System.out.printf("Player %d is no longer available %n", playerID);
        }
    }

    public int[] getPlayerNumberArray() {
        return playerNumberArray;
    }
}
