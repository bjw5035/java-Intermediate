package src.sourceCode.session9.exception.ex2;

public class NetworkClientV2 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public String connect() {
        if (connectError) {
            System.out.println("Connect error");
            return "Connect error";
        }

        System.out.println("Connecting");
        return "Connecting";
    }

    public String send(String data) {
        if (sendError) {
            System.out.println("Send error");
            return "Send error";
        }
        System.out.println("Sending " + data);
        return "Sending " + data;
    }

    public void disconnect() {
        System.out.println("Disconnecting");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
