import java.awt.*;
import java.awt.event.*;
public class Template1 extends Frame
{
Template1()
{
setTitle("ducat programmer");
setBounds(10, 10, 900 , 700);
setVisible(true);
addWindowListener(new Win());
}
class Win extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{dispose();
}}
public static void main(String args[])
{
new Template1();
}}