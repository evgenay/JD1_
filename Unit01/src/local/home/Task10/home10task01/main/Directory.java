package local.home10task01.main;

import java.util.ArrayList;
import java.util.List;

public class Directory {
	private String name;
	private List<File> directory;
	private List<Directory> subDirectory;

	public Directory() {

		this.name = " ";
		this.directory = new ArrayList<File>();
		this.subDirectory = new ArrayList<Directory>();

	}

	public Directory(String name, List<File> directory, List<Directory> subDirectory) {
		super();
		this.name = name;
		this.directory = directory;
		this.subDirectory = subDirectory;
	}

	public String getName() {
		return name;
	}

	public List<File> getDirectory() {
		return directory;
	}

	public List<Directory> getSubDirectory() {
		return subDirectory;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDirectory(List<File> directory) {
		this.directory = directory;
	}

	public void setSubDirectory(List<Directory> subDirectory) {
		this.subDirectory = subDirectory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directory == null) ? 0 : directory.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((subDirectory == null) ? 0 : subDirectory.hashCode());
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
		Directory other = (Directory) obj;
		if (directory == null) {
			if (other.directory != null)
				return false;
		} else if (!directory.equals(other.directory))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (subDirectory == null) {
			if (other.subDirectory != null)
				return false;
		} else if (!subDirectory.equals(other.subDirectory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directory [name=" + name + ", directory=" + directory + ", subDirectory=" + subDirectory + "]";
	}

}
