public class Test_point
{
public static void main (String [] args)
{
point p1;
p1 = new point (3, 5);
point p2 = new point ("a");
point p3 = new point ("b", 3,5);
System.out.println("\n ---------------------------\n");
System.out.println("les points créés sont :");
p1.Affiche ();
p2.Affiche ();
p3.Affiche ();
System.out.println("\n ---------------------------\n");
if (p1.coincide(p3) == true)
System.out.println("Les 2 points p1 et p3 coïncident");
else
System.out.println("Les 2 points ne coïncident pas");
System.out.println("\n ---------------------------\n");
System.out.println("translation des point ");
p1.TranslHoriz (4);
p2.TranslVert (3);
p3.Translation (5,2);
p1.Affiche ();
p2.Affiche ();
p3.Affiche ();
System.out.println("\n ---------------------------\n");
System.out.println("modification des attributs des points") ;
p1.setNom("SRI21");
p2.setAbscisse(25);
p3.setOrdonnée(50);
p1.Affiche ();
p2.Affiche ();
p3.Affiche ();
System.out.println("\n ---------------------------\n");
System.out.println("utilisation des méthodes get");
String x=p1.getNom();
int y=p1.getAbscisse();
int z=p1.getOrdonnée();
System.out.println(" le nom du point p1 est : " + x);
System.out.println(" son abscisse est : " + y);
System.out.println(" son ordonnée est : " + z);
}
}