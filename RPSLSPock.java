package edu.cscc;


import java.util.Random;


/**
 * RPSLSPock class
 *
 * @author Jon Ransom
 * <p>
 * version 1
 */


public class RPSLSPock {

    /**
     * @param rand Rand to generate random pick for game
     */


    static Random rand = new Random(System.currentTimeMillis());


    /**
     * @param rock pick for player
     */


    public static final String ROCK = "rock";

    /**
     * @param paper pick for player
     */


    public static final String PAPER = "paper";

    /**
     * @param scissors pick for player
     */


    public static final String SCISSORS = "scissors";

    /**
     * @param lizard pick for player
     */


    public static final String LIZARD = "lizard";


    /**
     * @param spock pick for player
     */

    public static final String SPOCK = "spock";

    /**
     * Verifies if input is a valid pick
     *
     * @param pick input to verify
     * @return true if valid pick and false in invalid
     */


    public static boolean isValidPick(String pick) {

        if (pick == null) {

            return false;

        }

        pick = pick.trim();

        return (ROCK.equalsIgnoreCase(pick) ||

                PAPER.equalsIgnoreCase(pick) ||

                SCISSORS.equalsIgnoreCase(pick) ||

                LIZARD.equalsIgnoreCase(pick) ||

                SPOCK.equalsIgnoreCase(pick));

    }


    /**
     * Generates pick from rand
     *
     * @return pick
     */

    public static String generatePick() {

        String pick = null;

        switch (rand.nextInt(5)) {

            case 0:

                pick = ROCK;

                break;

            case 1:

                pick = PAPER;

                break;

            case 2:

                pick = SCISSORS;

                break;

            case 3:

                pick = LIZARD;

                break;

            case 4:

                pick = SPOCK;

                break;

        }

        return pick;

    }

    /**
     * Verifies if computer wins
     *
     * @param c_pick computer pick
     * @param h_pick player pick
     * @return true if computer wins false if player wins
     */

    public static boolean isComputerWin(String c_pick, String h_pick) {

        h_pick = h_pick.toLowerCase();

        return ((ROCK.equals(c_pick) && (SCISSORS.equals(h_pick) || LIZARD.equals(h_pick))) ||

                (PAPER.equals(c_pick) && (ROCK.equals(h_pick) || SPOCK.equals(h_pick))) ||

                (SCISSORS.equals(c_pick) && (PAPER.equals(h_pick) || LIZARD.equals(h_pick))) ||

                (LIZARD.equals(c_pick) && (PAPER.equals(h_pick) || SPOCK.equals(h_pick))) ||

                (SPOCK.equals(c_pick) && (ROCK.equals(h_pick) || SCISSORS.equals(h_pick))));

    }

}



