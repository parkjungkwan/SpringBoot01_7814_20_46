package com.example.demo.cop.bbs.service.model;

import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.Getter;

@Component @Getter @Setter
public class ReplyDto extends ArticleDto{
    protected int replyId;
}
