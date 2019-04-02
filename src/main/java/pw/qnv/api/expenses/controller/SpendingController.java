package pw.qnv.api.expenses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pw.qnv.api.expenses.service.SpendingService;

/**
 * SpendingController
 */
@RestController
public class SpendingController {
    @Autowired
    private SpendingService service;

    @GetMapping("/spending")
    public String getSpendings() {
        System.out.println("test");
        return service.get();
    }

}