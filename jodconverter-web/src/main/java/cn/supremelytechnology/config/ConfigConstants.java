package cn.supremelytechnology.config;

import org.artofsolving.jodconverter.office.OfficeUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * @auther: chenjh
 * @time: 2019/4/10 17:22
 * @description
 */
@Component
public class ConfigConstants {

    private static String[] simText = {};
    private static String[] media = {};
    private static String convertedFileCharset;
    private static String officePreviewType;
    private static String ftpUsername;
    private static String ftpPassword;
    private static String ftpControlEncoding;
    private static String fileDir = OfficeUtils.getHomePath() + File.separator + "file" + File.separator;

    public static String[] getSimText() {
        return simText;
    }

    public static void setSimText(String[] simText) {
        ConfigConstants.simText = simText;
    }

    public static String[] getMedia() {
        return media;
    }

    public static void setMedia(String[] media) {
        ConfigConstants.media = media;
    }

    public static String getConvertedFileCharset() {
        return convertedFileCharset;
    }

    public static void setConvertedFileCharset(String convertedFileCharset) {
        ConfigConstants.convertedFileCharset = convertedFileCharset;
    }

    public static String getOfficePreviewType() {
        return officePreviewType;
    }

    public static void setOfficePreviewType(String officePreviewType) {
        ConfigConstants.officePreviewType = officePreviewType;
    }

    public static String getFtpUsername() {
        return ftpUsername;
    }

    public static void setFtpUsername(String ftpUsername) {
        ConfigConstants.ftpUsername = ftpUsername;
    }

    public static String getFtpPassword() {
        return ftpPassword;
    }

    public static String getFtpControlEncoding() {
        return ftpControlEncoding;
    }

    public static void setFtpControlEncoding(String ftpControlEncoding) {
        ConfigConstants.ftpControlEncoding = ftpControlEncoding;
    }

    public static void setFtpPassword(String ftpPassword) {
        ConfigConstants.ftpPassword = ftpPassword;
    }

    public static String getFileDir() {
        return fileDir;
    }

    @Value("${file.dir:default}")
    public void setFileDir(String fileDir) {
        if (!"default".equals(fileDir)) {
            if (!fileDir.endsWith(File.separator)) {
                fileDir = fileDir + File.separator;
            }
            ConfigConstants.fileDir = fileDir;
        }
    }

}
