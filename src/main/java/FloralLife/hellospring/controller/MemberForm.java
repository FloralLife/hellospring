package FloralLife.hellospring.controller;

import FloralLife.hellospring.domain.Member;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;

public class MemberForm {
    // form의 input에서 name = ~~ 되어 있는 부분
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
