package model;

import java.util.TimerTask;

public class Timer extends Thread{
    private int minutos;
    private  int segundos=0;
    private boolean parar= false;
    @Override
    public void run() {
            java.util.Timer t1 = new java.util.Timer();
            t1.schedule(new TimerTask() {
                @Override
                public void run() {
                    if(minutos>=0){
                        if(segundos>0){
                            segundos-=1;
                        }
                        else{
                            segundos=59;
                            minutos-=1;
                        }
                    }
                    if(minutos==0 && segundos==0){
                        parar=true;
                        cancel();
                    }
                    System.out.println(minutos+":"+segundos);
                }
            },1000,1000);
    }
    public void setMinutos(int minutos){
        this.minutos=minutos;
    }

    public boolean getParar() {
        return parar;
    }
}
