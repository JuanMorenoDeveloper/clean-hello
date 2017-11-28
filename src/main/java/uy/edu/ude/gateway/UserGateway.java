package uy.edu.ude.gateway;

import uy.edu.ude.applicationmodel.User;

public interface UserGateway {

  User findById(String id);

}
