package sba_core_java.exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myNumberArray = {23, 12, 33, 47};
        float sum = 0;
        float average = 0;

        for(int i = 0; i < myNumberArray.length; i++) {
            sum += myNumberArray[i];
        }
        average = sum / myNumberArray.length;
        System.out.println(average);
        MajorLeagueSoccer majorLeagueSoccer = new MajorLeagueSoccer();
        int[] playerNumberArray = majorLeagueSoccer.getPlayerNumberArray();

        majorLeagueSoccer.sendPlayerToMinorLeague(4);
        System.out.println(Arrays.toString(playerNumberArray));
        System.out.println();
        majorLeagueSoccer.sendPlayerToMinorLeague(4);
        System.out.println(Arrays.toString(playerNumberArray));
        System.out.println();
        majorLeagueSoccer.transferPlayerToDifferentTeam(6, "Tottenham");
        System.out.println(Arrays.toString(playerNumberArray));
        System.out.println();
        majorLeagueSoccer.transferPlayerToDifferentTeam(6, "Napoli");
        System.out.println(Arrays.toString(playerNumberArray));

    }
}
