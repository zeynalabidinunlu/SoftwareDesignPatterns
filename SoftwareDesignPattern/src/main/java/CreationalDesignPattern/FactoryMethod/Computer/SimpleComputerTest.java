package CreationalDesignPattern.FactoryMethod.Computer;

public class SimpleComputerTest {
    
    public static void main(String[] args) {
        System.out.println("🧪 Computer Factory Test Başlıyor...\n");
        
        // Test 1: PC oluşturma
        testPC();
        
        // Test 2: Server oluşturma  
        testServer();
        
        // Test 3: Geçersiz tip
        testInvalidType();
        
        // Test 4: Case insensitive
        testCaseInsensitive();
        
        System.out.println("✅ Tüm testler tamamlandı!");
    }
    
    private static void testPC() {
        System.out.println("📝 Test 1: PC Oluşturma");
        Computer pc = ComputerFactory.getComputer("PC", "16GB", "1TB", "Intel i7");
        
        if (pc != null && pc instanceof PC) {
            System.out.println("✅ BAŞARILI: " + pc.toString());
            System.out.println("   Tip: " + pc.getClass().getSimpleName());
            System.out.println("   RAM: " + pc.getRAM());
            System.out.println("   HDD: " + pc.getHDD());
            System.out.println("   CPU: " + pc.getCPU());
        } else {
            System.out.println("❌ BAŞARISIZ: PC oluşturulamadı");
        }
        System.out.println();
    }
    
    private static void testServer() {
        System.out.println("📝 Test 2: Server Oluşturma");
        Computer server = ComputerFactory.getComputer("Server", "32GB", "2TB", "Intel Xeon");
        
        if (server != null && server instanceof Server) {
            System.out.println("✅ BAŞARILI: " + server.toString());
            System.out.println("   Tip: " + server.getClass().getSimpleName());
        } else {
            System.out.println("❌ BAŞARISIZ: Server oluşturulamadı");
        }
        System.out.println();
    }
    
    private static void testInvalidType() {
        System.out.println("📝 Test 3: Geçersiz Tip");
        Computer invalid = ComputerFactory.getComputer("Laptop", "16GB", "1TB", "Intel i5");
        
        if (invalid == null) {
            System.out.println("✅ BAŞARILI: Geçersiz tip için null döndü");
        } else {
            System.out.println("❌ BAŞARISIZ: Null dönmesi gerekirdi, ama dönen: " + invalid.getClass().getSimpleName());
        }
        System.out.println();
    }
    
    private static void testCaseInsensitive() {
        System.out.println("📝 Test 4: Büyük/Küçük Harf Duyarsızlığı");
        Computer pc1 = ComputerFactory.getComputer("pc", "8GB", "500GB", "AMD Ryzen");
        Computer server1 = ComputerFactory.getComputer("SERVER", "64GB", "4TB", "Intel Xeon Gold");
        
        boolean pcTest = (pc1 != null && pc1 instanceof PC);
        boolean serverTest = (server1 != null && server1 instanceof Server);
        
        if (pcTest && serverTest) {
            System.out.println("✅ BAŞARILI: Case insensitive çalışıyor");
            System.out.println("   'pc' (küçük): " + pc1.toString());
            System.out.println("   'SERVER' (büyük): " + server1.toString());
        } else {
            System.out.println("❌ BAŞARISIZ: Case insensitive çalışmıyor");
            if (!pcTest) System.out.println("   'pc' problemi: " + (pc1 == null ? "null" : pc1.getClass().getSimpleName()));
            if (!serverTest) System.out.println("   'SERVER' problemi: " + (server1 == null ? "null" : server1.getClass().getSimpleName()));
        }
        System.out.println();
    }
    
    // Bonus: Detaylı Factory Test
    private static void detailedFactoryTest() {
        System.out.println("🔍 Detaylı Factory Test:");
        
        String[][] testCases = {
            {"PC", "8GB", "500GB", "Intel i5"},
            {"pc", "16GB", "1TB", "Intel i7"},
            {"Server", "32GB", "2TB", "Intel Xeon"},
            {"server", "64GB", "4TB", "AMD EPYC"},
            {"Laptop", "16GB", "1TB", "Intel i7"}, // Invalid
            {"", "8GB", "500GB", "Intel i5"}, // Invalid
            {null, "16GB", "1TB", "Intel i7"} // Invalid
        };
        
        for (int i = 0; i < testCases.length; i++) {
            String[] testCase = testCases[i];
            System.out.println("Test " + (i+1) + ": Type='" + testCase[0] + "'");
            
            try {
                Computer computer = ComputerFactory.getComputer(testCase[0], testCase[1], testCase[2], testCase[3]);
                if (computer != null) {
                    System.out.println("  ✅ " + computer.getClass().getSimpleName() + " oluşturuldu: " + computer.toString());
                } else {
                    System.out.println("  ⚠️  null döndü (beklenen davranış geçersiz tipler için)");
                }
            } catch (Exception e) {
                System.out.println("  ❌ Hata: " + e.getMessage());
            }
            System.out.println();
        }
    }
}