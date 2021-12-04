package com.example.Register.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.Register.models.SaleRegister;

import java.util.List;

public interface SaleRegisterRepository extends MongoRepository<SaleRegister, String> {
    List<SaleRegister> getByCliente(Integer cliente);
    List<SaleRegister> getByProducto(Integer producto);
    List<SaleRegister> getByProveedor(Integer proveedor);
    List<SaleRegister> getByProductoAndCliente(Integer producto,Integer cliente);
    List<SaleRegister> deleteByRegistroID(String registroID);
}
