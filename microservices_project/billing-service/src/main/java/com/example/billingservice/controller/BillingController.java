package com.example.billingservice.controller;

import com.example.billingservice.model.Invoice;
import com.example.billingservice.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billing")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @GetMapping("/invoices")
    public List<Invoice> getAllInvoices() {
        return billingService.getAllInvoices();
    }

    @GetMapping("/invoices/{id}")
    public Invoice getInvoiceById(@PathVariable Long id) {
        return billingService.getInvoiceById(id);
    }

    @PostMapping("/invoices")
    public Invoice createInvoice(@RequestBody Invoice invoice) {
        return billingService.createInvoice(invoice);
    }

    @DeleteMapping("/invoices/{id}")
    public void deleteInvoice(@PathVariable Long id) {
        billingService.deleteInvoice(id);
    }
}
