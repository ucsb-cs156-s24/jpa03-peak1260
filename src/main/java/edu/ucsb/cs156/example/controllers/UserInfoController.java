package edu.ucsb.cs156.example.controllers;

import edu.ucsb.cs156.example.entities.User;
import edu.ucsb.cs156.example.models.CurrentUser;
import edu.ucsb.cs156.example.services.CurrentUserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is a REST controller for getting information about the current user.
 */

@Tag(name = "Current User Information")
@RequestMapping("/api/currentUser")
@RestController
public class UserInfoController extends ApiController {

  /**
   * This method returns the current user.
   * @return the current user
   */

  @Operation(summary = "Get information about current user")
  @PreAuthorize("hasRole('ROLE_USER')")
  @GetMapping("")
  public CurrentUser getCurrentUser() {
    return super.getCurrentUser();
  }
}
