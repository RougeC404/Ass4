import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class Post {
    private static final AtomicInteger idCounter = new AtomicInteger();
    private int postNum;
    private String postTitle;
    private String postBody;
    private String[] postTags;
    /* 
    private String [] postTypes = {"very difficult","Difficult","Easy"}

   
    private String [] postEmergency = {"Immediately Needed","Highly Needed" ,"Ordinary"};
    private ArraryList <String> postComments = new ArrayList<>();
    */ 
    public Post(String postTitle, String postBody, String[] postTags) {
        this.postNum = idCounter.incrementAndGet();
        this.postTitle = postTitle;
        this.postBody = postBody;
        this.postTags = postTags;
    }

    public static boolean addPost(String postTitle, String postBody, String[] postTags) {
        // This will validate title length
        if (postTitle.length() < 10 || postTitle.length() > 250) {
            return false;
        }

        // Validates body length
        if (postBody.length() < 250) {
            return false;
        }

        // This validates the Tag count
        if (postTags.length < 2 || postTags.length > 5) {
            return false;
        }

        // Creates a Post object
        Post post = new Post(postTitle, postBody, postTags);

        // Writes post to post.txt file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("post.txt", true))) {
            writer.write(post.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }  //end odf addPost fuction

    @Override
    public String toString() {
        StringBuilder tagsString = new StringBuilder();
        for (String tag : postTags) {
            if (tagsString.length() > 0) {
                tagsString.append(", ");
            }
            tagsString.append(tag);
        }
        return "Post ID: " + postNum + "\nTitle: " + postTitle + "\nBody: " + postBody + "\nTags: " + tagsString.toString();
    }
}


















































 /* 
    private String [] postTypes = {"very difficult","Difficult","Easy"}

   
    private String [] postEmergency = {"Immediately Needed","Highly Needed" ,"Ordinary"};
    private ArraryList <String> postComments = new ArrayList<>();
    */ 