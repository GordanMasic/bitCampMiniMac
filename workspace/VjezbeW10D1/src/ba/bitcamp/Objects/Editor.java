package ba.bitcamp.Objects;

public class Editor extends Application {

	public static final int TEXT = 0;
	public static final int PHOTO = 1;
	public static final int VIDEO = 2;

	private int type;
	private boolean isFreeware;

	public Editor(String name, int year, String version, double size, int type,
			boolean freeware) {
		super(name, year, version, size);
		this.type = type;
		this.isFreeware = freeware;
	}

	public int getType() {
		return type;
	}

	public boolean isFreeware() {
		return isFreeware;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setFreeware(boolean isFreeware) {
		this.isFreeware = isFreeware;
	}

	@Override
	public String toString() {
		return String.format("Editor [type=%s, isFreeware=%s]", type,
				isFreeware);
	}

	
}
