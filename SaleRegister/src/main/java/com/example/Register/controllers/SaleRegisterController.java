package com.example.Register.controllers;

import com.example.Register.exceptions.SaleRegisterNotFoundException;
import com.example.Register.repositories.SaleRegisterRepository;
import com.example.Register.models.SaleRegister;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class SaleRegisterController {
    private final SaleRegisterRepository repository;

    public SaleRegisterController(SaleRegisterRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/saleregisters/{registroID}") // convert the next method to an endpoint
    Optional<SaleRegister> getSaleRegisterById(@PathVariable String registroID){
        return this.repository.findById(registroID);
    }
    @GetMapping("/saleregisterspv/{proveedor}") // convert the next method to an endpoint
    List<SaleRegister> getSaleRegisterByProveedor(@PathVariable Integer proveedor){
        return this.repository.getByProveedor(proveedor);
    }
    @GetMapping("/saleregistersc/{cliente}") // convert the next method to an endpoint
    List<SaleRegister> getSaleRegisterByCliente(@PathVariable Integer cliente){
        return this.repository.getByCliente(cliente);
    }
    @GetMapping("/saleregistersp/{producto}") // convert the next method to an endpoint
    List<SaleRegister> getSaleRegisterByProducto(@PathVariable Integer producto){
        return this.repository.getByProducto(producto);
    }
    @GetMapping("/saleregisterscp/{cliente}/{producto}") // convert the next method to an endpoint
    List<SaleRegister> getSaleRegisterByProductoAndCliente( @PathVariable Integer cliente,@PathVariable Integer producto){
        return this.repository.getByProductoAndCliente(producto,cliente);
    }
    @PostMapping("/saleregister")
    SaleRegister newSaleRegister(@RequestBody SaleRegister saleregisters){
        return this.repository.save(saleregisters);
    }

    @DeleteMapping("/saleregister/{registroID}")
    public void deleteSaleRegister( @PathVariable String registroID){
        repository.deleteByRegistroID(registroID);
    }
    /*
    @PutMapping("/saleRegister/{registroID}")
    public SaleRegister updateRegister(@PathVariable String registroID, @RequestBody SaleRegister newSRegister){
        SaleRegister oldSRegister = repository.findById(registroID).orElse(null);
        oldSRegister.setCantidad(newSRegister.getCantidad());
        oldSRegister.setFecha(newSRegister.getFecha());
        oldSRegister.setNombreCliente(newSRegister.getNombreCliente());
        oldSRegister.setProveedor(newSRegister.getProveedor());
        oldSRegister.setNombreProducto(newSRegister.getNombreProducto());
        oldSRegister.setPromocion(newSRegister.getPromocion());
        oldSRegister.setPrecio(newSRegister.getPrecio());
        oldSRegister.setTotal(newSRegister.getPrecio() * newSRegister.getCantidad());
        return repository.save(oldSRegister);
    }*/
}
