import java.util.Iterator;
import java.util.LinkedList;


public class HelloWorld {
	

	

	public static class PointS{
		
		private short x;
		private short y;
		private int privateVal = 0;
		

		public PointS(int x, int y) {
			super();
			this.x = (short)x;
			this.y = (short)y;
		}
		
		
		
		@Override
		public String toString() {
			return "PointS [x=" + x + ", y=" + y + "]";
			
		}



		public short getX() {
			return x;
		}
		public void setX(short x) {
			this.x = x;
		}
		public short getY() {
			return y;
		}
		public void setY(short y) {
			this.y = y;
		}
		
	}
	public static class MyPath implements Iterable<PointS>{
		
		
		
		private LinkedList<PointS> points = new LinkedList<PointS>();
		
		

		@Override
		public String toString() {
			return "MyPath [points=" + points + "]";
		}



		@Override
		public Iterator<PointS> iterator() {

			Iterator<PointS> it = new Iterator<PointS>(){

				Iterator<PointS> it = points.iterator();
				@Override
				public boolean hasNext() {
					
					return it.hasNext();
				}

				@Override
				public PointS next() {
					
					return it.next();
				}

					
				@Override
				public void remove() {
					it.remove();
				
				}
				
			};
			
			return it;
		}



		public void add(int x, int y) {
			
			points.add(new PointS(x,y));
		}
		
		
	}


//thief
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ho is here ???");
		
		HelloWorld h = new HelloWorld();
		
		someClass var = new someClass();
		
		var.setX(5);

		System.out.println(var.getReadOnlyX());
		
		
	}


	@Override
	public String toString() {
		return "HelloWorld []";
	}

}
