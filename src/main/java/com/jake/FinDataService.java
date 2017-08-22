package com.jake;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

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
        RestTemplate restTemplate = new RestTemplate();

        try {
            for (FinData pos: finDataList) {
                Quote quote = restTemplate.getForObject("http://dev.markitondemand.com/MODApis/Api/v2/Quote/json?Symbol=" + pos.getTicker(), Quote.class);
                if (quote.lastPrice != null) {
                    pos.setPrice(quote.lastPrice);
                }
                System.out.println(quote);

            }
        } catch (Exception e) {
            System.out.println("Error getting quotes" + e);
            return null;
        }

        return finDataList;
    }

}
