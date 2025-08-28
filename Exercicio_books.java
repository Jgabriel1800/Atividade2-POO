/*O primeiro precisa ser corrigido, temos que criar o array e também instancia objetos Books dentro dele */

package src;
class Books {
	String title;
	String author;
}

class BooksTestDrive{
	public static void main(String[] args) {
		Books[] myBooks = new Books[3];
		int x = 0;
		
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();
		myBooks[0].title = "The grapes of Java";
		myBooks[1].title = "The Java gatsby";
		myBooks[2].title = "The Java Cookbook";
		myBooks[0].author = "bob";
		myBooks[1].author = "Sue";
		myBooks[2].author = "Ian";
		
		while(x<3) {
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.print(myBooks[x].author);
			System.out.println();
			x=x+1;
		}
	}
}