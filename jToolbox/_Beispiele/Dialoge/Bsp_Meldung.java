
/**
 * Beschreiben Sie hier die Klasse Bsp_Meldung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bsp_Meldung
{
    Dlg_Meldung dlg ;
    
    /**
     * Konstruktor f�r Objekte der Klasse Bsp_Meldung
     */
    public Bsp_Meldung(){
       dlg = new Dlg_Meldung();
       dlg.setzeTitel("Meldungstitel");
       dlg.setzeMeldungstext("Warnung! best�tigen mit Taste");
       dlg.icon_warnug(); // Icon 
    }


    public void melden(){
       dlg.zeigeMeldung();
    }


}
