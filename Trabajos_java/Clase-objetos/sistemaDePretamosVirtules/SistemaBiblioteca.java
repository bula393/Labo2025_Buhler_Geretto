package sistemaDePretamosVirtules;

import java.util.HashSet;

public class SistemaBiblioteca {
    private HashSet<Publicacion> publicaciones;
    private HashSet<PrestamoInterface> publicacionesDispParaPrestamo;
    private HashSet<Prestamo> prestamos;

    public SistemaBiblioteca(HashSet<Publicacion> publicaciones, HashSet<PrestamoInterface> publicacionesDispParaPrestamo, HashSet<Prestamo> prestamos) {
        this.publicaciones = publicaciones;
        this.publicacionesDispParaPrestamo = publicacionesDispParaPrestamo;
        this.prestamos = prestamos;
    }

    public HashSet<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(HashSet<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public HashSet<PrestamoInterface> getPublicacionesDispParaPrestamo() {
        return publicacionesDispParaPrestamo;
    }

    public void setPublicacionesDispParaPrestamo(HashSet<PrestamoInterface> publicacionesDispParaPrestamo) {
        this.publicacionesDispParaPrestamo = publicacionesDispParaPrestamo;
    }

    public HashSet<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(HashSet<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    public void devolverPrestamo(Prestamo prestamo,Usuario usuario){
        this.publicacionesDispParaPrestamo.add(prestamo.getArticulo());
        if (prestamo.validarPrestamo()){
            usuario.restaCredito(prestamo.getArticulo().calculoMulta());
            throw new ErrorPrestamoFueraFecha(usuario);
        }
    }
    public void motorBusqueda(Publicacion publicacion){
        if (publicaciones.contains(publicacion)) {
            System.out.println("el articulo esta en el sistema");
            if (publicacionesDispParaPrestamo.contains(publicacion)) {
                System.out.println("Si quiere tómelo prestado");
            }
        }
        else {
            throw new ErrorLibroNoEncontrado();

    }
    }
    public void darPrestamo(Publicacion publicacion){
        if ( !(publicacion instanceof PrestamoInterface)){
            throw new ErrorArticuloNoPrestable();
        } else if (!publicacionesDispParaPrestamo.contains(publicacion)) {
            throw new ErrorNoHayStock();
        }
        System.out.println("Esta pa disponible para ser prestado");
    }
    public void agregarPrestamo(PrestamoInterface articulo,Usuario usuario){
        prestamos.add(articulo.darPrestamo(usuario.getNumeroSocio()));
        System.out.println("prestamo añadidp correctamente");
    }
    public void
}
