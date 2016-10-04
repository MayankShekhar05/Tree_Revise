import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ListofDepth {
	public int val;
	public ListofDepth left;
	public ListofDepth right;
	public ListofDepth(int val, ListofDepth left, ListofDepth right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListofDepth t1=new ListofDepth(1,null, null);
		ListofDepth t2=new ListofDepth(2,null,null);
		ListofDepth t3=new ListofDepth(3,null, null);
		ListofDepth t4=new ListofDepth(4,null,null);
		ListofDepth t5=new ListofDepth(5,null, null);
		ListofDepth t6=new ListofDepth(6,null,null);
		ListofDepth t7=new ListofDepth(7,null, null);
		ListofDepth t8=new ListofDepth(8,null,null);
		ListofDepth t9=new ListofDepth(9,null, null);
		ListofDepth t10=new ListofDepth(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		ArrayList<Queue<ListofDepth>> arrlists=new ArrayList<Queue<ListofDepth>>();
		
		createLevelLinkedList(t1,arrlists,0);
	}
	private static void createLevelLinkedList(ListofDepth root, ArrayList<Queue<ListofDepth>> arrlists, int level) {
		// TODO Auto-generated method stub
		if(root==null){
			return;
		}
		Queue<ListofDepth>list=new LinkedList<ListofDepth>();
		if(arrlists.size()==level){
			arrlists.add(list);
		}
		else{
			list=arrlists.get(level);
		}
		list.add(root);
		createLevelLinkedList(root.left,arrlists,level+1);
		createLevelLinkedList(root.right,arrlists,level+1);
	}


}
