package com.demo.controller;

import com.demo.entity.Client;
import com.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping("/getAllData")
    public List<Client> getData(){
        return clientService.getData();
    }
    @GetMapping("/getData/{pan}")
    public Client getUniqueData(@PathVariable String pan) {
        return clientService.getUniqueData(pan);
    }
    @PostMapping("/addData")
    public Client addData(@RequestBody Client client){
        return clientService.addData(client);

    }
    @DeleteMapping("/delete/{pan}")
    public void deleteData(@PathVariable String pan) {

        clientService.deleteData(pan);
    }


}
