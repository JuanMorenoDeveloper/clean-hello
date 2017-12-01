package uy.edu.ude.test;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertEquals;

import uy.edu.ude.applicationmodel.User;
import uy.edu.ude.gateway.UserGateway;
import uy.edu.ude.interactor.GreetUser;
import uy.edu.ude.interactor.GreetUserStoryRequest;
import uy.edu.ude.interactor.GreetUserStoryResponse;
import uy.edu.ude.interactor.StoryRequest;
import uy.edu.ude.interactor.StoryResponse;
import uy.edu.ude.presenter.StoryPresenter;
import uy.udu.ude.boundary.Story;

public class GreetUserTest {

  @Test
  public void givenRequestWithUserId_whenGreetUserExecute_thenResponseWithName() {
    StoryPresenter presenter = Mockito.mock(StoryPresenter.class);
    ArgumentCaptor<StoryResponse> capturedResponse = ArgumentCaptor.forClass(StoryResponse.class);
    UserGateway gateway = Mockito.mock(UserGateway.class);
    when(gateway.findById("UserId")).thenReturn(new User("Name"));// Stub

    Story sut = new GreetUser(presenter, gateway);
    StoryRequest request = new GreetUserStoryRequest("UserId");
    sut.execute(request);

    verify(presenter).execute(capturedResponse.capture());// Capture arguments
    GreetUserStoryResponse response = (GreetUserStoryResponse) capturedResponse.getValue();
    assertEquals(response.name, "Name");
  }
}
