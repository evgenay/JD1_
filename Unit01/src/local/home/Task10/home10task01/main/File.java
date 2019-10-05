package local.home10task01.main;

public class File {

	private String name;
	private Extension type;

	public File() {

		this.name = new String("File01");
		this.type = Extension.NULL;
	}

	public File(String name, Extension type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public Extension getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(Extension type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		File other = (File) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "File [name=" + name + ", type=" + type + "]";
	}

}