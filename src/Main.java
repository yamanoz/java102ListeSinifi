
public class Main {
    public static void main(String[] args) {
    	
    	MyList<Integer> liste = new MyList<>();
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(20);
        liste.add(50);
        liste.add(60);
        liste.add(70);

        System.out.println("Liste Durumu :"+(liste.isEmpty() ? "Boş":"Dolu"));
        
        //Buldugu ilk indeksi verir
        System.out.println("Index :"+liste.indexOf(20));
        //Bulamazsa -1 döndürür
        System.out.println("Index :"+liste.indexOf(100));
        
        //Bulduğu son index i verir
        System.out.println("Indeks :"+liste.lastIndexOf(20));
        
        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);
        
     // Liste veri türünde alt bir liste oluşturdu
        MyList<Integer> altListem = liste.sublist(0, 3);
        System.out.println(altListem.toString());
        
        
     // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));
        
     // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste.clear();
     
        System.out.println(liste.toString());
        
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	/*
        String [] array;

        MyList<Integer> list = new MyList<>();
        System.out.println("List Case : " + (list.isEmpty() ? "Empty" : "Full"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("List Case : " + (list.isEmpty() ? "Empty" : "Full"));
        System.out.println("Index : " + list.indexOf(20));
        System.out.println("Index :" + list.indexOf(100));
        System.out.println("Index : " + list.lastIndexOf(20));
        Object[] array1 = list.toArray();
        System.out.println("First index :" + array1[0]);
        MyList<Integer> subList = list.sublist(0, 3);
        System.out.println(subList.toString());
        System.out.println("20 in my list : " + list.contains(20));
        System.out.println("120 in my list : " + list.contains(120));
        list.clear();
        System.out.println(list.toString());
*/
    }
    
}
