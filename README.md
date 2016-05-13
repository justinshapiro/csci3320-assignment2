PA2 Writeup

————————————



A.
I believe I have completed everything in this assignment. The program is a polished Graphical User Interface that takes user input from the left and computes its length and MD5 hash on the right with the press of a button. I tried to mimic the instructor’s version of the program, as I needed something to work towards. This was my first Swing program, so I tried to keep it basic to avoid overwhelming myself and not completing the assignment. However, if more time was granted, I would have learned a lot more Swing and made a ultra nice GUI for this. Nevertheless, the SwingMD5.java turned in meets all the requirements specified.



B. 
The following is a list of Java Swing objects I used. Instead of importing each construct, I simply did import javax.swing.*

1. JFrame: Needed to create the GUI frame that display’s on user’s screen. All Swing programs probably need this.


2. JPanel: Needed to store the program’s text boxes and other features. Without a JPanel, a JFrame isn’t interesting.


3. JTextArea: Needed to retrieve user input in the form of a String. 

4. JButton: Needed to have button on the JPanel that makes the program interactive.
	
	a. ActionListener: added to the JButton object in order for a command to execute when the button is pressed.


5. JList: Needed to display the results of the hash.
	
	a. DefaultListModel: A necessity for working with JLists. This allows the list to be dynamically updated. Sure, you can pass a String into the JList initialization, but you wouldn’t be able to update the String’s contents as the program runs, or it would be difficult to. DefaultListModel makes life easier when working with JLists.



C. 
The basic difference between this Java program and the “Mode A” Java program from PA1, is that this Java program contains a GUI, which allows the user to interact with a graphical interface and make commands via mouse clicks instead of console arguments or text input. As a consequence of this luxury, this Java program was much harder to write than the previous Java program. This was mainly due to the fact that I did not know Java Swing before I started doing this. After trying to learn about it online, I found myself lost in a powerful library of overwhelming size. It appears that you can program some very complex GUIs using Java Swing. I was caught off guard by the complexity of the GUI program style in general, and I had to overcome quite a learning curve in order to get my GUI components working properly. The hardest part about this was trying to arrange my components on the screen. Positioning objects in Java Swing seems excessively complicated, and I was only able to struggle through getting the components placed where I want them. However, there is so much more I need to learn about Java Swing before I am able to master the art of placing the components around the JPanel. 

I am now motivated to keep learning Java and Java Swing. I believe I am on the verge of writing some very useful applications, I just need to get my head around the Java Swing library and generally programming GUIs a bit more.