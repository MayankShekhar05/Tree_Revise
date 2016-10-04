
public class TreePath {
	public static int array[]=new int[1000];
	public int val;
	public TreePath left;
	public TreePath right;
	public TreePath(int val, TreePath left, TreePath right){
		this.val=val;
		this.right=right;
		this.left=left;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreePath t1=new TreePath(1,null, null);
		TreePath t2=new TreePath(2,null,null);
		TreePath t3=new TreePath(3,null, null);
		TreePath t4=new TreePath(4,null,null);
		TreePath t5=new TreePath(5,null, null);
		TreePath t6=new TreePath(6,null,null);
		TreePath t7=new TreePath(7,null, null);
		TreePath t8=new TreePath(8,null,null);
		TreePath t9=new TreePath(9,null, null);
		TreePath t10=new TreePath(10,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		
		findPath(t1,array, 0);
	}
	private static void findPath(TreePath root, int[] arr, int i) {
		// TODO Auto-generated method stub
		if(root!=null){
			arr[i++]=root.val;
			if(root.left==null && root.right==null){
				printPath(arr, i);
			}
			findPath(root.left,arr,i);
			findPath(root.right,arr,i);
		}
	}
	private static void printPath(int[] arr, int index) {
		// TODO Auto-generated method stub
		for(int i=0;i<index;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}

}

