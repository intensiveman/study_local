package com.yixian.study.shejimoshi.kaibiyuanze;

import lombok.Data;



@Data
public class Client {
    public static void main(String[] args) {
        SougouInput sougouInput = new SougouInput();
        BaiduSkin baiduSkin = new BaiduSkin();
        sougouInput.setSkin(baiduSkin);
        sougouInput.disPlay();



    }




}
