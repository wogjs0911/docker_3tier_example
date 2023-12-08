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
     * 1. docker에 SpringPrj를 jar로 만들어 올리기
     *   - docker 명령어 정리
      */
    // 1) 서버 빌드(초기화) : gradle에서 build -> clean -> build -> bootJar 이후 3) 진행
    // 2) Dockerfile의 이미지 생성 : docker build -t dockertest .
    // 3) 이미지 실행하여 컨테이너 생성 및 실행 : docker run -p 8080:8080 dockertest
    // ** 해당 jar 파일은 프로젝트명을 따라간다.
}
