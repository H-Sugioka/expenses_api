package pw.qnv.spendingapi.api.spending;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.models.Response;
import pw.qnv.spendingapi.domain.spending.SpendingService;

/**
 * SpendingController
 */
@RestController
public class SpendingController {
    @Autowired
    private SpendingService service;

    @GetMapping("/spendings")
    public SpendingApiResponse spendings(@RequestParam("start") String start, @RequestParam("end") String end,
            @RequestParam("user") String user) {
        System.out.println("test");
        return new SpendingApiResponse();
    }

}