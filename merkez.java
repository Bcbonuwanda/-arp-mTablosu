
            public class merkez {

		    public static void main(String[] args) {
		       
		        	
		                int boyut = 10; // çarpım tablosunun boyutu
		                int[][] carpimTablosu = new int[boyut][boyut]; // boyut kadarlık çarpım tablosu oluşturuluyor
		                
		                // çarpım tablosu oluşturuluyor
		                for(int i=0; i<boyut; i++) {
		                    for(int j=0; j<boyut; j++) {
		                        carpimTablosu[i][j] = (i+1) * (j+1); // çarpım işlemi yapılıyor
		                    }
		                }
		                
		                // çarpım tablosu ekrana yazdırılıyor
		                for(int i=0; i<boyut; i++) {
		                    for(int j=0; j<boyut; j++) {
		                        System.out.print(carpimTablosu[i][j] + "\t"); // satır sonuna kadar yazdır
		                    }
		                    System.out.println(); // satır sonu
		                }
		            
		        }

		    }
		
            
	


