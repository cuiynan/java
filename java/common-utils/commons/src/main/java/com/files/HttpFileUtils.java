package com.files;

import com.commons.MyStringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : cuiyingnan
 * @date : 2019/12/23 10:07
 * @desc :
 */
public class HttpFileUtils {

    /**
     * 上传文件后返回 文件路径
     *
     * @param request
     * @param serverPath        服务器地址
     * @param serverFileAddress 服务器文件地址
     * @return List<String> 上传后的服务器地址
     */
    public static List<String> upload2Server(HttpServletRequest request, String serverPath, String serverFileAddress) throws IOException {
        MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
        List<MultipartFile> files = multiRequest.getFiles("file");
        List<String> list = new ArrayList<>();
        if (files != null) {
            File file;
            String localFileName;
            for (MultipartFile multipartFile : files) {
                if (multipartFile.isEmpty()) {
                    return new ArrayList<>();
                }

                localFileName = System.currentTimeMillis() + VerifyCodeUtil.generateVerifyCode(6);
                file = new File(serverPath);
                if (!file.exists()) {
                    file.mkdirs();
                }
                //原图名字
                String fileRealName = MyStringUtils.getLastPrefix(multipartFile.getOriginalFilename());
                localFileName += fileRealName;

                //拼接后台文件名
                File pathFile = new File(serverPath + "/" + localFileName);
                multipartFile.transferTo(pathFile);
                list.add(serverFileAddress + localFileName);
            }
        }
        return list;
    }

}
