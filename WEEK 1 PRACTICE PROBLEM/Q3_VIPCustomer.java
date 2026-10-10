public class Q3_VIPCustomer {
    public static void main(String[] args) {
        System.out.println("Input: \"VIP-4589\" | Output: " + validateCustomerId("VIP-4589"));
        System.out.println("Input: \"CUS-4589\" | Output: " + validateCustomerId("CUS-4589"));
    }

    public static String validateCustomerId(String customerId) {
        if (customerId != null && customerId.startsWith("VIP-")) {
            return "VIP Customer";
        }
        return "Regular Customer";
    }
}