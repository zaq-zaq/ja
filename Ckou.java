package package3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ckou {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("ѡ��ϵͳ");	
		JPanel p1 = new JPanel();
		f.add(p1);
		Label l1 = new Label("����:");
		p1.add(l1);
		TextField t=new TextField(10);
		p1.add(t);
		
		JPanel p4 = new JPanel();
		f.add(p4);
		Label l3 = new Label("�Ա�:");
		p4.add(l3);
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox male=new Checkbox("��",cg,false);
		Checkbox female=new Checkbox("Ů",cg,false);
		p4.add(male);
		p4.add(female);
		
		JPanel p5 = new JPanel();
		f.add(p5);
		Label l5 = new Label("ѧ��:");
		p5.add(l5);
		TextField t2=new TextField(10);
		p5.add(t2);
		
		JPanel p3 = new JPanel();
		f.add(p3);
		Button b1 = new Button("ע��");
		p3.add(b1);
		
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	f.setVisible(false);
            	JFrame f2 = new JFrame("ѡ����Ϣ");
            	f2.setSize(700,350);
            	f2.setVisible(true);
            	f2.setLocationRelativeTo(null);
            	JPanel p6 = new JPanel();
        		f2.add(p6);
        		Label l2 = new Label("��ѡ�γ�:");
        		p6.add(l2);
        		Checkbox k1 =new Checkbox("����");
        		Checkbox k2 =new Checkbox("Ӣ��");
        		p6.add(k1);
        		p6.add(k2);
        		Button b2 = new Button("��ӡ");
        		Button b4 = new Button("ȷ��");
        		p6.add(b4);
        		p6.add(b2);
                TextArea area=new TextArea();
                JScrollPane pane = new JScrollPane(area);
                p6.add(pane);
                p6.add(area);
                
                b2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Teacher t1,t2;
						Course c1;
						Course c2;
						t1 = new Teacher("����ʦ","��",1073);
						t1.setCourse(new Course("����","��101","7:50am--9:25am",9012,5));
						t2 = new Teacher("����ʦ","Ů",1026);
						t2.setCourse(new Course("Ӣ��","��205","13:30am--15:05am",9347,2));
						c1=t1.getCourse();
						c2=t2.getCourse();
						//area.append(t1+c1);
						area.append("\n"+t2+c2);
						
					}
                });
                
        		b4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						area.setText("ѡ�γɹ���"+"\n");
					}
                });
        		
        		
            }
        });
		
		f.setSize(250, 250);	
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		
	}
}

