package cn.supremelytechnology.service.impl;

import cn.supremelytechnology.model.FileAttribute;
import cn.supremelytechnology.service.FilePreview;
import cn.supremelytechnology.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * Created by kl on 2018/1/17.
 * Content :其他文件
 */
@Service
public class OtherFilePreviewImpl implements FilePreview {
    @Autowired
    FileUtils fileUtils;

    @Override
    public String filePreviewHandle(String url, Model model, FileAttribute fileAttribute) {
        model.addAttribute("fileType",fileAttribute.getSuffix());
        model.addAttribute("msg", "系统还不支持该格式文件的在线预览，" +
                "如有需要请按下方显示的邮箱地址联系系统维护人员");
        return "fileNotSupported";
    }
}
