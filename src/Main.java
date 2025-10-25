import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        EmpleadoPlanta ep1 = new EmpleadoPlanta();
        empleados.add(ep1);
        EmpleadoPlanta ep2 = new EmpleadoPlanta();
        empleados.add(ep2);
        EmpleadoPlanta ep3 = new EmpleadoPlanta();
        empleados.add(ep3);
        EmpleadoTemporal et1 = new EmpleadoTemporal();
        empleados.add(et1);
        EmpleadoTemporal et2 = new EmpleadoTemporal();
        empleados.add(et2);
        EmpleadoTemporal et3 = new EmpleadoTemporal();
        empleados.add(et3);

        for (Empleado empleado : empleados) {
            empleado.calcularSueldo();
        }
    }
}