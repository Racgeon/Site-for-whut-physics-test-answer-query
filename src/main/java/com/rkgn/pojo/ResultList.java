package com.rkgn.pojo;

import lombok.Data;

import java.util.List;

@Data
public class ResultList {
    List<Result> results;
    Boolean success;
}
