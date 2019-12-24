package com.cui.fileupload;

import com.files.HttpFileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : cuiyingnan
 * @date : 2019/12/24 11:17
 * @desc :
 */
@RestController
@RequestMapping("file/upload")
public class FilesController {

    @Value("${files.upload.serverPath}")
    String serverPath;
    @Value("${files.upload.serverAthorization}")
    String serverAthorization;
    @Value("${files.upload.fileServerFilesAddress}")
    String fileServerFilesAddress;

    @RequestMapping
    public List<String> singleFileUploads(HttpServletRequest request, int userId) throws IOException {
        String auth = request.getHeader("Authorization");
        if (!serverAthorization.equals(auth)) {
            return null;//return no auth
        }

        MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
        List<MultipartFile> files = multiRequest.getFiles("file");
        List<String> list = new ArrayList<>();
        if (files != null) {
            list = HttpFileUtils.upload2Server(request, serverPath, fileServerFilesAddress);
        }
        return list;
    }
}
