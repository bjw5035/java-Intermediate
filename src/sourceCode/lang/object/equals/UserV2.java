package src.sourceCode.lang.object.equals;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        UserV2 user2 = (UserV2) obj;  // �ٿ�ĳ�������� ����
        boolean result = id.equals(user2.id);
        return result;
    }


//    @Override
//    public boolean equals(Object object) {
//        if (object == null || getClass() != object.getClass()) {
//            return false;
//        }
//        UserV2 userV2 = (UserV2) object;
//        return Objects.equals(id, userV2.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }

}
