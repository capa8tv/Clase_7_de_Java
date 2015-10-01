
import java.util.ArrayList;
import modelos.Persona;

public class Array_de_Objeto 
{
  public static void main(String[] args) 
  {
      //recurso de tipo de objeto
      //se usa mucho para la creación de componentes personalizados en Android
      ArrayList<Persona> persona=new ArrayList();
      persona.add(new Persona("César Cancino","yo@cesarcancino.com",35));
      persona.add(new Persona("Angie Cancino","angie@cesarcancino.com",15));
      persona.add(new Persona("Camila Fuentes","camila@cesarcancino.com",16));
      persona.add(new Persona("Alexis Ñandú","maravilla@chile.com",28));
      System.out.println("el largo del array persona es "+persona.size());
      System.out.println("----------------recorro con for----------------");
      for(int i=0;i<persona.size();i++)
      {
          System.out.println("Nombre: "+persona.get(i).getNombre());
          System.out.println("E-Mail "+persona.get(i).getCorreo());
          System.out.println("Edad: "+persona.get(i).getEdad());
          System.out.println("##########################################");
      }
      System.out.println("----------------recorro con foreach----------------");
      for(Persona p: persona)
      {
          System.out.println("Nombre: "+p.getNombre());
          System.out.println("E-Mail: "+p.getCorreo());
          System.out.println("Edad: "+p.getEdad());
          System.out.println("##########################################");
      }
  }   
}
