package co.edu.sena.inventario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.sena.inventario.model.Clientes;


import java.util.List;


@RestController
public class ClienteController {
    private final List<Clientes> clientes = List.of(
            new Clientes(1L, "Andres", "andres@gmail.com", "3001122333", "Calle 5 #6-20"),
            new Clientes(2L, "Pepe", "pepe@gmail.com", "3223456111", "Calle 2 #3-25"),
            new Clientes(3L, "Francisco", "francisco@gmail.com", "3503234335", "Carrera 29 #59-20")
        );

    @GetMapping("/clientes")
    public List<Clientes> listarClientes() {
        return clientes;
    }

     @GetMapping("/clientes/{id}")
    public Clientes buscarClientes(@PathVariable Long id) {
    for (Clientes cliente : clientes) {
        if (cliente.getId().equals(id)) {
            return cliente;
            }
        }
        return null;
    }
}
