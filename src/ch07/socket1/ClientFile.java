package ch07.socket1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientFile {

    Socket socket;
    BufferedWriter bw;
    BufferedReader br;

    public ClientFile() {
        try {
            System.out.println("1. 클라이언트 소켓시작---------------");
            socket = new Socket("localhost",10000); // 해당 라인 실행시 -> 서버소켓의 accept() 메서드가 호출

            System.out.println("2. 버퍼(write)가 연결완료---------------");
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            // 키보드 연결
            System.out.println("3. 키보드 스트림 + 버퍼(read) 연결완료---------------");
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("4. 키보드 메시지 입력 대기중---------------");
            String keyboardMsg = br.readLine();
            // 메세지의 끝을 알려줘야 한다.
            bw.write(keyboardMsg+"\n");
            bw.flush();

        } catch (Exception e) {
            System.out.println("클라이언트소켓 에러 발생 : "+e.getMessage());
        }

    }

    public static void main(String[] args) {
        new ClientFile();
    }
}
