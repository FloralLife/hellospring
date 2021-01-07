package FloralLife.hellospring;

import FloralLife.hellospring.repository.MemberRepository;
import FloralLife.hellospring.repository.MemoryMemberRepository;
import FloralLife.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
