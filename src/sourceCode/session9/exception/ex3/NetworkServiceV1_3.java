package src.sourceCode.session9.exception.ex3;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        NetworkClientV3 client = new NetworkClientV3("http://example.com");
        client.initError(data);

        String connectResult = client.connect();
        
        // 결과가 성공이 아니다 -> 오류다
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println(sendResult);
            }
        }

        client.disconnect();
    }

    public static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }

}
