package uy.edu.ude.interactor;

public class GreetUserStoryRequest implements StoryRequest {
  public final String userId;

  public GreetUserStoryRequest(String userId) {
    this.userId = userId;
  }
}
