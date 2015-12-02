using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
		Table table=new Table(9,10,true);

		Button button = new Button ();
		button.Label = "1";
		button.Visible = true;
		table.Attach(button, 0, 1, 0, 1);
		table.Visible = true;
		vbox1.Add (table);
		vbox1.Add (button);

		for(unit row=0; row<9; row++)
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
