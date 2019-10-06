package HW;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class HWServer {

    public static void main(String[] args) {

            Socket socket = null;
            ServerSocket serverSocket = null;

            try{
                serverSocket = new ServerSocket(8189);
                System.err.println("Server is running. Waiting for connection: ");
                socket = serverSocket.accept();
                System.out.println("Client is connection.");
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                Scanner sc = new Scanner(System.in);


                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String str;
                        DataInputStream inLoc = in;
                        while (true){
                            try {
                                str = inLoc.readUTF();
                                System.out.println(str);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();

                        while (true){
                            try {
                                String strOut = sc.nextLine();
                                out.writeUTF(strOut);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }



            }catch (IOException e){
                e.printStackTrace();
            }finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }//end main
}//class