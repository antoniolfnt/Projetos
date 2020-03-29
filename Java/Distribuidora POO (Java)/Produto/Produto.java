package Produto;

public class Produto {
		private int id;
		private String nome;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Produto() {
			super();
			this.nome = "";
		}
		public Produto(String nome) {
			super();
			this.setNome(nome);
		}
		public Produto(int id, String nome) {
			super();
			this.setNome(nome);
			this.setId(id);
		}
		public Produto(String nome, int id) {
			super();
			this.setNome(nome);
			
		}
		public int size() {
			
			return 0;
		}
		public Produto get(int i) {
			
			return null;
		}
		public void remove(int i) {
			
			
		}
		public int setId() {
			// TODO Auto-generated method stub
			return 0;
		}
	}


