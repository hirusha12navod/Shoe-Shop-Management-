package lk.ijse.finalcoursework.shoeshop.service;

import org.springframework.security.core.userdetails.UserDetails;

/**
 *@author: Hirusha Navod,
 *@Runtime version: 11.0.11+9-b1341.60 amd64
 **/

public interface JWTService {
    String extractUserName(String token);
    String generateToken(UserDetails userDetails);
    boolean isTokenValid(String token, UserDetails userDetails);
}
