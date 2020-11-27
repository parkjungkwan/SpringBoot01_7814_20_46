package com.example.demo.domains;

import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.Getter;

@Component @Getter @Setter
public class ReplyDto extends ArticleDto{
    protected int replyId;
}
