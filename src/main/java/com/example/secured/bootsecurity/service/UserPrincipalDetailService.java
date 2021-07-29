package com.example.secured.bootsecurity.service;

import com.example.secured.bootsecurity.db.UserRepository;
import com.example.secured.bootsecurity.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserPrincipalDetailService implements UserDetailsService {
    private UserRepository userRepository;

    public UserPrincipalDetailService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(s);
        UserPrincipal userPrincipal = new UserPrincipal(user);
        return userPrincipal;
    }


}
