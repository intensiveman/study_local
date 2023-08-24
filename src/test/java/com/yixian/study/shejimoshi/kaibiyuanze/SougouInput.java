package com.yixian.study.shejimoshi.kaibiyuanze;

import lombok.Data;

@Data
public class SougouInput {
    private Skin skin;
    public void disPlay(){
        skin.disPlay();
    }
}
