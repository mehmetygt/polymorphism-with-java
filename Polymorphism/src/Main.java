
class Hayvan{
  private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
    return "hayvan konuşuyor..";}
}

class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" miyavlıyor"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" havlıyor"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
class At extends  Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" kişniyor"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
public class Main {
    
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());}
    
    public static void main(String[] args) {
        Hayvan hayvan=new Hayvan("HAYVAN");
        Hayvan hayvan1=new Kedi("tekir");
        Hayvan hayvan2=new Kopek("karabaş");
        Hayvan hayvan3=new At("şahbatur");
        
        System.out.println(hayvan.konus());
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());
        
        System.out.println("***************");
        // şu kullanım da poliorphisme uygun ve daha rahat
        
        konustur(hayvan);
        konustur(hayvan1);
        konustur(hayvan2);
        konustur(hayvan3);
        
        
    }
  
    
}
