
public class ValidateBST {
	public int val;
	public ValidateBST right;
	public ValidateBST left;
	public ValidateBST(int val, ValidateBST left, ValidateBST right){
		this.val=val;
		this.right=right;
		this.left=left;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidateBST t1=new ValidateBST(1,null, null);
		ValidateBST t2=new ValidateBST(4,null,null);
		ValidateBST t3=new ValidateBST(7,null, null);
		ValidateBST t4=new ValidateBST(2,null,null);
		ValidateBST t5=new ValidateBST(5,null, null);
		ValidateBST t6=new ValidateBST(1,null,null);
		ValidateBST t7=new ValidateBST(3,null, null);
		ValidateBST t8=new ValidateBST(8,null,null);
		ValidateBST t9=new ValidateBST(9,null, null);
		ValidateBST t10=new ValidateBST(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t4.left=t6;
		t4.right=t7;
		boolean b=checkBST(t1);
		System.out.println(b);
	}
	private static boolean checkBST(ValidateBST root) {
		// TODO Auto-generated method stub
		if(root.right!=null && root.left!=null){
			int val=root.val;
			int rval=root.right.val;
			int lval=root.left.val;
			if(val>lval && val<rval){
				return checkBST(root.left)&& checkBST(root.right);
			}
			else{
				return false;
			}
		}
		return true;
	}

}
