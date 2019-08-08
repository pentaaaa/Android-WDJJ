package com.mycompany.buttomnavigation;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServiceTest extends Service {

    private  Thread myThread;
    public ServiceTest() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("debug","service started!");
        myThread=new Thread(new Runnable() {
            @Override
            public void run() {
//                Socket socket;
//                try {
//                    socket=new Socket("192.168.2.4",7788);
//                    String msg="client is running!";
//                    OutputStream os=socket.getOutputStream();
//                    os.write(msg.getBytes());
//                    os.flush();
//                    while (true){
//
//                        os.write(msg.getBytes());
//                        os.flush();
//                    }
//                }catch (UnknownHostException e){
//                    e.printStackTrace();
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
            }
        });
        myThread.start();
        return super.onStartCommand(intent, flags, startId);
    }

}
