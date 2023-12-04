package com.docker.test1.springDockerTest.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "docker test1!!!";
    }

    /**
     * docker 명령어 정리
      */
    // 1) docker build -t dockertest .
    // 2) gradle에서 build -> clean -> build -> bootJar 이후 3) 진행
    // 3) docker run -p 8080:8080 dockertest
}
