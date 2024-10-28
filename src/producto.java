public abstract class producto {

    String nombre;
    String marca;
    int precio;
    int cantStock;

    public abstract int mostDetalles();

    public producto() {
    }

    public producto(String nombre, String marca, int precio, int cantStock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantStock = cantStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

}

class laptop extends producto implements vendible{

    String procesador;
    String RAM;

    public laptop() {
        this.procesador = procesador;
        this.RAM = RAM;
    }

    public laptop(String nombre, String marca, int precio, int cantStock, String procesador, String RAM) {
        super(nombre, marca, precio, cantStock);
        this.procesador = procesador;
        this.RAM = RAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "laptop{" + "procesador='" + procesador + '\'' + ", RAM='" + RAM + '\'' + ", nombre='" + nombre + '\'' + ", marca='" + marca + '\'' + ", precio=" + precio + ", cantStock=" + cantStock + '}';
    }

    @Override
    public int mostDetalles() {

        System.out.println(toString());

        return 0;
    }

    @Override
    public void calPrecioVenta(int cantidad) {

        double total = 0;

        if (cantidad<5) {
            total = cantidad * precio;
        }else {
            total = (cantidad*precio)*0.1 - precio;
        }

        System.out.println("El precio total es: " + total);

    }
}

class celular extends producto implements vendible{

    String capBateria;
    String camResolucion;

    public celular() {
        this.capBateria = capBateria;
        this.camResolucion = camResolucion;
    }

    public celular(String nombre, String marca, int precio, int cantStock, String capBateria, String camResolucion) {
        super(nombre, marca, precio, cantStock);
        this.capBateria = capBateria;
        this.camResolucion = camResolucion;
    }

    public String getCapBateria() {
        return capBateria;
    }

    public void setCapBateria(String capBateria) {
        this.capBateria = capBateria;
    }

    public String getCamResolucion() {
        return camResolucion;
    }

    public void setCamResolucion(String camResolucion) {
        this.camResolucion = camResolucion;
    }

    @Override
    public String toString() {
        return "celular{" +
                "capBateria='" + capBateria + '\'' +
                ", camResolucion='" + camResolucion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantStock=" + cantStock +
                '}';
    }

    @Override
    public int mostDetalles() {
        System.out.println(toString());
        return 0;
    }

    @Override
    public void calPrecioVenta(int cantidad) {

        double total = 0;

        if (cantidad<5) {
            total = cantidad * precio;
        }else {
            total = (cantidad*precio)*0.1 - precio;
        }

        System.out.println("El precio total es: " + total);
    }
}

