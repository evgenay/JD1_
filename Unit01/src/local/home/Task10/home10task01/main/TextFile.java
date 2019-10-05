package local.home10task01.main;

public class TextFile extends File {

	private String data;

	public TextFile() {

		this.data = new String(" ");
	}

	public TextFile(String name, String data, Extension type) {
		this.data = data;

	}

	public String getData() {
		return data;
	}

	public void setData(String str) {
		this.data = data.concat(str);
	}

	public void deleteData() {
		this.data = "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TextFile [data=" + data + "]";
	}

}