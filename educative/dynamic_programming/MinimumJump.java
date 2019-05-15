import java.util.*;

public class MimimumJump {
	public static void main(String[] args) {
	    ArrayJump aj = new ArrayJump();
	    int[] jumps = {2, 1, 1, 1, 4};
	    System.out.println(aj.countMinJumps(jumps));
	    jumps = new int[]{1, 1, 3, 6, 9, 3, 0, 1, 3};
	    System.out.println(aj.countMinJumps(jumps));
  }
}