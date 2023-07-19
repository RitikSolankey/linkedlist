import java.util.LinkedList;
import java.util.List;

public class Linkedlisttest {

	public static void main(String[] args) {
		List<Integer> list= new LinkedList();
		list.add(10);
		list.add(12);
		list.add(14);
		
		for(Integer o:list)
		{
			System.out.println(o+1);
		}
	}

}
