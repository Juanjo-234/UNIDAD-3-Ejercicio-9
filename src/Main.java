//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
ControlVelocidad control1 = new ControlVelocidad(100.0, 110.0);

 control1.acelerar(5.5);
 System.out.println("Velocidad actual: " + control1.getVelocidadActual() + " km/h\n");

 control1.acelerar(10.0);
 System.out.println("Velocidad actual (limitada por el sistema): " + control1.getVelocidadActual() + " km/h\n");

 control1.frenar(5.0);
 System.out.println("Velocidad actual: " + control1.getVelocidadActual() + " km/h\n");

}
