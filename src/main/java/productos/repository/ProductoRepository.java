package producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import producto.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
    
}
