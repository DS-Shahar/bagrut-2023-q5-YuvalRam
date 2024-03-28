
public class OrderedList {

	private Node<NumCount> lst;

	public void insertNum(int x) {
		Node<NumCount> p = lst;
		boolean a = false;
		while(p!=null){
			if(p.getValue().getNum()==x){
				p.getValue().setCount()(p.getValue().getCount()+1);
				a = true;
			}
			p = p.getNext();
		}
		p = new Node<NumCount>(null);
		p = p.setNext(lst);
		if(lst==null)
			lst = new Node<NumCount>(x,1);
		else if(a==false){
			while(p!=null){
				if(p.getNext().getNum()>x&&a==false){
					Node<NumCount> p1 = new Node<NumCount>(x,1);
					p1.setNext(p.getnext());
					p.setNext(p1);
					a==true;
				}
				p = p.getNext();
			}
		}
		System.out.println("insert " + x);
	}

	public int valueN(int n) {
		int c = 0;
		Node<NumCount> p = lst;
		while(p!=null){
			c+=p.getValue().getCount();
			if(c>=n)
				return p.getValue().getNum();
			p = p.getNext();
		}
		return -1;
	}

	public void removeNum(int x) {
		Node<NumCount> p = lst;
		while(p!=null){
			if(p.getValue().getNum()==x){
				p.set
		}
		System.out.println("remove " + x);
	}
}
