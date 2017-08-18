package com.jake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created on 8/15/17.
 */
@RestController
public class MainController {

    //autowire in an internal service
    @Autowired
    FinDataService fdService;

    @GetMapping("/getFinData")
    public List<FinData> getSomeFinData() {
        return fdService.getFinData();
    }


}
