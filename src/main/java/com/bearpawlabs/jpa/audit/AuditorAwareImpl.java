package com.bearpawlabs.jpa.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

public class AuditorAwareImpl implements AuditorAware<String> {

  @Override
  public String getCurrentAuditor() {
      return "Roo";
      // Can use Spring Security to return currently logged in user
      // return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername()
  }
}