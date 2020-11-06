package condicionescompetencias;

import java.awt.event.ActionEvent;
import javax.swing.JTextArea;


public class Hilo extends Thread {
        private  JTextArea area;
        private RCompartido rC;
        
        Hilo(JTextArea area, RCompartido rC, int num){
            
                this.area = area;
                this.rC = rC;
                this.setName(" Perrito " + num );
        }
        
        public void run(){            
                while(true){
                        try{
                             rC.setDatoCompartido(this.getName());
                             area.append(  rC.getDatoCompartido() + "\n");
                             
                             sleep(1000);
                        }catch(Exception e){e.printStackTrace();}
                        
                }
        }
        
       
        
        
}
