package jp.hatak.misc.samplebot;

import twitter4j.Twitter;
import twitter4j.TwitterException;

import static twitter4j.TwitterFactory.getSingleton;

public class Main {

    public static void main(String[] args) throws TwitterException {
        final Twitter twitter = getSingleton();
        twitter.verifyCredentials();
        twitter.updateStatus("Hello World!");
    }
}
