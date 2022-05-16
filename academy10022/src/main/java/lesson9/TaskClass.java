package lesson9;

public class TaskClass<T extends Comparable<String>, V extends Animal & Serializable, K extends Number> {
	private T variableT;
	private V variableV;
	private K variableK;

	public TaskClass() {
		super();
	}

	public TaskClass(T variableT, V variableV, K variableK) {
		super();
		this.variableT = variableT;
		this.variableV = variableV;
		this.variableK = variableK;
	}

	public T getVariableT() {
		return variableT;
	}

	public void setVariableT(T variableT) {
		this.variableT = variableT;
	}

	public V getVariableV() {
		return variableV;
	}

	public void setVariableV(V variableV) {
		this.variableV = variableV;
	}

	public K getVariableK() {
		return variableK;
	}

	public void setVariableK(K variableK) {
		this.variableK = variableK;
	}

	public String getKName() {
		if (variableK == null) {
			return null;
		}
		return variableK.getClass().getName();
	}

	public String getTName() {
		if (variableT == null) {
			return null;
		}
		return variableT.getClass().getName();
	}

	public static String getName(Object o) {
		if (o == null) {
			return null;
		}
		return o.getClass().getName();
	}

	public String getVName() {
		if (variableV == null) {
			return null;
		}
		return variableV.getClass().getName();
	}

	public static void main(String... args) {
		TaskClass<String,Cat, Integer> demo = new TaskClass<>("sdgsd", new Cat(), 45645);
		System.out.println(demo.getKName());
		System.out.println(demo.getTName());
		System.out.println(demo.getVName());
	}

}

