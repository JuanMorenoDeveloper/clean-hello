package uy.edu.ude.boundary;

import uy.edu.ude.interactor.StoryRequest;

public interface Story {
  void execute(StoryRequest request);
}
