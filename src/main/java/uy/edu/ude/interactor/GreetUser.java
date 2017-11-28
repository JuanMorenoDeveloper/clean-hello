package uy.edu.ude.interactor;

import uy.edu.ude.GreetUserStoryRequest;
import uy.edu.ude.GreetUserStoryResponse;
import uy.edu.ude.StoryRequest;
import uy.edu.ude.User;
import uy.edu.ude.gateway.UserGateway;
import uy.edu.ude.presenter.StoryPresenter;
import uy.udu.ude.boundary.Story;

public class GreetUser implements Story {

  private final StoryPresenter presenter;
  private final UserGateway gateway;

  public GreetUser(StoryPresenter presenter, UserGateway gateway) {
    this.presenter = presenter;
    this.gateway = gateway;
  }

  public void execute(StoryRequest request) {
    GreetUserStoryRequest req = (GreetUserStoryRequest) request;
    User user = gateway.findById(req.userId);
    presenter.execute(new GreetUserStoryResponse(user.getName()));
  }

}
