//package com.example.springsecurityapplication.config;
//
//import com.example.springsecurityapplication.services.PersonDetailsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//import java.util.Collections;
//
//@Component
//public class AuthenticationProvider implements org.springframework.security.authentication.AuthenticationProvider {
//
//    private final PersonDetailsService personDetailsService;
//
//    @Autowired
//    public AuthenticationProvider(PersonDetailsService personDetailsService) {
//        this.personDetailsService = personDetailsService;
//    }
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        // Получаем логин с формы аутентификации. За нас Spring
//        // Security сам возьмет объект из формы и передаст
//        //его сюда
//        String login = authentication.getName();
//
//        // Получаем запись найденного пользователя по логину
//        UserDetails person = personDetailsService.loadUserByUsername(login);
//
//        String password = authentication.getCredentials().toString();
//
//        if(!password.equals(person.getPassword()))
//        {
//            throw new BadCredentialsException("Не корректный пароль");
//        }
//
//        // Возвращаем объек аутентификации. В данном объекте будет лежать объект модели,
//        // пароль, права доступа - > ролей нет
//        // Данный объект будет помещен в сессию
//        return new UsernamePasswordAuthenticationToken(person, password, Collections.emptyList());
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return true;
//    }
//}
