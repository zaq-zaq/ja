package package3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ckou {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("选课系统");	
		JPanel p1 = new JPanel();
		f.add(p1);
		Label l1 = new Label("姓名:");
		p1.add(l1);
		TextField t=new TextField(10);
		p1.add(t);
		
		JPanel p4 = new JPanel();
		f.add(p4);
		Label l3 = new Label("性别:");
		p4.add(l3);
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox male=new Checkbox("男",cg,false);
		Checkbox female=new Checkbox("女",cg,false);
		p4.add(male);
		p4.add(female);
		
		JPanel p5 = new JPanel();
		f.add(p5);
		Label l5 = new Label("学号:");
		p5.add(l5);
		TextField t2=new TextField(10);
		p5.add(t2);
		
		JPanel p3 = new JPanel();
		f.add(p3);
		Button b1 = new Button("注册");
		p3.add(b1);
		
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	f.setVisible(false);
            	JFrame f2 = new JFrame("选课信息");
            	f2.setSize(700,350);
            	f2.setVisible(true);
            	f2.setLocationRelativeTo(null);
            	JPanel p6 = new JPanel();
        		f2.add(p6);
        		Label l2 = new Label("可选课程:");
        		p6.add(l2);
        		Checkbox k1 =new Checkbox("高数");
        		Checkbox k2 =new Checkbox("英语");
        		p6.add(k1);
        		p6.add(k2);
        		Button b2 = new Button("打印");
        		Button b4 = new Button("确定");
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
						t1 = new Teacher("王老师","男",1073);
						t1.setCourse(new Course("高数","教101","7:50am--9:25am",9012,5));
						t2 = new Teacher("李老师","女",1026);
						t2.setCourse(new Course("英语","教205","13:30am--15:05am",9347,2));
						c1=t1.getCourse();
						c2=t2.getCourse();
						//area.append(t1+c1);
						area.append("\n"+t2+c2);
						
					}
                });
                
        		b4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						area.setText("选课成功！"+"\n");
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

