import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	public int val;
	public LevelOrderTraversal left;
	public LevelOrderTraversal right;
	public LevelOrderTraversal(int val, LevelOrderTraversal left, LevelOrderTraversal right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrderTraversal t1=new LevelOrderTraversal(1,null, null);
		LevelOrderTraversal t2=new LevelOrderTraversal(2,null,null);
		LevelOrderTraversal t3=new LevelOrderTraversal(3,null, null);
		LevelOrderTraversal t4=new LevelOrderTraversal(4,null,null);
		LevelOrderTraversal t5=new LevelOrderTraversal(5,null, null);
		LevelOrderTraversal t6=new LevelOrderTraversal(6,null,null);
		LevelOrderTraversal t7=new LevelOrderTraversal(7,null, null);
		LevelOrderTraversal t8=new LevelOrderTraversal(8,null,null);
		LevelOrderTraversal t9=new LevelOrderTraversal(9,null, null);
		LevelOrderTraversal t10=new LevelOrderTraversal(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		Queue<LevelOrderTraversal>queue=new LinkedList<LevelOrderTraversal>();
		queue.add(t1);
		while(!queue.isEmpty()){
			LevelOrderTraversal temp=queue.poll();
			System.out.println(temp.val);
			if(temp.left!=null){
				queue.add(temp.left);
			}
			if(temp.right!=null){
				queue.add(temp.right);
			}
		}
	}

}
