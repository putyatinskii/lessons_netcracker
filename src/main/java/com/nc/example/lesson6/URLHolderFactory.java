package com.nc.example.lesson6;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLHolderFactory {

    public URLHolderFactory() {

    }

    public URLHolder createInstance(String url) {
        URLHolder urlHolder = new URLHolder();
        parseUrl(url, urlHolder);
        return urlHolder;
    }

    private void parseUrl(String url, URLHolder urlHolder) {
        try {
            String decUrl = URLDecoder.decode(url, "UTF-8");
            String[] splitUrl = decUrl.split("\\?", 2);
            StringBuilder part_one = new StringBuilder();
            part_one.append(splitUrl[0]);

            String protocol = part_one.substring(0, part_one.indexOf("://"));
            part_one.delete(0, part_one.indexOf("://")+3);

            String domain = part_one.substring(0, part_one.indexOf(":"));
            part_one.delete(0, part_one.indexOf(":")+1);

            int port = Integer.parseInt(part_one.substring(0, part_one.indexOf("/")));
            part_one.delete(0, part_one.indexOf("/")+1);

            String additional_address = part_one.toString();

            String[] splitParams = splitUrl[1].split("&");
            URLParameter[] urlParameters = new URLParameter[splitParams.length];
            int i = 0;
            for (String s: splitParams) {
                String[] pair = s.split("=", 2);
                urlParameters[i] = new URLParameter();
                urlParameters[i].setKey(pair[0]);
                urlParameters[i].setValue(pair[1]);
                ++i;
            }

            urlHolder.setProtocol(protocol);
            urlHolder.setDomain(domain);
            urlHolder.setPort(port);
            urlHolder.setAdditional_address(additional_address);
            urlHolder.setUrlParameters(urlParameters);
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
