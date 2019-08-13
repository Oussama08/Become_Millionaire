package millionaire;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;

public class millionaire extends JFrame implements ActionListener{
	
		
		JLabel m,n;
		JTextField a,b,c,d;
		ArrayList<JComponent> list = new ArrayList<JComponent>();
		JRadioButton w,x,y,z;
		JButton submit,next,quit,ll;
		ButtonGroup bg;
		int ctr;


		public millionaire()
			{
			setSize(700,700);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
			setTitle("Become a Millionaire - Gi3 ");
			m=new JLabel("Q.1");
			getContentPane().add(m);

			n=new JLabel("------------------- How Many World Wars are they ------------------");
			getContentPane().add(n);

			w=new JRadioButton();
			getContentPane().add(w);

			a=new JTextField(10);
			a.setText("One");
			getContentPane().add(a);

			x=new JRadioButton();
			getContentPane().add(x);

			b=new JTextField(10);
			b.setText("Five");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("Three");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("Two");
			getContentPane().add(d);
			
			list.add(a); 
			list.add(b); 
			list.add(c); 
			list.add(d);
			
			list.add(w); 
			list.add(x); 
			list.add(y); 
			list.add(z); 
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option");
			add(submit);
			
			next = new JButton(" Next Question");
			add(next);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 1;
					}
				if(e.getSource()==w )
					{
					ctr = 0;
					}
				if(e.getSource()==x )
					{
					ctr = 0;
					}
				if(e.getSource()==y )
					{
					ctr = 0;
					}
				if (e.getSource() == next && ctr == 1 )
					{
				
					Quest2 g1 = new Quest2();
					setVisible(false);
				
					}
				if (e.getSource() == next && ctr == 0 )
					{
				
					JOptionPane.showMessageDialog(null," You need to lock your answer first  ");
				
					}
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Right Answer!! You Have Won 100 Dh ");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer !! You Have Lost");
					System.exit(0);
				
					}
				if (e.getSource() == ll)
					{
					/*
					  	z.setVisible(false);	
						y.setVisible(false);
						d.setVisible(false);
						c.setVisible(false);*/
					int n1 = ((int)(Math.random()*3));
					while(n1==3)
						n1 = ((int)(Math.random()*3));
					System.out.println(n1);
					list.get(n1).setEnabled(false);
					list.get(n1+4).setEnabled(false);
					int n2 = ((int)(Math.random()*3));
					while(n2==n1 || n2 == 3)
						n2 = ((int)(Math.random()*3));
					System.out.println(n2);
					list.get(n2).setEnabled(false);
					list.get(n2+4).setEnabled(false);
					
					ll.setEnabled(false);
					
						
					}
				if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 0 Dh LOL ");
					System.exit(0);	
					}
				}
		public static void main(String arg[])
		{
			millionaire  g =new millionaire();
			g.setSize(330,180);
			g.setLocation(300,300);
		}
	}
	class Quest2 extends JFrame implements ActionListener 
	{
		JLabel m,n;
		JTextField a,b,c,d;
		JRadioButton w,x,y,z;
		JButton submit,next,quit,ll;
		ButtonGroup bg;
		int ctr;

		
		public Quest2()
			{
			super("Gi3 ENSAO v1 Q#2");
			setSize(320,180);
			setLocation(300,300);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
			
			
			
			n=new JLabel("--------------------- Justin Bieber's Current GF ----------------");
			getContentPane().add(n);
			
			w=new JRadioButton();
			getContentPane().add(w);
			
			a=new JTextField(10);
			a.setText("Selena Gomez");
			getContentPane().add(a);
			
			x=new JRadioButton();
			getContentPane().add(x);
			
			b=new JTextField(10);
			b.setText("Emma Watson");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("Miley Cyrus");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("Katrina Kaif");
			getContentPane().add(d);
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option ");
			add(submit);
			
			next = new JButton(" Next Question");
			add(next);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 0;
					}
				if(e.getSource()==w )
					{
					ctr = 1;
					}
				if(e.getSource()==x )
					{
					ctr = 0;
					}
				if(e.getSource()==y )
					{
					ctr = 0;
					}
				if (e.getSource() == next)
					{
					Quest3 g2 = new Quest3();
					setVisible(false);	
					}
				if (e.getSource() == next && ctr == 0 )
					{
				
					JOptionPane.showMessageDialog(null," You need to lock your answer first ");
				
					}	
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Right Answer !!! You Have Won 200 Dh");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer !!! You Have Won 0 Dh");
					
					}
				if (e.getSource() == ll)
					{
					
						z.setVisible(false);
						y.setVisible(false);
						d.setVisible(false);
						c.setVisible(false);
						
					}
				if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 0 Dh LOL ");
					System.exit(0);	
					}
				}
				
	}
	class Quest3 extends JFrame implements ActionListener 
	{
	JLabel m,n;
	JTextField a,b,c,d;
	JRadioButton w,x,y,z;
	JButton submit,next,quit,ll;
	ButtonGroup bg;
	int ctr;


		public Quest3()
			{
			super("Gi3 ENSAO v1 Q#3");
			setSize(320,180);
			setLocation(300,300);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
			
			
			
			n=new JLabel("------------------- Who Invented Computer? ------------------");
			getContentPane().add(n);
			
			w=new JRadioButton();
			getContentPane().add(w);
			
			a=new JTextField(10);
			a.setText("Bill Gates");
			getContentPane().add(a);
			
			x=new JRadioButton();
			getContentPane().add(x);
			
			b=new JTextField(10);
			b.setText("Charles Babbage");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("Steve Jobs");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("Mark Zuckerberg");
			getContentPane().add(d);
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option ");
			add(submit);
			
			next = new JButton(" Next Question");
			add(next);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 0;
					}
				if(e.getSource()==w )
					{
					ctr = 0;
					}
				if(e.getSource()==x )
					{
					ctr = 1;
					}
				if(e.getSource()==y )
					{
					ctr = 0;
					}
						
				if (e.getSource() == next)
					{
					Quest4 g3 = new Quest4();
					setVisible(false);	
					}
				if (e.getSource() == next && ctr == 0 )
					{
				
					JOptionPane.showMessageDialog(null," You need to lock your answer first  ");
				
					}
				
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Right Answer !! You Have Won 300 Dh");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer");
					System.exit(0);
				
					}
				if (e.getSource() == ll)
					{
					
						z.setVisible(false);	
						y.setVisible(false);
						d.setVisible(false);
						c.setVisible(false);
						
					}
				if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 0 Dh LOL ");
					System.exit(0);	
					}
				}

	}
	class Quest4 extends JFrame implements ActionListener 
	{
	JLabel m,n;
	JTextField a,b,c,d;
	JRadioButton w,x,y,z;
	JButton submit,next,quit,ll;
	ButtonGroup bg;
	int ctr;


		public Quest4()
			{
			super("Gi3 ENSAO v1 Q#4");
			setSize(320,180);
			setLocation(300,300);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
			
			
			
			n=new JLabel("------------------- Who Is CEO Of Apple Inc. ------------------");
			getContentPane().add(n);
			
			w=new JRadioButton();
			getContentPane().add(w);
			
			a=new JTextField(10);
			a.setText("Bill Gates");
			getContentPane().add(a);
			
			x=new JRadioButton();
			getContentPane().add(x);
			
			b=new JTextField(10);
			b.setText("Mr.Steve Morris");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("Steve Jobs");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("Mark Zuckerberg");
			getContentPane().add(d);
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option ");
			add(submit);
			
			next = new JButton(" Next Question");
			add(next);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 0;
					}
				if(e.getSource()==w )
					{
					ctr = 0;
					}
				if(e.getSource()==x )
					{
					ctr = 0;
					}
				if(e.getSource()==y )
					{
					ctr = 1;
			    	}
			    if (e.getSource() == next)
					{
			    	Quest5 g4 = new Quest5();
					setVisible(false);	
					}
				if (e.getSource() == next && ctr == 0 )
					{
				
					JOptionPane.showMessageDialog(null," You need to lock your answer first  ");
				
					}
				
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Right Answer !! You Have Won 500 Dh");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer");
					System.exit(0);
				
					}
				if (e.getSource() == ll)
					{
					
						z.setVisible(false);	
						x.setVisible(false);
						d.setVisible(false);
						b.setVisible(false);
						
					}
				if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 0 Dh LOL ");
					System.exit(0);	
					}
				}

	}
	class Quest5 extends JFrame implements ActionListener 
	{
	JLabel m,n;
	JTextField a,b,c,d;
	JRadioButton w,x,y,z;
	JButton submit,next,quit,ll;
	ButtonGroup bg;
	int ctr;


		public Quest5()
			{
			super("Gi3 ENSAO v1 Q#5");
			setSize(320,180);
			setLocation(300,300);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
			
			
			
			n=new JLabel("------------------- Name Of Google's Mobile OS ------------------");
			getContentPane().add(n);
			
			w=new JRadioButton();
			getContentPane().add(w);
			
			a=new JTextField(10);
			a.setText("Android");
			getContentPane().add(a);
			
			x=new JRadioButton();
			getContentPane().add(x);
			
			b=new JTextField(10);
			b.setText("Meego");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("Symbian");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("IOS");
			getContentPane().add(d);
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option ");
			add(submit);
			
			next = new JButton(" Next Question");
			add(next);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 0;
					}
				if(e.getSource()==w )
					{
					ctr = 1;
					}
				if(e.getSource()==x )
					{
					ctr = 0;
					}
				if(e.getSource()==y )
					{
					ctr = 0;
			    	}
			    if (e.getSource() == next)
					{
			    	Quest6 g5 = new Quest6();
					setVisible(false);	
					}
				if (e.getSource() == next && ctr == 0 )
					{
				
					JOptionPane.showMessageDialog(null," You need to lock your answer first  ");
				
					}
				
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Right Answer !! You Have Won 1000 Dh");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer");
					System.exit(0);
				
					}
				if (e.getSource() == ll)
					{
					
						z.setVisible(false);	
						y.setVisible(false);
						d.setVisible(false);
						c.setVisible(false);
						
					}
				if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 0 Dh LOL ");
					System.exit(0);	
					}
				}

	}
	class Quest6 extends JFrame implements ActionListener 
	{
	JLabel m,n;
	JTextField a,b,c,d;
	JRadioButton w,x,y,z;
	JButton submit,next,quit,ll;
	ButtonGroup bg;
	int ctr;


		public Quest6()
			{
			super("Gi3 ENSAO v1 Q#6");
			setSize(320,180);
			setLocation(300,300);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
			
			
			
			n=new JLabel("---------------------- Google's Web OS ----------------------");
			getContentPane().add(n);
			
			w=new JRadioButton();
			getContentPane().add(w);
			
			a=new JTextField(10);
			a.setText("Chromium OS");
			getContentPane().add(a);
			
			x=new JRadioButton();
			getContentPane().add(x);
			
			b=new JTextField(10);
			b.setText("Chrome OS");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("Linux");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("Googler");
			getContentPane().add(d);
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option ");
			add(submit);
			
			next = new JButton(" Next Question");
			add(next);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 0;
					}
				if(e.getSource()==w )
					{
					ctr = 0;
					}
				if(e.getSource()==x )
					{
					ctr = 1;
					}
				if(e.getSource()==y )
					{
					ctr = 0;
			    	}
			    if (e.getSource() == next)
					{
			    	Quest7 g6 = new Quest7();
					setVisible(false);	
					}
				if (e.getSource() == next && ctr == 0 )
					{
				
					JOptionPane.showMessageDialog(null," You need to lock your answer first  ");
				
					}
				
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Right Answer !! You Have Won 2000 Dh");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer");
					System.exit(0);
				
					}
				if (e.getSource() == ll)
					{
					
						z.setVisible(false);	
						y.setVisible(false);
						d.setVisible(false);
						c.setVisible(false);
						
					}
				if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 1000 Dh Bad Luck");
					System.exit(0);	
					}
				}

	}
	class Quest7 extends JFrame implements ActionListener 
	{
	JLabel m,n;
	JTextField a,b,c,d;
	JRadioButton w,x,y,z;
	JButton submit,next,quit,ll;
	ButtonGroup bg;
	int ctr;


		public Quest7()
			{
			super("Gi3 ENSAO v1 Q#7");
			setSize(320,180);
			setLocation(300,300);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
			
			
			n=new JLabel("------------------- Worlds #1 SmartPhone ------------------");
			getContentPane().add(n);
			
			w=new JRadioButton();
			getContentPane().add(w);
			
			a=new JTextField(10);
			a.setText("Samsung Galaxy");
			getContentPane().add(a);
			
			x=new JRadioButton();
			getContentPane().add(x);
			
			b=new JTextField(10);
			b.setText("Google Nexus S");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("Apple IPhone");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("Nokia N9");
			getContentPane().add(d);
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option ");
			add(submit);
			
			next = new JButton(" Next Question");
			add(next);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 0;
					}
				if(e.getSource()==w )
					{
					ctr = 0;
					}
				if(e.getSource()==x )
					{
					ctr = 0;
					}
				if(e.getSource()==y )
					{
					ctr = 1;
			    	}
			    if (e.getSource() == next)
					{
			    	Quest8 g7 = new Quest8();
					setVisible(false);	
					}
				if (e.getSource() == next && ctr == 0 )
					{
				
					JOptionPane.showMessageDialog(null," You need to lock your answer first  ");
				
					}
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Right Answer !! You Have Won 4000 Dh");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer");
					System.exit(0);
				
					}
				if (e.getSource() == ll)
					{
					
						z.setVisible(false);	
						x.setVisible(false);
						d.setVisible(false);
						a.setVisible(false);
						
					}
				if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 2000 Dh Bad Luck");
					System.exit(0);	
					}
				}

	}
	class Quest8 extends JFrame implements ActionListener 
	{
	JLabel m,n;
	JTextField a,b,c,d;
	JRadioButton w,x,y,z;
	JButton submit,next,quit,ll;
	ButtonGroup bg;
	int ctr;


		public Quest8()
			{
			super("Gi3 ENSAO v1 Q#8");
			setSize(320,180);
			setLocation(300,300);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
		
			
			n=new JLabel("------------------- Current CEO Of Google ------------------");
			getContentPane().add(n);
			
			w=new JRadioButton();
			getContentPane().add(w);
			
			a=new JTextField(10);
			a.setText("Bill Gates");
			getContentPane().add(a);
			
			x=new JRadioButton();
			getContentPane().add(x);
			
			b=new JTextField(10);
			b.setText("Charles Babbage");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("Larry Page");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("Mark Zuckerberg");
			getContentPane().add(d);
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option ");
			add(submit);
			
			next = new JButton(" Next Question");
			add(next);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 0;
					}
				if(e.getSource()==w )
					{
					ctr = 0;
					}
				if(e.getSource()==x )
					{
					ctr = 0;
					}
				if(e.getSource()==y )
					{
					ctr = 1;
			    	}
			    if (e.getSource() == next)
					{
			    	Quest9 g8 = new Quest9();
					setVisible(false);	
					}
				if (e.getSource() == next && ctr == 0 )
					{
				
					JOptionPane.showMessageDialog(null," You need to lock your answer first  ");
				
					}
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Right Answer !! You Have Won 8000 Dh");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer");
					System.exit(0);
				
					}
				if (e.getSource() == ll)
					{
					
						z.setVisible(false);	
						x.setVisible(false);
						d.setVisible(false);
						a.setVisible(false);
						
					}
				if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 400 Dh Bad Luck");
					System.exit(0);	
					}
				}

	}
	class Quest9 extends JFrame implements ActionListener 
	{
	JLabel m,n;
	JTextField a,b,c,d;
	JRadioButton w,x,y,z;
	JButton submit,next,quit,ll;
	ButtonGroup bg;
	int ctr;


		public Quest9()
			{
			super("Gi3 ENSAO v1 Q#9");
			setSize(320,180);
			setLocation(300,300);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
			
			
			n=new JLabel("------------------- Google's Blogging PlatForm ------------------");
			getContentPane().add(n);
			
			w=new JRadioButton();
			getContentPane().add(w);
			
			a=new JTextField(10);
			a.setText("Joomla");
			getContentPane().add(a);
			
			x=new JRadioButton();
			getContentPane().add(x);
			
			b=new JTextField(10);
			b.setText("Drupal");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("WordPress");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("Blogger");
			getContentPane().add(d);
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option ");
			add(submit);
			
			next = new JButton(" Next Question");
			add(next);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 1;
					}
				if(e.getSource()==w )
					{
					ctr = 0;
					}
				if(e.getSource()==x )
					{
					ctr = 0;
					}
				if(e.getSource()==y )
					{
					ctr = 0;
			    	}
			    if (e.getSource() == next)
					{
			    	Quest10 g9 = new Quest10();
					setVisible(false);	
					}
				if (e.getSource() == next && ctr == 0 )
					{
				
					JOptionPane.showMessageDialog(null," You need to lock your answer first  ");
				
					}
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Right Answer !! You Have Won 16000 Dh");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer");
					System.exit(0);
				
					}
				if (e.getSource() == ll)
					{
					
						x.setVisible(false);	
						y.setVisible(false);
						a.setVisible(false);
						c.setVisible(false);
						
					}
				if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 800 Dh Bad Luck");
					System.exit(0);	
					}
				}

	}
	class Quest10 extends JFrame implements ActionListener 
	{
	JLabel m,n;
	JTextField a,b,c,d;
	JRadioButton w,x,y,z;
	JButton submit,next,quit,ll;
	ButtonGroup bg;
	int ctr;


		public Quest10()
			{
			super("Gi3 ENSAO v1 Q#10");
			setSize(320,180);
			setLocation(300,300);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
			
			
			
			n=new JLabel("------------------Nokia's HeadQuarters Is At  ------------------");
			getContentPane().add(n);
			
			w=new JRadioButton();
			getContentPane().add(w);
			
			a=new JTextField(10);
			a.setText("NewYork");
			getContentPane().add(a);
			
			x=new JRadioButton();
			getContentPane().add(x);
			
			b=new JTextField(10);
			b.setText("Finland");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("WashingTon");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("LosAngeles");
			getContentPane().add(d);
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option ");
			add(submit);
			
			next = new JButton(" Next Question");
			add(next);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 0;
					}
				if(e.getSource()==w )
					{
					ctr = 0;
					}
				if(e.getSource()==x )
					{
					ctr = 1;
					}
				if(e.getSource()==y )
					{
					ctr = 0;
			    	}
			    if (e.getSource() == next)
					{
			    	Quest11 g10 = new Quest11();
					setVisible(false);	
					}
				if (e.getSource() == next && ctr == 0 )
					{
				
					JOptionPane.showMessageDialog(null," You need to lock your answer first  ");
				
					}
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Right Answer !! You Have Won 3200 Dh");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer");
					System.exit(0);
				
					}
				if (e.getSource() == ll)
					{
					
						z.setVisible(false);	
						y.setVisible(false);
						d.setVisible(false);
						c.setVisible(false);
						
					}
				if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 1600 Dh Bad Luck");
					System.exit(0);	
					}
				}

	}
	class Quest11 extends JFrame implements ActionListener 
	{
	JLabel m,n;
	JTextField a,b,c,d;
	JRadioButton w,x,y,z;
	JButton submit,next,quit,ll;
	ButtonGroup bg;
	int ctr;


		public Quest11()
			{
			super("Gi3 ENSAO v1 Q#11");
			setSize(320,180);
			setLocation(300,300);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
			
			
			
			n=new JLabel("-------------------Microsoft's Upcoming OS ------------------");
			getContentPane().add(n);
			
			w=new JRadioButton();
			getContentPane().add(w);
			
			a=new JTextField(10);
			a.setText("Mango");
			getContentPane().add(a);
			
			x=new JRadioButton();
			getContentPane().add(x);
			
			b=new JTextField(10);
			b.setText("Windows 8");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("Windows Phone 7");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("Windows Next");
			getContentPane().add(d);
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option ");
			add(submit);
			
			next = new JButton(" Next Question");
			add(next);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 0;
					}
				if(e.getSource()==w )
					{
					ctr = 0;
					}
				if(e.getSource()==x )
					{
					ctr = 1;
					}
				if(e.getSource()==y )
					{
					ctr = 0;
			    	}
			    if (e.getSource() == next)
					{
			    	Quest12 g11 = new Quest12();
					setVisible(false);	
					}
				if (e.getSource() == next && ctr == 0 )
					{
				
					JOptionPane.showMessageDialog(null," You need to lock your answer first  ");
				
					}
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Right Answer !! You Have Won 6400 Dh");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer");
					System.exit(0);
				
					}
					if (e.getSource() == ll)
					{
					
						z.setVisible(false);	
						y.setVisible(false);
						d.setVisible(false);
						c.setVisible(false);
						
					}
				if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 3200 Dh Bad Luck");
					System.exit(0);	
					}
				}

	}
	class Quest12 extends JFrame implements ActionListener 
	{
	JLabel m,n;
	JTextField a,b,c,d;
	JRadioButton w,x,y,z;
	JButton submit,next,quit,ll;
	ButtonGroup bg;
	int ctr;


		public Quest12()
			{
			super("Gi3 ENSAO v1 Q#12");
			setSize(320,180);
			setLocation(300,300);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
			
			
			
			n=new JLabel("-------------------Is Not Social Networking Site------------------");
			getContentPane().add(n);
			
			w=new JRadioButton();
			getContentPane().add(w);
			
			a=new JTextField(10);
			a.setText("Twitter");
			getContentPane().add(a);
			
			x=new JRadioButton();
			getContentPane().add(x);
			
			b=new JTextField(10);
			b.setText("Google+");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("Facebook");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("FriendSter");
			getContentPane().add(d);
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option ");
			add(submit);
			
			next = new JButton(" Next Question");
			add(next);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 0;
					}
				if(e.getSource()==w )
					{
					ctr = 1;
					}
				if(e.getSource()==x )
					{
					ctr = 0;
					}
				if(e.getSource()==y )
					{
					ctr = 0;
			    	}
			    if (e.getSource() == next)
					{
			    	Quest13 g12 = new Quest13();
					setVisible(false);	
					}
				if (e.getSource() == next && ctr == 0 )
					{
				
					JOptionPane.showMessageDialog(null," You need to lock your answer first  ");
				
					}
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Right Answer !! You Have Won 12 500 Dh");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer");
					System.exit(0);
				
					}
				if (e.getSource() == ll)
					{
					
						z.setVisible(false);	
						y.setVisible(false);
						d.setVisible(false);
						c.setVisible(false);
						
					}
				if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 6400 Dh Bad Luck");
					System.exit(0);	
					}
				}

	}
	class Quest13 extends JFrame implements ActionListener 
	{
	JLabel m,n;
	JTextField a,b,c,d;
	JRadioButton w,x,y,z;
	JButton submit,next,quit,ll;
	ButtonGroup bg;
	int ctr;


		public Quest13()
			{
			super("Gi3 ENSAO v1 Q#13");
			setSize(320,180);
			setLocation(300,300);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
			
			
			
			n=new JLabel("--------------------- Not A Search Engine -------------------");
			getContentPane().add(n);
			
			w=new JRadioButton();
			getContentPane().add(w);
			
			a=new JTextField(10);
			a.setText("Bing");
			getContentPane().add(a);
			
			x=new JRadioButton();
			getContentPane().add(x);
			
			b=new JTextField(10);
			b.setText("Baidu");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("Blekko");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("MSN");
			getContentPane().add(d);
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option ");
			add(submit);
			
			next = new JButton(" Next Question");
			add(next);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 1;
					}
				if(e.getSource()==w )
					{
					ctr = 0;
					}
				if(e.getSource()==x )
					{
					ctr = 0;
					}
				if(e.getSource()==y )
					{
					ctr = 0;
			    	}
			    if (e.getSource() == next)
					{
			    	Quest14 g13 = new Quest14();
					setVisible(false);	
					}
				if (e.getSource() == next && ctr == 0 )
					{
				
					JOptionPane.showMessageDialog(null," You need to lock your answer first  ");
				
					}
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Right Answer !! You Have Won 25,000 Dh");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer");
					System.exit(0);
				
					}
				if (e.getSource() == ll)
					{
					
						x.setVisible(false);	
						y.setVisible(false);
						a.setVisible(false);
						c.setVisible(false);
						
					}
				if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 12,500 Dh Bad Luck");
					System.exit(0);	
					}
				}

	}
	class Quest14 extends JFrame implements ActionListener 
	{
	JLabel m,n;
	JTextField a,b,c,d;
	JRadioButton w,x,y,z;
	JButton submit,next,quit,ll;
	ButtonGroup bg;
	int ctr;


		public Quest14()
			{
			super("Gi3 ENSAO v1 Q#14");
			setSize(320,180);
			setLocation(300,300);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
			
			
			
			n=new JLabel("-----------------Nokia's Future Mobile OS--------------------");
			getContentPane().add(n);
			
			w=new JRadioButton();
			getContentPane().add(w);
			
			a=new JTextField(10);
			a.setText("Meego");
			getContentPane().add(a);
			
			x=new JRadioButton();
			getContentPane().add(x);
			
			b=new JTextField(10);
			b.setText("Windows Phone 7");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("A & B");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("None Of The Above");
			getContentPane().add(d);
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option ");
			add(submit);
			
			next = new JButton(" Next Question");
			add(next);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 0;
					}
				if(e.getSource()==w )
					{
					ctr = 0;
					}
				if(e.getSource()==x )
					{
					ctr = 1;
					}
				if(e.getSource()==y )
					{
					ctr = 0;
			    	}
			    if (e.getSource() == next)
					{
			    	Quest15 g14 = new Quest15();
					setVisible(false);	
					}
				if (e.getSource() == next && ctr == 0 )
					{
				
					JOptionPane.showMessageDialog(null," You need to lock your answer first  ");
				
					}
				
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Right Answer !! You Have Won 50,000 Dh");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer");
					System.exit(0);
				
					}
				if (e.getSource() == ll)
					{
					
						z.setVisible(false);	
						y.setVisible(false);
						d.setVisible(false);
						c.setVisible(false);
						
					}
				if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 25,000 Dh Bad Luck");
					System.exit(0);	
					}
				}

	}
	class Quest15 extends JFrame implements ActionListener 
	{
	JLabel m,n;
	JTextField a,b,c,d;
	JRadioButton w,x,y,z;
	JButton submit,quit,ll;
	ButtonGroup bg;
	int ctr;


		public Quest15()
			{
			super("Gi3 ENSAO v1 Q#15");
			setSize(320,180);
			setLocation(300,300);
			setVisible(true);
			getContentPane().setLayout(new FlowLayout());
			
			
			
			n=new JLabel("-------------------Not A Sony's Product -----------------------");
			getContentPane().add(n);
			
			w=new JRadioButton();
			getContentPane().add(w);
			
			a=new JTextField(10);
			a.setText("WalkMan");
			getContentPane().add(a);
			
			x=new JRadioButton();
			getContentPane().add(x);
			
			b=new JTextField(10);
			b.setText("PlayStation");
			getContentPane().add(b);
			
			y=new JRadioButton();
			getContentPane().add(y);
			
			c=new JTextField(10);
			c.setText("XBOX 360");
			getContentPane().add(c);
			
			z=new JRadioButton();
			getContentPane().add(z);
			
			
			d=new JTextField(10);
			d.setText("None of The Above");
			getContentPane().add(d);
			
			a.setEditable(false);
			b.setEditable(false);
			c.setEditable(false);
			d.setEditable(false);
			
			submit = new JButton(" Lock This Option ");
			add(submit);
			
			ll = new JButton("     Use 50:50      ");
			add(ll);
			
			quit = new JButton("Quit This Game");
			add(quit);
			
			
			bg = new ButtonGroup();
			bg.add(w);
			bg.add(x);
			bg.add(y);
			bg.add(z);
			
			z.addActionListener(this);
			x.addActionListener(this);
			y.addActionListener(this);
			w.addActionListener(this);
			submit.addActionListener(this);
			ll.addActionListener(this);
			quit.addActionListener(this);
			
			
			}
			public void actionPerformed(ActionEvent e)
				{
				if(e.getSource()==z )
					{
					ctr = 0;
					}
				if(e.getSource()==w )
					{
					ctr = 0;
					}
				if(e.getSource()==x )
					{
					ctr = 0;
					}
				if(e.getSource()==y )
					{
					ctr = 1;
			    	}
				
				if (e.getSource() == submit && ctr == 1)
					{
					JOptionPane.showMessageDialog(null," Congratulations Man !! You Have Become A Millionaire");
					}
				if (e.getSource() == submit && ctr == 0)
					{
				
					JOptionPane.showMessageDialog(null," Wrong Answer");
					System.exit(0);
				
					}
				if (e.getSource() == ll)
					{
					
						z.setVisible(false);	
						x.setVisible(false);
						d.setVisible(false);
						a.setVisible(false);
						
					}
					if (e.getSource() == quit)
					{
					JOptionPane.showMessageDialog(null," You Have Won 50,000 DH Bad Luck , u're already a rich man LOL");
					System.exit(0);	
					}
				}

	

}
