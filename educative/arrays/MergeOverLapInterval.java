class Tuple<X, Y> { 
  public X x; 
  public Y y; 

  public Tuple(X x, Y y) { 
    this.x = x; 
    this.y = y; 
  } 
}

public class MergeOverLapInterval {

	
	public static void main(String[] args) {
	    ArrayList<Tuple<Integer,Integer>> v1 = new ArrayList<Tuple<Integer,Integer>>();

	    Tuple<Integer,Integer> t1 = new Tuple<Integer,Integer>(2,10);
	    Tuple<Integer,Integer> t2 = new Tuple<Integer,Integer>(4,12);
	    Tuple<Integer,Integer> t3 = new Tuple<Integer,Integer>(13,16);
	    Tuple<Integer,Integer> t4 = new Tuple<Integer,Integer>(19,20);
	    Tuple<Integer,Integer> t5 = new Tuple<Integer,Integer>(20,24);

	    v1.add(t1);
	    v1.add(t2);
	    v1.add(t3);
	    v1.add(t4);
	    v1.add(t5);

	    ArrayList<Tuple<Integer,Integer>> v2 = merge_intervals(v1);

	    for(int i=0 ; i < v2.size() ; i++)
	    {
	      System.out.print(String.format("{%d,%d) ",v2.get(i).x,v2.get(i).y));
	    }

	    System.out.println("\n");

	    v1.clear();

	    v1.add(t1);
	    v1.add(t2);

	    v2 = merge_intervals(v1);

	    for(int i=0 ; i < v2.size() ; i++)
	    {
	      System.out.print(String.format("{%d,%d) ",v2.get(i).x,v2.get(i).y));
	    }

	    System.out.println("\n");
}
}