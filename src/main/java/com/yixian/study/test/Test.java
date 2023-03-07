package com.yixian.study.test;

import com.yixian.study.dto.Student;
import com.yixian.study.dto.User;
import com.yixian.study.extend.Fu;
import com.yixian.study.extend.Service;
import com.yixian.study.extend.Zi;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @version V1.0
 * @description:
 * @author: wangdi
 * @date: 2022-12-31 9:45
 */

public class Test {



    public static void main(String[] args) {
        User user = new User();
        Class<? extends User> aClass = user.getClass();
        Class<?>[] interfaces = aClass.getInterfaces();
        System.out.println("interfaces = " + interfaces[0].getName());
    }












    public static int change(Integer i,String name)
    {
        return 1;
    }
}
