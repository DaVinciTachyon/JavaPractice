import java.awt.event.*;
import javax.swing.*;


public class Sound extends JFrame implements ActionListener
{

    JPanel pnl = new JPanel();
    ClassLoader ldr = this.getClass().getClassLoader();
    java.applet.AudioClip audio = JApplet.newAudioClip(ldr.getResource("24KMagic.mid"));
    JButton playBtn = new JButton("Play");
    JButton stopBtn = new JButton("Stop");

    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource()==playBtn) audio.play();
        if(event.getSource()==stopBtn) audio.stop();
    }

    public Sound()
    {
        super("Sound");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(pnl);
        pnl.add(playBtn);
        pnl.add(stopBtn);
        playBtn.addActionListener(this);
        stopBtn.addActionListener(this);

        setVisible(true);
    }

    public static void main(String[] args)
    {
        Sound gui = new Sound();
    }

}
