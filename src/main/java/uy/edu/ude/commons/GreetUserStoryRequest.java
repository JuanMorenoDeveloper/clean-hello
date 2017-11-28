package uy.edu.ude.commons;

public class GreetUserStoryRequest implements StoryRequest {
  public final String userId;

  public GreetUserStoryRequest(String userId) {
    this.userId = userId;
  }
}
