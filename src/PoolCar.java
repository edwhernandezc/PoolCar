/**
 * 
 * @author edinfamous
 *
 */
public class PoolCar {
	private static PoolCar instancia;
	private Car[] carros;
	
	
	public PoolCar() {
		carros = new Car[3];
		for(int i=0; i<3; i++)
            carros[i] = new Car(i);
	}
	
	public static PoolCar getInstancia(){
        if(instancia == null)
            instancia = new PoolCar();
        return instancia;
    }
    
    public Car getCar(){
        for(int i=0; i<3; i++)
            if(carros[i].isDisponible()){
                System.out.println("asignando cajero "+carros[i].getNumero());
                carros[i].setDisponible(false);
                return carros[i];
            }
                
        return null;
    }
    
    public void liberarCar(Car c){
        System.out.println("liberando cajero "+c.getNumero());
        c.setDisponible(true);
    }
	
}
