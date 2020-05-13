//package com.hirit.research.account;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.Set;
//
//@Service
//@RequiredArgsConstructor
//public class AccountService implements UserDetailsService {
//    /**
//     * @Service :  서비스 등록 (Bean 으로 등록)
//     * @RequiredArgsConstructor : 롬복으로 생성자 생성 -> 주입받기
//     */
//
//    private final AccountRepository accountRepository; //주입
//
//    // 스프링 부트에서 UserD~ 상속받으면 오버라이딩된 메서드 찾아서 호출(인증 시)
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Account account = accountRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException(username));
//
//        return new User(account.getEmail(), account.getPassword(), getAuthorities());
//    }
//
//    private Collection<? extends GrantedAuthority> getAuthorities() {
//        return Set.of(new SimpleGrantedAuthority("ROLE_USER"));
//
//    }
//
//
//}
