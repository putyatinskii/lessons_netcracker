package com.nc.example.lesson6;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;

public class URLHolder {
    private String protocol;
    private String domain;
    private int port;
    private String additional_address;
    private URLParameter[] urlParameters;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getAdditional_address() {
        return additional_address;
    }

    public void setAdditional_address(String additional_address) {
        this.additional_address = additional_address;
    }

    public URLParameter[] getUrlParameters() {
        return urlParameters;
    }

    public void setUrlParameters(URLParameter[] urlParameters) {
        this.urlParameters = urlParameters;
    }

    @Override
    public String toString() {
        StringBuilder param = new StringBuilder();
        for (URLParameter parameter: urlParameters) {
            try {
            String key = URLEncoder.encode(parameter.getKey(), "UTF-8");
            String value = URLEncoder.encode(parameter.getValue(), "UTF-8");
            param.append(key + "=" + value + "&");
            }
            catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        param.delete(param.length()-1, param.length());
        return protocol + "//:" +
                domain + ":" +
                port + "/" +
                additional_address + "?" +
                param;
    }
}
