package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Sound_Effects_Machine implements ActionListener {

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
			
		} else if(i == 1) {
			playSound("sawing-wood-daniel_simon.wav");
		} else if(i == 2) {
			playSound("Rock Slide-SoundBible.com-2065164739.wav");
		} else if(i == 3) {
			playSound("Rogue Wave 3-SoundBible.com-887977244.wav");
		} else if(i == 4) {
			playSound("Hello Echoes Down Well-SoundBible.com-1467946244.wav");
		} else if(i == 5) {
			playSound("Sniper_Fire_Reload-Mike_Koenig-1309646991.wav");
		}
    }
	
	private void playSound(String fileName) {

	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

	    sound.play();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
