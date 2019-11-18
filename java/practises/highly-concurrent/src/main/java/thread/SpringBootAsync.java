package thread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/3/7 15:30
 **/
@RestController
@RequestMapping("syn")
public class SpringBootAsync {

    @Autowired
    SpringBootAsyncDo springBootAsyncDo;

    @GetMapping
    public String start() {
        StringBuffer result = new StringBuffer("here is begin");
        try {
            springBootAsyncDo.testSync(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
            result.append( "here is exception") ;
        }
        result.append("here is end");
        return result.toString();
    }


}

