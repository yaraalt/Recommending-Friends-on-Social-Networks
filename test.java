public class test

{ private static void testPQK() 
{     System.out.println("-------------------");
		PQK<Integer, String> pq = new PQKImp<Integer, String>(3);
		pq.enqueue(3, "B");
      pq.enqueue(5, "A");
		pq.enqueue(2, "C");
		pq.enqueue(1, "D");
		pq.enqueue(2, "E");
		pq.enqueue(4, "F");
		pq.enqueue(6, "G");
		pq.enqueue(7, "H");
		pq.enqueue(8, "I");
		pq.enqueue(8, "J");
		pq.enqueue(7, "K");
		pq.enqueue(6, "L");
		pq.enqueue(5, "M");
		
      while (pq.length() > 0) 
      {  Pair<Integer, String> p = pq.serve();
			System.out.println(p.first + "\t" + p.second); }
		
      System.out.println("-------------------"); }
   
   
   
   private static void testMap() 
   {  System.out.println("-------------------");
		Map<Integer, Integer> m = new BSTMap<Integer, Integer>();
		
      for (int i = 100; i > 0; i--) 
      {  m.insert(i % 13, i); }
      
		List<Integer> l = m.getKeys();
		l.findFirst();
      
		while (true) 
      {  int k = l.retrieve();
			System.out.println(k);
			
         if (l.last()) 
         {  break; } 
         else 
         {  l.findNext(); } }
		
      System.out.println("-------------------"); }



public static void main(String[] args) 
{     testPQK();
      testMap(); } }