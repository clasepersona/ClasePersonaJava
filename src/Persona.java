/**
 * clase Persona que definira todos los atributos que 
 * necesita  para ser una persona
 * @author nacho
 *
 */
public class Persona
{
	/** nombre de la persona */
  private String nombre;
  /** numero entero que representa la edad */
  private int edad;
  
  /**
   * constructor que nos permitira crear objetos de la clase persona,
   * y darle valores a los atributos
   */
  public Persona() 
  {
    nombre = " ";
    edad=0;
  }
  
  /** delvolvera el nombre de la persona */
  public String GetNombre()
  {
    return this.nombre;
  }
  
  /** devolvera la edad de la persona */
  public int GetEdad()
  {
    return this.edad;
  }
  
  /** permite modificar el nombre de la persona */
  public void setNombre(String nom)
  {
    this.nombre=nom;
  }
  
  /**  permite modificar la edad de la persona*/
  public void setEdad(int eda)
  {
    this.edad=eda;
  }
  
  /** metodo que realizara la accion de presentarse, detallando todos los atributos */
  public void presentarse()
  {
    System.out.println("Hola, mi nombre es "+this.nombre+" y tengo "+this.edad+" años.");
  }
}