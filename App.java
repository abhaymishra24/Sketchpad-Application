
       import java.awt.event.*;

import java.awt.*;

class sketch_pad extends Frame implements ActionListener,WindowListener,MouseListener,MouseMotionListener,ItemListener

{
  String selected_shape = new String ("Square");
  String selected_color = new String ("Blue");
  boolean Eraser = false ;
  int up_L_X, up_L_Y, W, H, sel_xl,sel_yl,sel_x2,sel_y2;
  String [] extras_list = {"Clear Canvas","Eraser"};
  String [] color_list = {"Black","Cyan","Green","Yellow","Magenta","Red","Blue"};
  String [] shape_list = {"Line","Rectangle","Square","Circle"};
  public void windowClosing(WindowEvent eve) {System.exit(0);
  }

  public void windowActivated(WindowEvent eve) { }
  public void windowOpened(WindowEvent eve) { }
  public void windowIconified(WindowEvent eve) { }
  public void windowClosed(WindowEvent eve) { }
  public void windowDeactivated(WindowEvent eve) { }
  public void windowDeiconified(WindowEvent eve) { }
  public void mouseMoved(MouseEvent mouse_mov_eve) { }
  public void mouseClicked(MouseEvent mouse_clicked_eve) { }
  public void mouseExited(MouseEvent mouse_exited_eve) { }
  public void mouseEntered(MouseEvent mouse_entered_eve) { }
  public void itemStateChanged(ItemEvent item_state_chng_eve) { }

  public sketch_pad(String str)
  {
    super (str);
    addMouseMotionListener(this);
    addWindowListener(this);
      addMouseListener(this);
      setLayout(null);
    set_menu_items();
    setBackground(Color.white);
  }




}


