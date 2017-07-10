try {
	in = new FileInputStream("file.txt");
	System.out.println("opening file");
	int data = in.read();
} catch (IOException e) {
	//if there's an error this code will be reached
	System.out.println(e.getMessage());
} finally {
	//this code will always be executed
	try {
		if(in != null) in.close();
	} catch(IOException e) {
		System.out.println("Failed to close file");
	}
}