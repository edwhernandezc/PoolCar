/**
 * 
 * @author edinfamous
 *
 */
public class PrestamoCar {
	Car carUno;
	Car carDos;
	Car carTres;
	Car carCuatro;
    
    PoolCar poolUno;
    PoolCar poolDos;
    
    public void operacion() {
        poolUno = PoolCar.getInstancia();
        poolDos = PoolCar.getInstancia();
        
        carUno = poolUno.getCar();
        System.out.println(carUno.getNumero());
        
        carDos = poolDos.getCar();
        System.out.println(carDos.getNumero());
        
        carTres = poolUno.getCar();
        System.out.println(carTres.getNumero());
        
        poolDos.liberarCar(carDos);
        
        carCuatro = poolDos.getCar();
        System.out.println(carCuatro.getNumero());
        
        
    }
}
