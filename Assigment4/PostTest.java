import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class PostTest { //do not use first test button it does not work
  
    @Test//  1.
    
    public void addPostTitlePositiveTest() {
        String postTitle = "This is a valid Title with more than 10 characters";
        String body = "This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters. ";
        String[] postTags = {"tag1", "tag2"};

        assertTrue(Post.addPost(postTitle, body, postTags));
    }

    @Test //2.


    public void addPostTitleNegativeTest() {
        String postTitle = "01234";
        String postBody = "This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters. ";
        String[] postTags = {"tag1", "tag2"};

        assertFalse(Post.addPost(postTitle, postBody, postTags));
    }

    @Test //3.
    public void addPostBodyPositiveTest() {
        String postTitle = "This is a valid title with more than ten characters";
        String postBody = "This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters. ";
        String[] postTags = {"tag1", "tag2"};

        assertTrue(Post.addPost(postTitle, postBody, postTags));
    }

    @Test   //4.
    public void addPostBodyNegativeTest() {
        String postTitle = "This is a valid Title with more than ten characters";
        String postBody = "This Body will be too short ";
        String[] postTags = {"tag1", "tag2"};

        assertFalse(Post.addPost(postTitle, postBody, postTags));
    }

    @Test//5.
    public void addTagPositiveTest() {
        String postTitle = "This is a valid title with more than ten characters";
        String postBody = "This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters.This is a valid body with more than 250 characters. ";
        String[] postTags = {"tag1", "tag2", "tag3"};

        assertTrue(Post.addPost(postTitle, postBody, postTags));
    }

    @Test //6.
    public void addTagNegativeTest() {
        String postTitle = "This is a valid Title with more than ten characters";
        String postBody = "This is a valid body with more than 250 characters. ".repeat(10);
        String[] postTags = {"tag1", "tag2", "tag3", "tag4", "tag5", "tag6"};

        assertFalse(Post.addPost(postTitle, postBody, postTags));
    }
}

























/** 
    public void testAddpostisValid(){
        String[] postTags = {"yippee","hi"};
        Post post = new Post(1)
    }
    */



