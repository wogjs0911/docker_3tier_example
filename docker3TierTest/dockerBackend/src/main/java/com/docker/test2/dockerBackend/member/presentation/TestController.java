package com.docker.test2.dockerBackend.member.presentation;

import com.docker.test2.dockerBackend.member.model.entity.Member;
import com.docker.test2.dockerBackend.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class TestController {
    private final MemberRepository memberRepository;

    @GetMapping("/test")
    public List<Member> getMember(){
        return memberRepository.findAll();
    }

    @PostMapping("/add")
    public Member addMember(Member member){
        member.builder()
                .id(1L)
                .username("gimjae")
                .build();
        return memberRepository.save(member);
    }
}
