package Controlador;

import Vista.Principal;
import java.time.LocalDate;
import java.time.LocalTime;
public class Hora extends Thread{
private LocalTime locatime=LocalTime.now();
private LocalDate date=LocalDate.now();
    @Override
    public void run(){
        while(true){
            // Verifica si es medianoche para actualizar la fecha
            if (locatime.equals(LocalTime.MIDNIGHT)) {
                date = date.plusDays(1);
            }
            locatime=locatime.plusSeconds(1);
            String hora=String.format("%02d", locatime.getHour());
            String minutos=String.format("%02d", locatime.getMinute());
            String segundos=String.format("%02d", locatime.getSecond());
            String fecha = date.toString();
            String clock=hora+":"+minutos+":"+segundos;   
            Principal.labelTresP.setText(fecha+" "+clock);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        
    }
}