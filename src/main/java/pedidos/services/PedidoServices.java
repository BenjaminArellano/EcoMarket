package pedido.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pedido.model.Pedido;
import pedido.repository.PedidoRepository;

@Service
public class PedidoServices {
    @Autowired
    private PedidoRepository pedidoRepository;
    
    public List<Pedido> listar(){
        return pedidoRepository.findAll();    
    }

    public Optional<Pedido> obtenerPorId(Long id){
        return pedidoRepository.findById(id);
    }

    public Pedido guardar(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    public Pedido actualizar(Long id, Pedido datosNuevos){
        return pedidoRepository.findById(id).map(pedido -> {
            pedido.setFecha(datosNuevos.getFecha());
            pedido.setEstado(datosNuevos.getEstado());
            pedido.setTotal(datosNuevos.getTotal());
            pedido.setCliente(datosNuevos.getCliente());
        return pedidoRepository.save(pedido);
        }).orElse(null);
    }

    public void eliminar(Long id){
        pedidoRepository.deleteById(id);
    }
}
