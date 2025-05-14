package producto.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import producto.model.Producto;
import producto.repository.ProductoRepository;

@Service
public class ProductoServices {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> listar(){
        return productoRepository.findAll();
    }

    public Optional<Producto> obtenerPorId(Long id){
        return productoRepository.findById(id);
    }

    public Producto guardar(Producto producto){
        return productoRepository.save(producto);
    }

    public Producto actualizar(Long id, Producto datosNuevos){
        return productoRepository.findById(id).map(producto -> {
            producto.setNombre(datosNuevos.getNombre());
            producto.setDescripcion(datosNuevos.getDescripcion());
            producto.setPrecio(datosNuevos.getPrecio());
            producto.setCategoria(datosNuevos.getCategoria());
        return productoRepository.save(producto);
        }).orElse(null);
    }

    public void eliminar(Long id){
        productoRepository.deleteById(id);
    }
}
