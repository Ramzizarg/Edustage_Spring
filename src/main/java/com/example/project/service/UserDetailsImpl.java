package com.example.project.service;

import com.example.project.entite.Role;
import com.example.project.entite.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UserDetailsImpl implements UserDetails {

    private final Long id;
    private final String email;
    private final String role;
    private final String username;
    private final String password;
    private final Collection<? extends GrantedAuthority> authorities;

    public UserDetailsImpl(Long id,String email, String username, String password, Role role,
                           Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role= String.valueOf(role);
        this.authorities = authorities;
    }

    public static UserDetailsImpl build(User user) {
        List<GrantedAuthority> authorities = user.getRole() != null ?
                List.of(new SimpleGrantedAuthority(user.getRole().name())) : List.of();

        return new UserDetailsImpl(
                user.getId(),
                user.getEmail(),
                user.getUsername(),
                user.getPassword(),
                user.getRole(),
                authorities
        );
    }

    public Long getId() {
        return id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Account expiration logic can be implemented here
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Account locking logic can be implemented here
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Credentials expiration logic can be implemented here
    }

    @Override
    public boolean isEnabled() {
        return true; // Account activation logic can be implemented here
    }

    public String getRoles() { return role;}
}
