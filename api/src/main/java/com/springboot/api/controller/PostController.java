package com.springboot.api.controller;

import com.springboot.api.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    @PostMapping(value="/member")
    public String postMember(@RequestBody Map<String, Object> postData){
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map->{
            sb.append(map.getKey()+":"+map.getValue()+"\n");
        });

        return sb.toString();
    }

    @PostMapping(value="/member2")
    public String postMemberDTO(@RequestBody MemberDTO memberDTO){
        return memberDTO.toString();
    }
}
