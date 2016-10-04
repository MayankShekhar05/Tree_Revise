
public class CheckSizeDiff {
	public int val;
	public CheckSizeDiff left;
	public CheckSizeDiff right;
	public CheckSizeDiff(int val, CheckSizeDiff left, CheckSizeDiff right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckSizeDiff t1=new CheckSizeDiff(1,null, null);
		CheckSizeDiff t2=new CheckSizeDiff(2,null,null);
		CheckSizeDiff t3=new CheckSizeDiff(3,null, null);
		CheckSizeDiff t4=new CheckSizeDiff(4,null,null);
		CheckSizeDiff t5=new CheckSizeDiff(5,null, null);
		CheckSizeDiff t6=new CheckSizeDiff(6,null,null);
		CheckSizeDiff t7=new CheckSizeDiff(7,null, null);
		CheckSizeDiff t8=new CheckSizeDiff(8,null,null);
		CheckSizeDiff t9=new CheckSizeDiff(9,null, null);
		CheckSizeDiff t10=new CheckSizeDiff(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		boolean b=checkSize(t1);
		System.out.println(b);
	}
	private static boolean checkSize(CheckSizeDiff root) {
		// TODO Auto-generated method stub
		int sizeleft=size(root.left);
		int sizeright=size(root.right);
		if(Math.abs(sizeleft-sizeright)>1){
			return false;
		}
		else{
			return true;
		}
	}
	private static int size(CheckSizeDiff root) {
		// TODO Auto-generated method stub
		if(root==null){
			return 0;
		}
		//else if(root.left!=null)
		else{
			return size(root.left)+size(root.right)+1;
		}
		
	}

}
