# ja
一、实验目的

1.分析学生选课系统

2.使用GUI窗体及其组件设计窗体界面

3.完成学生选课过程业务逻辑编程

4.基于文件保存并读取数据

5.掌握处理异常方法

二、实验要求

1、	设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。

2、	基于事件模型对业务逻辑编程，实现在界面上支持上述操作。

3、	针对操作过程中可能会出现的各种异常，做异常处理

4、	基于输入/输出编程，支持学生、课程、教师等数据的读写操作。

5、	基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。

例如：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择课程。

定义每种角色人员的属性，及其操作方法。

属性示例：	人员（编号、姓名、性别……）

教师（编号、姓名、性别、所授课程、……）

			学生（编号、姓名、性别、所选课程、……）
      
			课程（编号、课程名称、上课地点、时间、授课教师、……）
      
以上属性仅为示例，同学们可以自行扩展。

三、实验过程（核心代码）

1.创建一个窗口， 设置其大小、位置、标题等属性。

  JFrame f = new JFrame();
  
	f.setTitle("选课系统");	  //设置标题为“选课系统”
  
  f.setSize(300, 500);	//设置窗口大小
  
	f.setVisible(true);   //设置窗口为显示
  
	f.setLocationRelativeTo(null);  //设置窗口出现在屏幕中央
  
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //设置关闭窗口
  
	f.setLayout(new FlowLayout(FlowLayout.LEFT));
  
2.创建一个面板，用于存放窗口上的各项组件。

	JPanel p1 = new JPanel();  //创建一个面板
  
	f.add(p1);  //将面板放置在窗口上
  
3.设置姓名输入组件。

	Label l1 = new Label("姓名:");  //设置一个标签为“姓名”
  
	TextField t=new TextField(10);  //添加一个文本框输入姓名
  
  p1.add(l1);  //将标签添加到面板上
  
  p1.add(t);  //将文本框添加到面板上
  
4.设置性别单选组件。

  Label l2 = new Label("性别:");  //设置标签为“性别”
  
  CheckboxGroup cg=new CheckboxGroup();  //添加一个单选组件，同一个单选按钮组的互斥
  
  Checkbox male=new Checkbox("男",cg,false);
  
  Checkbox female=new Checkbox("女",cg,false); 
  
5.设置学号输入组件。

  Label l3 = new Label("学号:");  //设置标签为“学号”
  
  TextField t2=new TextField(10);  //添加一个文本框输入学号
  
6.添加按钮。

  Button b1 = new Button("注册");  //添加一个按钮
  
7.设置监听器。

   b1.addActionListener(new ActionListener() {        // 将按钮添加事件监听器
   
            public void actionPerformed(ActionEvent e) {
            
            	f.setVisible(false);  //将第一个窗口隐藏
              
            	JFrame f2 = new JFrame("选课信息");  //打开第二个窗口
              
            	f2.setSize(700,350);
              
            	f2.setVisible(true);
              
            	f2.setLocationRelativeTo(null); 
        }
        
  });

8.设置选课的复选项。

  Label l2 = new Label("可选课程:");
  
  p6.add(l2);
  
  Checkbox k1 =new Checkbox("高数");
  
  Checkbox k2 =new Checkbox("英语");
  
  p6.add(k1);
  
  p6.add(k2);
  
9.设置显示打印的选课信息组件。

  TextArea area=new TextArea(15,20);   //设置文本域
  
  JScrollPane pane = new JScrollPane(area);  //设置滑动条 
  
10.设置确定按钮及其监听器

  Button b4 = new Button("确定");
  
  b4.addActionListener(new ActionListener() {
  
					public void actionPerformed(ActionEvent e) {
          
						area.setText("选课成功！"+"\n");  //点击确定，则在文本框输出“选课成功！”
            
		 }
     
  });
  
11.设置打印按钮及其监听器

  Button b2 = new Button("打印");
  
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
  
四、运行截图

见上传的图片（注册窗口，选课窗口）

五、流程图

见上传的图片（流程图）

六、编程感想

经过几次的编程，对创建窗口的编写已经比较熟悉。仔细读了书，加上上网查过之后，也掌握了监听器的写法。但对异常处理还不太懂，还得再仔细看看书上的解释及例题。通过这学期对Java的学习，了解了它的基本知识和编程语句，但还只是入门，还不断学习，我会再接再厉的。
