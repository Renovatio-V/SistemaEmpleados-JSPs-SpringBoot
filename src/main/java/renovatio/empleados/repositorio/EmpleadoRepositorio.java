package renovatio.empleados.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import renovatio.empleados.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}
