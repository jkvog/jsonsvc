package com.jake;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created  on 8/15/17.
 */
@Component
public class FinDataService {
    private static List<FinData> finDataList = new ArrayList<>();

    static {
        FinData fd1 = new FinData("IBM", "International Business Machines");
        FinData fd2 = new FinData("AMZN", "Amazon");
        finDataList.add(fd1);
        finDataList.add(fd2);
    }

    public List<FinData> getFinData() {
        System.out.println("Getting fin data");
        return finDataList;
    }

}
