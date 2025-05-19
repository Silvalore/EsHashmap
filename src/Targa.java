import java.util.Objects;

public class Targa {
    private String numero;


    public Targa(String numero) {
        this.numero = numero;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Targa targa = (Targa) obj;
        return Objects.equals(numero, targa.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }


    @Override
    public String toString() {
        return "Targa{" + "numero='" + numero + '\'' + '}';
    }
}
