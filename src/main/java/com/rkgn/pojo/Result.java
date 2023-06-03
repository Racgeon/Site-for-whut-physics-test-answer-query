package com.rkgn.pojo;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
@Data
public class Result {
    private String answer;
    private String content;
    private List<Options> options;
}
