package uy.edu.ude.gateway;

import uy.edu.ude.User;

public interface UserGateway {

  User findById(String id);

}
