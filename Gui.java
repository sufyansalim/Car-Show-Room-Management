import javax.swing.*;

import java.util.*;
import java.awt.*;

import javax.swing.event.*;

import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import java.io.*;
import java.net.URL;


public class Gui extends WindowAdapter implements ActionListener{
JFrame f;
JPanel p,p1,p2,p3,p4,p5,ase;
JButton s,enter,exit,b0,be,bc,bk,ne,cb,nc,bm,baf,mb,nm,afb,naf;
JTextField jtuser,jtpass,tf,tf1,tf2,tf3,tfe,tfo,tf1m,tf1c,tf2w,tf2t,tf3s,tf3l;
JLabel juser,jpass,jl,jl1,jl2,jl3,jle,jlo,jl1c,jl1m,jl2t,jl2w,jl3s,jl3l;
FileWriter fw = null;
PrintWriter pw = null;
//String username = "suf", password = "suf";
ArrayList Cars,Employes;
CarInfo c,e;
String line,line1, name, model ,company;

public Gui()
{
	f = new JFrame("Suf's AutoMobiles");
	display();
	
	Cars=new ArrayList();
	Employes=new ArrayList();
	
    }

void display()
	{
		try{
	        
	       
	        p = new JPanel();
	        p.setBackground(Color.WHITE);
	        p.setLayout(null);	       
	        enter = new JButton("Enter");
	        exit = new JButton("Exit");	        
	        enter.setBounds(450,500,100,30);	      
	        exit.setBounds(600,500,100,30);
	        p.add(enter);
	        p.add(exit);
	       
	          enter.addActionListener(this);
	          exit.addActionListener(this);
	       
	        
	        
	        Image logo = Toolkit.getDefaultToolkit().createImage("logo.gif");     // logo animation
        	ImageIcon glowIcon = new ImageIcon(logo);
      		JLabel picLabel = new JLabel(glowIcon);
			picLabel.setBounds(-10,-165,700,450);
			p.setBackground(Color.BLACK);
			p.add(picLabel);
			

	        Image animation = Toolkit.getDefaultToolkit().createImage("car_spin.gif");     // logo animation
        	ImageIcon carIcon = new ImageIcon(animation);
      		JLabel animaLabel = new JLabel(carIcon);
			animaLabel.setBounds(335,-230,800,600);
			p.add(animaLabel);
			
			
			
			
			BufferedImage myPicture1 = ImageIO.read(new File("main pic.jpg"));     // car's pic
	 		JLabel picLabel1 = new JLabel(new ImageIcon(myPicture1));
			picLabel1.setBounds(-5,150,800,450);
			p.add(picLabel1);
			
	}
	catch(IOException io)
	{

	}
		catch(NullPointerException np)
		{

		}
	
	        f.add(p);
	        
	        f.setSize(800,600);
	        f.addWindowListener(this);
	        f.setVisible(true);
	        f.setResizable(false);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
void Menu()
{
	try{
	p1= new JPanel();
	p1.setLayout(null);
	b0 = new JButton("Back");
	ImageIcon Employes = new ImageIcon("employee.png"); // employe icon
	be = new JButton(Employes);  
	ImageIcon car = new ImageIcon("car.png"); // car icon
	bc = new JButton(car);
	b0.addActionListener(this);
	b0.setBounds(600,500,100,30);
	be.setBounds(170,100,100,80);
	be.addActionListener(this);
	bc.setBounds(170,200,100,80);
	bc.addActionListener(this);
	p1.add(b0);
	p1.add(be);
	p1.add(bc);
	ImageIcon Maintenance = new ImageIcon("maintenance.png"); // maintenance icon
    bm = new JButton(Maintenance);
    ImageIcon AccountsnFinance = new ImageIcon("Account and Finance.png"); // account & finance icon
    baf= new JButton(AccountsnFinance);
    bm.setBounds(170,300,100,80);
    bm.setBackground(Color.WHITE);
    baf.setBounds(170,400,100,80);
    bm.addActionListener(this);
    baf.addActionListener(this);
    p1.add(bm);
	p1.add(baf);
    
	 BufferedImage myPicture = ImageIO.read(new File("gallardo.jpg"));     // car's pic
	    JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		picLabel.setBounds(-5,-15,800,600);
		p1.add(picLabel);
		p1.setBackground(Color.BLACK);
	
	
	//ase = new JPanel();
	//ase.setLayout(null);
	
	
	// BufferedImage logoo = ImageIO.read(new File("main_loogo.jpg"));     // lamborgani logo
	   // JLabel loogo = new JLabel(new ImageIcon(logoo));
	//	loogo.setBounds(0,20,160,600);
		//ase.add(loogo);
	
	
	}
	catch(IOException io)
	{

	}
	catch(NullPointerException np)
	{

	}
	
	//f.add(ase);
	//ase.setBounds(-5,-25,160,600);
	//ase.setBackground(Color.DARK_GRAY);
	f.add(p1);
    f.setSize(800,600);
    f.setVisible(true);
    f.setResizable(false);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
void Employes(){
	try{
	p2= new JPanel();
	p2.setLayout(null);
	p2.setBackground(Color.WHITE);
	f.add(p2);
	tf = new JTextField(15);
	tf.setBounds(460,150,100,50);
	jl = new JLabel("Employe Name");
	jl.setBounds(300,150,150,50);
    jl.setForeground(Color.WHITE);
	tfe = new JTextField(15);
	tfe.setBounds(460,200,100,50);
	jle = new JLabel("Employe Qualifications");
	jle.setBounds(300,200,150,50);
	jle.setForeground(Color.WHITE);
	tfo = new JTextField(15);
	tfo.setBounds(460,250,100,50);
	jlo = new JLabel("Employe Post");
	jlo.setBounds(300,250,150,50);
	jlo.setForeground(Color.WHITE);
	bk = new JButton("Back");
	bk.setBounds(350,400,100,30);
	p2.add(bk);
	bk.addActionListener(this);
	ne = new JButton("New");
	ne.setBounds(460,400,100,30);
    p2.add(ne);
    ne.addActionListener(this);
	p2.add(tf);
	p2.add(jl);
	p2.add(tfe);
	p2.add(jle);
	p2.add(tfo);
	p2.add(jlo);
	
	 BufferedImage myPicture0 = ImageIO.read(new File("main pic.jpg"));     // car's pic
	    JLabel picLabel0 = new JLabel(new ImageIcon(myPicture0));
		picLabel0.setBounds(-5,-25,800,600);
		p2.add(picLabel0);
		p2.setBackground(Color.BLACK);
		
	}
		catch(IOException io)
		{
		}
	catch(NullPointerException np)
	{

	}
	
	
	tf.setEditable(false); // text field uneditable
	tfe.setEditable(false);
	tfo.setEditable(false);
	f.setSize(800,600);
    f.setVisible(true);
    f.setResizable(false);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

void Cars(){
	try{
	p3= new JPanel();
	p3.setLayout(null);
	p3.setBackground(Color.WHITE);
	f.add(p3);
	tf1 = new JTextField(15);
	tf1.setBounds(460,150,100,50);
	jl1 = new JLabel("Car Name");
	jl1.setBounds(300,150,150,50);	
	 jl1.setForeground(Color.WHITE);
		tf1m = new JTextField(15);
		tf1m.setBounds(460,200,100,50);
		jl1m = new JLabel("Car Model");
		jl1m.setBounds(300,200,150,50);
		jl1m.setForeground(Color.WHITE);
		tf1c = new JTextField(15);
		tf1c.setBounds(460,250,100,50);
		jl1c = new JLabel("Company");
		jl1c.setBounds(300,250,150,50);
		jl1c.setForeground(Color.WHITE);
	
	cb = new JButton("Back");
	s=new JButton("Search");
	s.setBounds(240,400,100,30);
	p3.add(s);
	s.addActionListener(this);
	cb.setBounds(350,400,100,30);
	p3.add(cb);
	cb.addActionListener(this);
	nc = new JButton("New");
	nc.setBounds(460,400,100,30);
    p3.add(nc);
    nc.addActionListener(this);
	p3.add(tf1);
	p3.add(jl1);
	p3.add(tf1c);
	p3.add(jl1c);
	p3.add(tf1m);
	p3.add(jl1m);
	
	
	 BufferedImage myPicture1 = ImageIO.read(new File("main pic.jpg"));     // car's pic
	    JLabel picLabel1 = new JLabel(new ImageIcon(myPicture1));
		picLabel1.setBounds(-5,-25,800,600);
		p3.add(picLabel1);
		p3.setBackground(Color.BLACK);
		
	}
		catch(IOException io)
		{
		}
	catch(NullPointerException np)
	{

	}	
	
	tf1.setEditable(false); // text field uneditable
	tf1c.setEditable(false); 
	tf1m.setEditable(false); 
	f.setSize(800,600);
    f.setVisible(true);
    f.setResizable(false);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
}
void Maintenance(){
	try{
	p4= new JPanel();
	p4.setLayout(null);
	p4.setBackground(Color.WHITE);
	f.add(p4);
	tf2 = new JTextField(15);
	tf2.setBounds(460,150,100,50);
	jl2 = new JLabel("Cars for Repair");
	jl2.setBounds(300,150,150,50);	
	jl2.setForeground(Color.WHITE);
	tf2t = new JTextField(15);
	tf2t.setBounds(460,200,100,50);
	jl2t = new JLabel("Cars for Tuneup");
	jl2t.setBounds(300,200,150,50);
	jl2t.setForeground(Color.WHITE);
	tf2w = new JTextField(15);
	tf2w.setBounds(460,250,100,50);
	jl2w = new JLabel("Cars for Wash");
	jl2w.setBounds(300,250,150,50);
	jl2w.setForeground(Color.WHITE);
	
	mb = new JButton("Back");
	mb.setBounds(350,400,100,30);
	p4.add(mb);
	mb.addActionListener(this);
	nm = new JButton("New");
	nm.setBounds(460,400,100,30);
    p4.add(nm);
    nm.addActionListener(this);
	p4.add(tf2);
	p4.add(jl2);
	tf2.setEditable(false); // text field uneditable
	p4.add(tf2w);
	p4.add(tf2t);
	p4.add(jl2t);
	p4.add(jl2w);
	tf2w.setEditable(false);
	tf2t.setEditable(false);	
	
	 BufferedImage myPicture2 = ImageIO.read(new File("main pic.jpg"));     // car's pic
	    JLabel picLabel2 = new JLabel(new ImageIcon(myPicture2));
		picLabel2.setBounds(-5,-25,800,600);
		p4.add(picLabel2);
		p4.setBackground(Color.BLACK);
		
	}
		catch(IOException io)
		{
		}
	catch(NullPointerException np)
	{

	}
	f.setSize(800,600);
    f.setVisible(true);
    f.setResizable(false);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
void AccountnFinance(){
	try{
	p5= new JPanel();
	p5.setLayout(null);
	p5.setBackground(Color.WHITE);
	f.add(p5);
	tf3 = new JTextField(15);
	tf3.setBounds(460,150,100,50);
	jl3 = new JLabel("Total Profit");
	jl3.setBounds(300,150,150,50);
	jl3.setForeground(Color.WHITE);
	tf3s = new JTextField(15);
	tf3s.setBounds(460,200,100,50);
	jl3s = new JLabel("Cars Sold");
	jl3s.setBounds(300,200,150,50);
	jl3s.setForeground(Color.WHITE);
	p5.add(tf3s);
	p5.add(jl3s);
	tf3s.setEditable(false);
	tf3l = new JTextField(15);
	tf3l.setBounds(460,250,100,50);
	jl3l = new JLabel("Loss");
	jl3l.setBounds(300,250,150,50);
	jl3l.setForeground(Color.WHITE);
	p5.add(tf3l);
	p5.add(jl3l);
	tf3l.setEditable(false);
	afb = new JButton("Back");
	afb.setBounds(350,400,100,30);
	p5.add(afb);
	afb.addActionListener(this);
	naf = new JButton("New");
	naf.setBounds(460,400,100,30);
    p5.add(naf);
    naf.addActionListener(this);
	p5.add(tf3);
	p5.add(jl3);
	tf3.setEditable(false); // text field uneditable
	
	 BufferedImage myPicture3 = ImageIO.read(new File("main pic.jpg"));     // car's pic
	    JLabel picLabel3 = new JLabel(new ImageIcon(myPicture3));
		picLabel3.setBounds(-5,-25,800,600);
		p5.add(picLabel3);
		p5.setBackground(Color.BLACK);
		
	}
		catch(IOException io)
		{
		}
	catch(NullPointerException np)
	{

	}
	f.setSize(800,600);
    f.setVisible(true);
    f.setResizable(false);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}


//add new car to array list
	public void addCars()
	{
		String name = JOptionPane.showInputDialog("Enter Name");
		String model = JOptionPane.showInputDialog("Enter Model");
		String company = JOptionPane.showInputDialog("Enter Company");
         tf1.setText(name);
         
         tf1m.setText(model);
         
         tf1c.setText(company);
		// construct new car object
		CarInfo c = new CarInfo(name,model,company, name,model, company);

		// add the above info object to array list
		Cars.add(c);

		saveCars();
	}
	
	//search car by name by iterating over arraylist 
		public void searchCar(String n)
		{	
			for (int i=0 ; i<Cars.size(); i++)
			{
				CarInfo c = (CarInfo)Cars.get(i);
				if(n.equals(c.name))
				{
					c.print();
				}
			} // end for
		}  // end searchCars
		
		
		//loading Cars from file
		public void loadCars()
		{
			String tokens[]=null;
			

			try{
		
			FileReader fr = new FileReader("cars.txt");
			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine();
		
			while (line != null)
			{
				tokens = line.split(",");

				name = tokens[0];
				model = tokens[1];
				company = tokens[2];
		
				CarInfo c = new CarInfo(name , model ,company,name , model ,company);
				Cars.add(c);

				line = br.readLine();
			}
			br.close();
			fr.close();
			}
			catch (Exception ioex)
			{
				System.out.println(ioex);
			}
		}
	//add new employe record to array list
	public void addEmployes()
	{
		String name1 = JOptionPane.showInputDialog("Enter Name");
		String qualifications = JOptionPane.showInputDialog("Enter Qualifications");
		String post = JOptionPane.showInputDialog("Enter Post");
		 
		
         tf.setText(name1);
        
         tfe.setText(qualifications);
       
         tfo.setText(post);
		// construct new employe object
		CarInfo e = new CarInfo(name1,qualifications,post,name1,qualifications,post);

		// add the above info object to array list
		Employes.add(e);

		saveEmployes();
	}
// for saving cars
public void saveCars()
{
	try{
	
	FileWriter fw = new FileWriter("cars.txt");
	PrintWriter pw = new PrintWriter(fw);

	for (int i =0 ; i<Cars.size(); i++)
	{
		c = (CarInfo)Cars.get(i);
		line = c.name + "," + c.model +"," + c.company;
		
		//writes line to the file
		pw.println(line);
	}// end of for

	pw.flush();
	pw.close();
	fw.close();
	}//end of try
	catch(Exception ioex)
	{
	
	}
}
// for saving employes
public void saveEmployes()
{
	try{
	
	FileWriter fw = new FileWriter("employes.txt");
	PrintWriter pw = new PrintWriter(fw);

	for (int i =0 ; i<Employes.size(); i++)
	{
		e = (CarInfo)Employes.get(i);
		line1 = e.name1 + "," + e.qualifications +"," + e.post;
		
		//writes line to the file
		pw.println(line1);
	}// end of for

	pw.flush();
	pw.close();
	fw.close();
	}//end of try
	catch(Exception ioex)
	{
	
	}
}

//void AddEmployes(){
	//try{
	//fw = new FileWriter("Employes.txt");
	//pw = new PrintWriter(fw);
	//pw.flush();
    //pw.close();
    //fw.close();

	//}
	//catch(IOException io)
	//{
	//}
	
//}

public void actionPerformed(ActionEvent e)
	{
		JButton b1 = (JButton)e.getSource(); // enter menu
		if (b1.equals(enter))
		{
			
			
				f.remove(p);
				Menu();
			}
		
		if (b1.equals(exit)) //to exit
		{
		
			System.exit(0);
		
		}
		
		if (b1.equals(b0)) //back to main screen
		{
			f.remove(p1);
            display();
		}
		
		else if (b1.equals(be)) //enter into employes
		{
			f.remove(p1);
            Employes();
		}
		else if (b1.equals(bk)) //go back to menu from employe
		{
			f.remove(p2);
            Menu();
		}
		else if (b1.equals(ne)) //new employe
		{
			
			addEmployes();
			
           
		}
		
		else if (b1.equals(bc)) //enter into cars
		{
			f.remove(p1);
            Cars();
		}
		else if (b1.equals(cb)) //go back to menu from cars
		{
			f.remove(p3);
            Menu();
		}
		else if (b1.equals(nc)) //new car
		{
			addCars();
           
           
		}
		else if (b1.equals(s)) //search car
		{
		searchCar(name);
           
           
		}
	
		else if (b1.equals(bm)) //enter into maintenance
		{
			f.remove(p1);
            Maintenance();
		}
		else if (b1.equals(mb)) //go back to menu from maintenance
		{
			f.remove(p4);
            Menu();
		}
		else if (b1.equals(nm)) //new maintenance
		{
			
            String car = JOptionPane.showInputDialog("Cars for Repair");
            tf2.setText(car);
            String repair = JOptionPane.showInputDialog("Cars for Tuneup");
            tf2t.setText(repair);
            String wash = JOptionPane.showInputDialog("Cars for wash");
            tf2w.setText(wash);
		}
		else if (b1.equals(baf)) //enter into account & finance
		{
			f.remove(p1);
            AccountnFinance();
		}
		else if (b1.equals(afb)) //go back to menu from account & finance
		{
			f.remove(p5);
            Menu();
		}
		else if (b1.equals(naf)) //new account & finance
		{
			
            String car = JOptionPane.showInputDialog("How much Income?");
            tf3.setText(car);
            String sold = JOptionPane.showInputDialog("How many cars Sold?");
            tf3s.setText(sold);
            String loss = JOptionPane.showInputDialog("How much Loss?");
            tf3l.setText(loss);
		}
	}
		
		public void windowClosing(WindowEvent w)
		{
			int close = JOptionPane.showConfirmDialog(null, "Are You Sure Want To Close?",  "Suf's Auto Mobiles", JOptionPane.YES_NO_CANCEL_OPTION);

			if(close == JOptionPane.YES_OPTION)
			{
	    		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//yes
			}
			 else if (close == JOptionPane.CANCEL_OPTION) 
			{
	    			f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//cancel
			} 
			else 
			{
				f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//no
			}
		}
	
	}


	
