package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	       
		public void showButton() {
			JFrame frame = new JFrame();
			frame.setVisible(true);
			JButton button = new JButton();
			frame.add(button);
			frame.pack();
			button.addActionListener(this);
			
			Random rando = new Random();
			int i = rando.nextInt(5);
			if(i == 0) {
				JOptionPane.showMessageDialog(null, "you're gonna die");
			} else if(i == 1) {
				JOptionPane.showMessageDialog(null, "you're gonna trip and fall");
			} else if(i == 2) {
				JOptionPane.showMessageDialog(null, "on April 6th, 6:29 pm, you will suddenly experience a series of extremely painful heart attacks, and will be immediately rushed to the ER, only to die of unexplained circumstances, even though you have already recovered from the heart attacks");
			} else if(i == 3) {
				JOptionPane.showMessageDialog(null, "what fortune");
			} else if(i == 4) {
				JOptionPane.showMessageDialog(null,  "bruh");
			} else if(i == 5) {
				JOptionPane.showMessageDialog(null, "lmao");
			}
	    }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "woohoo");
		}
	
		
		
}
