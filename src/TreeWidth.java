
public class TreeWidth {
	public int val;
	public TreeWidth left;
	public TreeWidth right;
	public TreeWidth(int val,TreeWidth left, TreeWidth right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeWidth t13=new TreeWidth(13,null, null);
		TreeWidth t6=new TreeWidth(6,null, null);
		TreeWidth t4=new TreeWidth(4,null, null);
		TreeWidth t8=new TreeWidth(8,null, null);
		TreeWidth t2=new TreeWidth(2,null, null);
		TreeWidth t5=new TreeWidth(5,null, null);
		TreeWidth t7=new TreeWidth(7,null, null);
		TreeWidth t10=new TreeWidth(10,null, null);
		TreeWidth t1=new TreeWidth(1,null, null);
		TreeWidth t3=new TreeWidth(3,null, null);
		TreeWidth t9=new TreeWidth(9,null, null);
		TreeWidth t11=new TreeWidth(11,null, null);
	}

}
