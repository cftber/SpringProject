package com.tgzhao.core.common;

/**
 * Created by tgzhao on 16/5/27.
 */
public class MobileDefinition {
    public static String uploadRoot;
    public static String ktvHost;
    public static String ktvAvatar;
    public static String discountUrl;
    public static String socketHost;


    public String getSocketHost() {
        return socketHost;
    }

    public void setSocketHost(String socketHost) {
        this.socketHost = socketHost;
    }

    public String getDiscountUrl() {
        return discountUrl;
    }

    public void setDiscountUrl(String discountUrl) {
        this.discountUrl = discountUrl;
    }

    public String getKtvAvatar() {
        return ktvAvatar;
    }

    public void setKtvAvatar(String ktvAvatar) {
        this.ktvAvatar = ktvAvatar;
    }

    public String getKtvHost() {
        return ktvHost;
    }

    public void setKtvHost(String ktvHost) {
        this.ktvHost = ktvHost;
    }


    public String getUploadRoot() {
        return uploadRoot;
    }

    public void setUploadRoot(String uploadRoot) {
        this.uploadRoot = uploadRoot;
    }
}