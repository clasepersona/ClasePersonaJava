public class Persona
{
  private String nombre;
  private int edad;
  
  public Persona() 
  {
    nombre = " ";
    edad=0;
  }
  
  public String GetNombre()
  {
    return this.nombre;
  }
  
  public int GetEdad()
  {
    return this.edad;
  }
  
  public void setNombre(String nom)
  {
    this.nombre=nom;
  }
  
  public void setEdad(int eda)
  {
    this.edad=eda;
  }
  
  public void presentarse()
  {
    System.out.println("Hola, mi nombre es "+this.nombre+" y tengo "+this.edad+" años.");
  }
}