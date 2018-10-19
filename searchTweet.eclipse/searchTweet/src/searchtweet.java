import com.cycling74.max.*;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class searchtweet extends MaxObject
{
	private String OAuthConsumerKey;
	private String OAuthConsumerSecret;
	private String OAuthAccessToken;
	private String OAuthAccessTokenSecret;
	
	private static final String[] INLET_ASSIST = new String[]{
		"usage: search keyword maxresults. ex. 'search #news 5'",
	};
	private static final String[] OUTLET_ASSIST = new String[]{
		"username",
		"tweet body text",
		"date & time of tweet"
	};
	
	public searchtweet(Atom[] args)
	{
		declareInlets(new int[]{DataTypes.ALL});
		declareOutlets(new int[]{DataTypes.ALL, DataTypes.ALL, DataTypes.ALL});

		setInletAssist(INLET_ASSIST);
		setOutletAssist(OUTLET_ASSIST);
		
		// Replace these with your twitter app tokens
		// https://apps.twitter.com
		OAuthConsumerKey = new String("____");
		OAuthConsumerSecret = new String("____");
		OAuthAccessToken = new String("____");
		OAuthAccessTokenSecret = new String("____");
	}

	public void setkey(Atom[] args){
		OAuthConsumerKey = args[0].getString();
		OAuthConsumerSecret = args[1].getString();
		OAuthAccessToken = args[2].getString();
		OAuthAccessTokenSecret = args[3].getString();
	}
	
	public void search(Atom[] args){
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey(OAuthConsumerKey)
		  .setOAuthConsumerSecret(OAuthConsumerSecret)
		  .setOAuthAccessToken(OAuthAccessToken)
		  .setOAuthAccessTokenSecret(OAuthAccessTokenSecret);
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
	   
	   String keyword = args[0].getString();
	   int numresults = args[1].getInt();
       try
		{
	    QueryResult result = twitter.search(new Query(keyword));
		 List<Status> tweets = result.getTweets();
            int i=1; 
			for (Status tweet : tweets) {
				if (i<=numresults) {
					outlet(2, tweet.getCreatedAt().toString());
					outlet(1, tweet.getText());
					outlet(0, tweet.getUser().getName());
				}
				i++;
            }		
		} catch (TwitterException te) {
            te.printStackTrace();
            post("Failed to search tweets: " + te.getMessage());
		}
	}  
}






