public class DisplayPanel extends JPanel implements ActionListener //create display panel
{
    private static final long serialVersionUID = 1L;
    private int DisplayWidth = 557; //sudoku display its 557 pixels wide
    private int DisplayHeight = 580; //sudoku display its 580 pixels high
    private int ButtonsWidth = 200; //button panel its 200 pixels wide
    private final Color LB = new Color(0xAD,0xD8, 0xE6);  //Light Blue 
    private final Color DB = new Color(0x1E,0x90, 0xFF);  //dodger blue
    private final Color P = new Color(0x80,0, 0x80);  //purple blank number 
   
    public DisplayPanel()   //construct the sudoku display panel
    {       
        addMouseListener(new MouseAdapter() //we listen for mouse clicks on this panel
        {
            public void mousePressed(MouseEvent e) 
            {            
                selectNumber(e.getX(),e.getY());   //the called method on mouse click          
            }//end of mouse select
        });//end of mouse listener
        this.setLayout(new BorderLayout());
        
        JPanel pb = new JPanel();   //create the button panel
        pb.setPreferredSize(new Dimension(ButtonsWidth,DisplayHeight));
        pb.setBackground(LB);
        
        FlowLayout FL = new FlowLayout();
        FL.setVgap(55);
        FL.setHgap(100);  //set the flow layout to give  symmetric display
        pb.setLayout(FL); 
        SButton EYS = new SButton("Enter Your Sudoku", "EYS");
        EYS.addActionListener(this);
        pb.add(EYS);
        SButton SHS = new SButton("Start Hard Sudoku", "SHS");
        SHS.addActionListener(this);
        pb.add(SHS);
        SButton SMS = new SButton("Start Medium Sudoku", "SMS");
        SMS.addActionListener(this);
        pb.add(SMS);
        SButton SES = new SButton("Start Easy Sudoku", "SES");
        SES.addActionListener(this);
        pb.add(SES);
        SButton GBS = new SButton("Go Back One Step", "GBS");
        GBS.addActionListener(this);
        pb.add(GBS);
        SButton STS = new SButton("Solve This Sudoku", "STS");
        STS.addActionListener(this);
        pb.add(STS);
        this.add(pb,BorderLayout.WEST); //add the push button panel to the display panel       
    }//end of constructor
}//end of my display panel class
