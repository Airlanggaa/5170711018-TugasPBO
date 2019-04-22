package tugaspewarisan;

import java.util.Scanner;

public class TugasPewarisan {

public static void main(String[] args) {
Manusia wong = new Manusia ();
ManusiaDewasa menungsa = new ManusiaDewasa();
AnakKecil bocil = new AnakKecil();  
System.out.println("-----------MANUSIA DEWASA------------");
menungsa.bisaapa();
menungsa.jalan();
menungsa.terbang();
    System.out.println(" ");
    System.out.println("--------------ANAK KECIL---------------");
bocil.bisaapa();
bocil.jalan();
bocil.terbang();
bocil.Tingkah();
     
    }
    
}
