package com.nc.example.solution.lesson6;

import com.nc.example.lesson6.*;
import com.nc.example.LessonAPI;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class Solution_lesson6 implements LessonAPI {
    @Override
    public void executeSolution(String[] args) {
        String url = "http://localhost.netcracker.com:6810/somproduct.plain_taskc.nc" +
                "?tab=_Task" +
                "&object=9090363151013783084" +
                "&container=9158610804913819337" +
                "&task=9158610807913819337" +
                "&state=update" +
                "&return=%2Fcommon%2Fuobject.jsp%3Fobject%3D9158610804913819337" +
                "&object=9090363151013783084";

        URLHolderFactory urlHolderFactory = new URLHolderFactory();
        URLHolder urlHolder = urlHolderFactory.createInstance(url);
        System.out.println("Protocol: " + urlHolder.getProtocol() +
                            "\nDomain: " + urlHolder.getDomain() +
                            "\nPort: " + urlHolder.getPort() +
                            "\nAdditional_address: " + urlHolder.getAdditional_address());
        System.out.println("Parameters: ");
        for (URLParameter param: urlHolder.getUrlParameters()) {
            System.out.println(param.getKey() + ": " + param.getValue());
        }
        System.out.println(urlHolder);

        System.out.println("=====================\n");
        String url1 = "https://example.com:8000/path/to/page" +
                "?name=ferret" +
                "&color=purple";
        URLHolderFactory urlHolderFactory1 = new URLHolderFactory();
        URLHolder urlHolder1 = urlHolderFactory.createInstance(url1);
        System.out.println("Protocol: " + urlHolder1.getProtocol() +
                "\nDomain: " + urlHolder1.getDomain() +
                "\nPort: " + urlHolder1.getPort() +
                "\nAdditional_address: " + urlHolder1.getAdditional_address());
        System.out.println("Parameters: ");
        for (URLParameter param: urlHolder1.getUrlParameters()) {
            System.out.println(param.getKey() + ": " + param.getValue());
        }
        System.out.println(urlHolder1);
    }
}
