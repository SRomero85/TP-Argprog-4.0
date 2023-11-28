import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Servicio servicio = new Servicio();
        servicio.setNombre("Entrega");
        servicio.setDescripcion("Entrega de productos");
        servicio.setId(1);
        Servicio.tipoServicio.add(servicio);
        Servicio servicio2 = new Servicio();
        servicio2.setNombre("Retiro");
        servicio2.setDescripcion("Retiro de productos");
        servicio2.setId(2);
        Servicio.tipoServicio.add(servicio2);
        Tecnico tecnico1 = new Tecnico();
        tecnico1.setNombre("Juan");
        tecnico1.setApellido("Perez");
        tecnico1.setId(1);
        Tecnico.tecnicos.add(tecnico1);
        Tecnico tecnico2 = new Tecnico();
        tecnico2.setNombre("Tomas");
        tecnico2.setApellido("Marquez");
        tecnico2.setId(2);
        Tecnico.tecnicos.add(tecnico2);
        Tecnico tecnico3 = new Tecnico();
        tecnico3.setNombre("Mateo");
        tecnico3.setApellido("Moro");
        tecnico3.setId(3);
        Tecnico.tecnicos.add(tecnico3);


        Scanner sc = new Scanner(System.in);
        System.out.println("Desea Ingresar un nuevo cliente?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int respuesta = sc.nextInt();
        if (respuesta == 1) {

            int a = 1;

            while (a == 1) {

                Cliente cliente = new Cliente();

                System.out.println("Ingrese el nombre del cliente");
                cliente.setNombre(sc.next());

                System.out.println("Ingrese el apellido del cliente");
                cliente.setApellido(sc.next());

                System.out.println("Ingrese el cuit del cliente");
                cliente.setCuit(sc.nextInt());

                System.out.println("Ingrese el id del cliente");
                cliente.setId(sc.nextInt());

                System.out.println("Ingrese la razon social del cliente");
                cliente.setRazonSocial(sc.next());

                System.out.println("Ingrese el email del cliente");
                cliente.setEmail(sc.next());

                System.out.println("Ingrese el tipo de servicio");
                System.out.println("1. Entrega");
                System.out.println("2. Retiro");
                cliente.setIdServ(Integer.parseInt(sc.next()));
                Cliente.clientes.add(cliente);


                System.out.println("Desea Agregar otro Cliente?");
                System.out.println("1. Si");
                System.out.println("2. No");
                a = sc.nextInt();


            }
        }
            System.out.println("Desea ver un Cliente Registrado?");
            System.out.println("1. Si");
            System.out.println("2. No");
            respuesta = sc.nextInt();

            if (respuesta == 1) {
                System.out.println("Ingrese el id del cliente");
                Cliente cl = Cliente.buscaId(sc.nextInt());
                System.out.println("Nombre:" + cl.getNombre());
                System.out.println("Apellido:" + cl.getApellido());
                System.out.println("Cuit:" + cl.getCuit());
                System.out.println("Id:" + cl.getId());
                System.out.println("Razon Social:" + cl.getRazonSocial());
                System.out.println("Email:" + cl.getEmail());
                String serv;
                if (cl.getIdServ() == 1) {
                    serv = "Entrega";
                }else {
                    serv = "Retiro";
                }
                System.out.println("Servicio:" + serv);}


                System.out.println("Desea Ingresar un incidente?");
                System.out.println("1. Si");
                System.out.println("2. No");
                int in = sc.nextInt();
                if(in == 1){

                    Incidente incidente = new Incidente();
                    System.out.println("Ingrese el titulo del incidente");
                    incidente.setTitulo(sc.next());
                    System.out.println("Ingrese la descripcion del incidente");
                    incidente.setDescripcion(sc.next());
                    System.out.println("Ingrese el id del incidente");
                    incidente.setId(sc.nextInt());
                    System.out.println("Ingrese la fecha de ingreso del incidente");
                    incidente.setFechaIngreso(sc.next());
                    System.out.println("Ingrese el estado del incidente");
                    incidente.setEstado(sc.next());
                    System.out.println("ingrese fecha estimada de resolucion del insidente");
                    incidente.setFechaEstimadaResolucion(sc.next());

                    Incidente.getIncidentes().add(incidente);
                    System.out.println("Incidente Ingresado");}

                System.out.println("Desea ver si el cliente tiene incidentes?");
                System.out.println("1. Si");
                System.out.println("2. No");
                respuesta = sc.nextInt();
                if (respuesta == 1) {
                    System.out.println("Ingrese el id del cliente");
                    Cliente cl = Cliente.buscaId(sc.nextInt());
                    Incidente ins = Incidente.buscaIdCl(cl.getId());

                    if(ins == null){
                        System.out.println("No existe el incidente");
                    }else{
                        System.out.println("Titulo:" + ins.getTitulo());
                        System.out.println("Descripcion:" + ins.getDescripcion());
                        System.out.println("Id:" + ins.getId());
                        System.out.println("Fecha Ingreso: " + ins.getFechaIngreso());
                        System.out.println("Estado: "+ ins.getEstado());
                    }


                }
        System.out.println("Desea ver que tecnico tiene mas casos?");
                System.out.println("1. Si");
                System.out.println("2. No");
                respuesta = sc.nextInt();
                if (respuesta == 1) {
                    int con = Incidente.contador();
                }

            }
            }




