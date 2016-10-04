
public class CheckBalanced {
	public int val;
	public CheckBalanced right;
	public CheckBalanced left;
	public CheckBalanced(int val, CheckBalanced left, CheckBalanced right){
		this.val=val;
		this.right=right;
		this.left=left;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBalanced t1=new CheckBalanced(1,null, null);
		CheckBalanced t2=new CheckBalanced(2,null,null);
		CheckBalanced t3=new CheckBalanced(3,null, null);
		CheckBalanced t4=new CheckBalanced(4,null,null);
		CheckBalanced t5=new CheckBalanced(5,null, null);
		CheckBalanced t6=new CheckBalanced(6,null,null);
		CheckBalanced t7=new CheckBalanced(7,null, null);
		CheckBalanced t8=new CheckBalanced(8,null,null);
		CheckBalanced t9=new CheckBalanced(9,null, null);
		CheckBalanced t10=new CheckBalanced(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		boolean b=checkBalan(t1);
		System.out.println(b);
	}
	private static boolean checkBalan(CheckBalanced root) {
		// TODO Auto-generated method stub
		if(root==null){
			return true;
		}
		int heightDiff=height(root.left)-height(root.right);
		if(Math.abs(heightDiff)>1){
			return false;
		}
		return checkBalan(root.left)&&checkBalan(root.right);
	}
	private static int height(CheckBalanced root) {
		// TODO Auto-generated method stub
		if(root==null){
			return 0;
		}
		return Math.max(height(root.left),height(root.right))+1;
	}

}
