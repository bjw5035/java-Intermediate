package src.sourceCode.session10.exception.ex1;

public class NetworkClientV1 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if(connectError) {
            System.out.println("Connect error");
            return "Connect error";
        }
        // 연결 성공
        System.out.println("Connecting");
        return "Connecting";
    }

    public String send(String data) {
        if(sendError) {
            System.out.println("Send error");
            return "Send error";
        }
        // 전송 성공
        System.out.println("Sending " + data);
        return "Sending " + data;
    }

    public void disconnect() {
        System.out.println(address + " disconnected");
    }

    public void initError(String data) {
        if(data.contains("error1")) {
            connectError = true;
        }
        if(data.contains("error2")) {
            sendError = true;
        }
    }
}
