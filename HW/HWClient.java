package HW;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

class HWClient {

    public static boolean step = true;

    public static void main(String[] args) {

        Socket socket = null;

        try {
            socket = new Socket("localhost", 8189);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            System.err.println("start client:");

            new Thread(new Runnable() {
                @Override
                public void run() {
                    DataOutputStream outLoc = out;
                    Scanner sc = new Scanner(System.in);

                    try {
                        while (true) {
                            String str = sc.nextLine();
                            outLoc.writeUTF(str);
                            }
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }).start();

            String strOut;

            try {
                while (socket.isConnected()){
                    strOut = in.readUTF();
                    System.out.println(strOut);
                }
            }catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }//finally
    }//main
} //end class
