// Input Streams:
// Input streams are used for reading data from an external source.
// In Java, the most common input streams are FileInputStream, BufferedInputStream, and DataInputStream. 
// Here is an example of how to use these streams:

try {
    // Create a new FileInputStream to read a file
    FileInputStream fis = new FileInputStream("myfile.txt");

    // Create a new BufferedInputStream for better performance
    BufferedInputStream bis = new BufferedInputStream(fis);

    // Create a new DataInputStream to read primitive data types
    DataInputStream dis = new DataInputStream(bis);

    // Read data from the file
    String line = dis.readLine();
    int number = dis.readInt();
    double decimal = dis.readDouble();

    // Close the streams
    dis.close();
    bis.close();
    fis.close();
} catch (IOException e) {
    e.printStackTrace();
}



// Output Streams:
// Output streams are used for writing data to an external source. 
// In Java, the most common output streams are FileOutputStream, BufferedOutputStream, and DataOutputStream. 
// Here is an example of how to use these streams:

try {
    // Create a new FileOutputStream to write to a file
    FileOutputStream fos = new FileOutputStream("myfile.txt");

    // Create a new BufferedOutputStream for better performance
    BufferedOutputStream bos = new BufferedOutputStream(fos);

    // Create a new DataOutputStream to write primitive data types
    DataOutputStream dos = new DataOutputStream(bos);

    // Write data to the file
    dos.writeBytes("Hello, world!");
    dos.writeInt(42);
    dos.writeDouble(3.14);

    // Close the streams
    dos.close();
    bos.close();
    fos.close();
} catch (IOException e) {
    e.printStackTrace();
}
