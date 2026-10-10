public class P3_TheNicknameTag {

    private final String firstName;
    private final String lastName;

    public P3_TheNicknameTag(String fullName) {
        String[] parts = fullName.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }

    public String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }

    public static void main(String[] args) {
        P3_TheNicknameTag tag = new P3_TheNicknameTag("Maria Gomez");
        System.out.println(tag.getNickname());
    }
}
