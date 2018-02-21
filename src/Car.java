/**
 * 
 * @author edinfamous
 *
 */
public class Car {
    private int numero;
    private boolean disponible;
    
    public Car(int n){
        numero = n;
        disponible = true;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

