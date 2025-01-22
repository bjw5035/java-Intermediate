package src.sourceCode.session9.exception.ex2;

public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        NetworkClientV2 client = new NetworkClientV2("http://example.com");
        client.initError(data);

        String connectResult = client.connect();
        
        // 결과가 성공이 아니다 -> 오류다
        if(!isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
            return;
        }

        client.disconnect();
    }

    public static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }

}
