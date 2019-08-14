package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)

		// 2. create a variable of type "Component" that will hold your image
		Component pic = createImage("https://pngimg.com/uploads/letter_f/letter_f_PNG91.png");
		// 3. use the "createImage()" method below to initialize your Component
		// 4. add the image to the quiz window
		quizWindow.add(pic);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		quizWindow.setVisible(true);
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("what letter is this");
		// 7. print "CORRECT" if the user gave the right answer
		if(answer.equalsIgnoreCase("F")) {
			JOptionPane.showMessageDialog(null, "correct");
		} else {
			JOptionPane.showMessageDialog(null, "incorrect");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(pic);
		// 10. find another image and create it (might take more than one line
		// of code)
		Component pic2 = createImage("https://upload.wikimedia.org/wikipedia/commons/2/26/Jkr-ft69.png");
		// 11. add the second image to the quiz window
		quizWindow.add(pic2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("what number is this");
		// 14+ check answer, say if correct or incorrect, etc.
		int answerTwo = Integer.parseInt(answer2);
		if(answerTwo == 69) {
			JOptionPane.showMessageDialog(null, "correct");
		} else {
			JOptionPane.showMessageDialog(null, "incorrect");
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
