package com.spring.basic.com.spring.basic.TopicController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/Topics")
    public List<Topics> getTopics()
    {
      return Arrays.asList(new Topics("101","Spring","desc1"),
            new Topics("102","SpringBoot","Desc2"),
            new Topics("103","Web Services","Desc3"));
    }
}
