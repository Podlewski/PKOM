package guiLayer;

import logicLayer.LogicLayer;
import logicLayer.LogicLayerException;
import logicLayer.XMLSerializer;

public class Main
{
	public static LogicLayer ll;

	public static void main(String[] args)
	{
		ll = new LogicLayer();
		
		try
		{
			ll.setDataService(XMLSerializer.importData("autosave.xml"));
		}
		catch (LogicLayerException e)
		{
			ExceptionWindow.openWindow(e.getMessage());
		}
		finally
		{			
			MainWindow.openWindow(null);
		}
		
	}

}
