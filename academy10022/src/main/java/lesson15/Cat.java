package lesson15;

import java.io.Serializable;

public class Cat implements Serializable {

		private static final long serialVersionUID = 1L;

		private String name;
		private transient String age;

		public Cat(String name, String age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getLogin() {
			return name;
		}

		public void setLogin(String name) {
			this.name = name;
		}

		public String getPassword() {
			return age;
		}

		public void setPassword(String age) {
			this.age = age;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
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
			Cat other = (Cat) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("User [login=");
			builder.append(name);
			builder.append(", password=");
			builder.append(age);
			builder.append("]");
			return builder.toString();
		}

	}

