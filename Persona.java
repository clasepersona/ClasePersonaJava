public class Persona
{
  private String nombre;
  private Int edad;
  
  public Persona() 
  {
    nombre = " ";
    edad=0;
  }
  
  public void GetNombre()
  {
    return this.nombre;
  }
  
  public void GetEdad()
  {
    return this.edad;
  }
  
  public void setNombre(String nom)
  {
    this.nombre=nom;
  }
  
  public void setEdad(Int eda)
  {
    this.edad=eda;
  }
  
  public void presentarse()
  {
    system.out.println("Hola, mi nombre es "+this.nombre+" y tengo "+this.edad+" años.")
  }
