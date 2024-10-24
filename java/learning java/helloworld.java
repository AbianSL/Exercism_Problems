class hola {
  // public es para que otras clases puedan acceder al método
  // esta clase tiene un constructor por defecto
  public static void Holamundo() {  
    System.out.println("hola mundo");
  }
}

/*
tiene los mismos 
comentarios que c++
*/

// las siguientes clases están sacadas de la guía de oracle
// classes
public class Bicycle {
        
    // the Bicycle class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
        
}

// esto es una subclase de Bicycle
public class MountainBike extends Bicycle {
        
    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        // super consiste en crear el constructor de la clase "madre"
        super(startCadence, startSpeed, startGear);
        // también se puede usar this(), lo cual invoca a otro constructor
        // que este en la misma clase y que soporte el conjunto de parámetros que se pasa
        // pero no se puede usar los dos a la vez, además estos siempre tienen
        // que ir al comienzo del constructor
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   

}