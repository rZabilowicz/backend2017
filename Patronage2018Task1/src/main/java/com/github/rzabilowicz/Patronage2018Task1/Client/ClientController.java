package com.github.rzabilowicz.Patronage2018Task1.Client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import static com.github.rzabilowicz.Patronage2018Task1.App.Patronage2018Task1Application.*;

@RestController
@RequestMapping("/clients")
public class ClientController {

    //WYSWIETLENIE WSZYSTKICH REKORDÓW Z LISTY "clients"

    @RequestMapping(value="/", method=RequestMethod.GET)
    public ResponseEntity<ArrayList<Client>> getClients() {
        return ResponseEntity.ok(clients.getAll());
    }

    //WYSWIETLENIE REKORDU PO NUMERZE KLIENTA

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Integer> getClient(@PathVariable int idNumber ) {
        int clientId = clients.get(idNumber);
        return ResponseEntity.ok(clients.get(idNumber));
    }

    //USUWANIE REKORDU

    @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity deleteClient(@PathVariable int idNumber) {
        clients.remove(idNumber);
        return ResponseEntity.noContent().build();
    }

/*
    //DODANIE REKORDU

    @RequestMapping(value="/put", method=RequestMethod.PUT)
    public ResponseEntity addClient(@RequestBody Client client){
        clients.add(client);
        }

    //AKTUALIZACJA REKORDU

    @RequestMapping(value="/{id}", method=RequestMethod.POST)
    public  ResponseEntity putClient(@PathVariable int idNumber){

    }
*/

}