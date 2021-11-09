package com.capgemini.googly.model;

import java.util.List;

public class Response {
    private List<TeamRanking> data;

    public List<TeamRanking> getData() {
        return data;
    }

    public void setData(List<TeamRanking> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "data=" + data +
                '}';
    }
}
