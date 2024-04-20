import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal(){
        int opc;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("\n----Menu principal--- \n1. Agregar producto \n2. Modificar precio de producto \n3. Ver articulos disponibles \n0. Salir \nIngresa tu opcion: ");
                opc = sc.nextInt();
                sc.nextLine();

                if(opc == 0){
                    break;
                }

                switch(opc){
                    case 1:
                        agregarProducto();
                        break;
                    case 2:
                        modificarPrecio();
                        break;
                    case 3:
                        verArticulosDisponibles();
                        break;
                }

            } catch(InputMismatchException e) {
                System.out.println("Ingrese un dato vaido");
                sc.nextLine();
            }
        }while(true);
    }

    private static void agregarProducto(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        String modelo;
        String descripcion;
        float precio;
        char tipoProducto;

        System.out.println("Ingresa el nombre del producto: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa el modelo del producto: ");
        modelo = sc.nextLine();
        System.out.println("Ingresa la descripcion del producto: ");
        descripcion = sc.nextLine();
        System.out.println("Ingresa el precio del producto: ");
        precio = sc.nextFloat();
        sc.nextLine();
        System.out.println("Ingresa el tipo de producto (l si es laptop/t si es telefono): ");
        tipoProducto = sc.nextLine().charAt(0);

        if (tipoProducto == 'l'){
            Producto producto = new Laptop(nombre, modelo, descripcion, precio, tipoProducto);
            listaProductos.add(producto);
        } else {
            Producto producto = new Telefono(nombre, modelo, descripcion, precio, tipoProducto);
            listaProductos.add(producto);
        }
        System.out.println("Producto agregado correctamente");
    }

    public static void verArticulosDisponibles(){
        System.out.println("\n\t\tMostrando lista de productos disponibles");
        for (int i = 0; i < listaProductos.size(); i++){
            Producto pTemp = listaProductos.get(i);
            System.out.println("\n\t\tProducto " + (i+1)
                    + "\nNombre: " + pTemp.getNombre()
                    + "\nModelo: " + pTemp.getModelo()
                    + "\nDescripcion: " + pTemp.getDescripcion()
                    + "\nPrecio: " + pTemp.getPrecio());
            if (pTemp.getTipoProducto() == 'l'){
                System.out.println("Tipo de producto: Laptop");
            }else{
                System.out.println("Tipo de producto: Telefono");
            }
        }
    }

    public static void modificarPrecio(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        float nuevoPrecio;
        System.out.println("Ingresa el nombre del producto que quieres cambiar el precio\n");
        nombre = sc.nextLine();
        for (Producto listaProducto : listaProductos) {
            if (listaProducto.getNombre().equals(nombre)) {
                System.out.println("Nombre de producto a modificar precio: " + listaProducto.getNombre());
                System.out.println("El precio actual de este producto es: " + listaProducto.getPrecio() + "\nEscribe el nuevo precio para este producto\n");
                nuevoPrecio = sc.nextFloat();
                listaProducto.setPrecio(nuevoPrecio);
                System.out.println("Precio de " + listaProducto.getNombre() + " actualizado correctamente");
            }
            break;
        }
    }

}