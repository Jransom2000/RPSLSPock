package edu.cscc;

import static org.junit.Assert.*;

public class RPSLSPockTest2 {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void isValidPick() {

        Assert.assertTrue(RPSLSPock.isValidPick(RPSLSPock.ROCK));
        Assert.assertTrue(RPSLSPock.isValidPick(RPSLSPock.PAPER));
        Assert.asserTrue(RPSLSPock.isValidPick(RPSLSPock.SCISSORS));
        Assert.assertTrue(RPSLSPock.isValidPick(RPSLSPock.LIZARD));
        Assert.assertTrue(RPSLSPock.isValidPick(RPSLSPock.SPOCK));
    }

    @org.junit.Test
    public void generatePick() {

        for (int i=0; i<100000; i++){

            String pick = RPSLSPock.generatePick();// Get random pick
            Pick pick = new string H_pick
                    assertNotNull("Verify that pick is NOT null", pick);

          isValidPick();{
              ValidPick = new ValidPick();
              assertTrue("Verify result is valid", isValidPick());
            }
        }
    }

    @org.junit.Test
    public void isComputerWin() {

        Assert.assertTrue(RPSLSPock.isComputerWin(RPSLSPock.PAPER,RPSLSPock.ROCK));
        Assert.asserTrue(RPSLSPock.isComputerWin(RPSLSPock.ROCK,RPSLSPock.SCISSORS));
        Assert.assertTrue(RPSLSPock.isComputerWin(RPSLSPock.SCISSORS, RPSLSPock.PAPER));
        Assert.assertTrue(RPSLSPock.isComputerWin(RPSLSPock.SPOCK, RPSLSPock.LIZARD));
        Assert.assertTrue(RPSLSPock.isComputerWin(RPSLSPock.SPOCK, RPSLSPock.ROCK));
        Assert.assertTrue(RPSLSPock.isComputerWin(RPSLSPock.SCISSORS, RPSLSPock.LIZARD));
        Assert.assertTrue(RPSLSPock.isComputerWin(RPSLSPock.LIZARD, RPSLSPock.ROCK));
        Assert.assertTrue(RPSLSPock.isComputerWin(RPSLSPock.LIZARD, RPSLSPock.PAPER));
        Assert.assertTrue(RPSLSPock.isComputerWin(RPSLSPock.PAPER, RPSLSPock.SPOCK));
        Assert.assertTrue(RPSLSPock.isComputerWin(RPSLSPock.SCISSORS, RPSLSPock.SPOCK));








    }
}