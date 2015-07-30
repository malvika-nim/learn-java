* Questions for hw
  1) Explain thread safe with two examples.
  2) Runninng javac and java in single command. Difference between &, &&, etc.
  3) Imports required for GUI
  4) What is Jframe? [>=3]
  5) How to call jframe object[2 ways], and how is it differente from normal classes?
  6) What are extends and implements?
  7) What is Jpanel? Difference from JFrame? Why use Jpanel?  
  8) Difference between Jpanel and JApplet?
  9) How to find about any API/Class/Object in java? [Constructor, methods, properties] [Implements, extends, modifier] [javaDoc, StackOverflow]
  10) What is GUI? How to create it?
  11) Complete http://docs.oracle.com/javase/tutorial/uiswing/
* Theory
** Swing is not thread safe.
** JFrame: The framed window. It contains things. Minimum requirements.
	Extends: Component => Graphical representation with user interaction.
		 Container => Contains other graphical objects, in a list  
	Extended version of java.awt.Frame that adds support for the JFC/Swing component architecture

** JPanel: Allows for better organization
	Extends: Component
		 Container
		 JComponent 
	To use a component that inherits from JComponent, you must place the component in a containment hierarchy whose root is a top-level Swing container like JFrame.


** JFrame vs JPanel
	JFrame can exists without JPanel. JPanel cannot exist with JFrame. 
	JPanel is for complicated operations.

** JFrame vs JApplet
	Both toplevel containers. Can exist alone.
	JF: Desktop application, JA: Browser

** JComponent: abstract class for all swing components, base class for new components
** JLabel: 
	A display area for a short text string or an image, or both.

** Layout Managers: 
The Layout Managers such as Flow Layout, Grid Layout, Border Layout, etc., helps you to control the sizes, positions, and alignment of your components in JPanel


* SELF: 
**	1) Read documentation, use stackoverflow, quora, other learning sites
**	2) Links: 
		http://docs.oracle.com/javase/tutorial/uiswing/components/frame.html 
		http://www.differencebetween.net/technology/difference-between-jpanel-and-jframe/
		http://docs.oracle.com/javase/tutorial/uiswing/
		http://www.java2novice.com/java-interview-questions/
