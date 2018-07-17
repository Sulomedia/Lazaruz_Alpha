package lazaruz.win;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("lazaruz.win", "lazaruz.win.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "lazaruz.win.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 1024, 768);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.ProgressIndicatorWrapper.ProgressBarWrapper _pb1 = null;
public static anywheresoftware.b4j.objects.ProgressIndicatorWrapper _pb2 = null;
public static anywheresoftware.b4j.objects.WebViewWrapper _web = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _tf1 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _ed1 = null;
public static String _data1 = "";
public static String _data2 = "";
public static anywheresoftware.b4j.objects.ButtonWrapper _bback = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _bfor = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _bhome = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _menu = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _downloadbutton = null;
public static anywheresoftware.b4j.objects.LabelWrapper _status = null;
public static String _startpage = "";
public static String _sulo = "";
public static anywheresoftware.b4a.objects.collections.List _lis = null;
public static anywheresoftware.b4j.object.JavaObject _we = null;
public static anywheresoftware.b4j.object.JavaObject _temp = null;
public static anywheresoftware.b4j.object.JavaObject _doc = null;
public static lazaruz.win.keyvaluestore _database = null;
public static anywheresoftware.b4a.http.HttpClientWrapper _httpc = null;
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper _net = null;
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _netreq = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _menulist = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _list1 = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _sp1 = null;
public static anywheresoftware.b4j.object.JavaObject _manager = null;
public static anywheresoftware.b4j.object.JavaObject _handler = null;
public static jScriptEngine.jScriptEngine _js = null;
public static int _mousex = 0;
public static int _mousey = 0;
public static anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _mc = null;
public static anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _ml = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _cancel = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _reload = null;
public static String _dlloc = "";
public static anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _dlinfo = null;
public static anywheresoftware.b4j.objects.FileChooserWrapper _filo = null;
public static anywheresoftware.b4j.objects.HyperlinkLabelWrapper _hlink = null;
public static anywheresoftware.b4j.objects.ProgressIndicatorWrapper.ProgressBarWrapper _pbd = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _dp = null;
public static anywheresoftware.b4j.objects.LabelWrapper _dlab = null;
public static anywheresoftware.b4j.objects.LabelWrapper _sl = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _setp = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _settings = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _os = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _hb = null;
public static lazaruz.win.strings _strings = null;
public static lazaruz.win.httputils2service _httputils2service = null;
public static lazaruz.win.downloadservice _downloadservice = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 119;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
anywheresoftware.b4j.objects.JFX.ScreenWrapper _ps = null;
 //BA.debugLineNum = 55;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 56;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 57;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\") 'Load the layou";
_mainform.getRootPane().LoadLayout(ba,"1");
 //BA.debugLineNum = 58;BA.debugLine="MainForm.Title=\"Lazaruz(Alpha 1)\"";
_mainform.setTitle("Lazaruz(Alpha 1)");
 //BA.debugLineNum = 59;BA.debugLine="pb2.Visible=False";
_pb2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 60;BA.debugLine="pbd.Initialize(\"pbd\")";
_pbd.Initialize(ba,"pbd");
 //BA.debugLineNum = 61;BA.debugLine="dlab.Initialize(\"dlab\")";
_dlab.Initialize(ba,"dlab");
 //BA.debugLineNum = 62;BA.debugLine="dlab.TextSize=12";
_dlab.setTextSize(12);
 //BA.debugLineNum = 63;BA.debugLine="dlab.TextColor=fx.Colors.White";
_dlab.setTextColor(_fx.Colors.White);
 //BA.debugLineNum = 64;BA.debugLine="sl.Initialize(\"sl\")";
_sl.Initialize(ba,"sl");
 //BA.debugLineNum = 65;BA.debugLine="ed1.Initialize(\"ed\")";
_ed1.Initialize(ba,"ed");
 //BA.debugLineNum = 66;BA.debugLine="dp.AddNode(pbd,100dip,5dip,180dip,5dip)";
_dp.AddNode((javafx.scene.Node)(_pbd.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (180)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)));
 //BA.debugLineNum = 67;BA.debugLine="dp.AddNode(dlab,10dip,5dip,80dip,10dip)";
_dp.AddNode((javafx.scene.Node)(_dlab.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
 //BA.debugLineNum = 68;BA.debugLine="dp.Visible=False";
_dp.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 69;BA.debugLine="database.Initialize(File.DirApp,\"database_1\")";
_database._initialize(ba,anywheresoftware.b4a.keywords.Common.File.getDirApp(),"database_1");
 //BA.debugLineNum = 70;BA.debugLine="httpC.InitializeAcceptAll(\"httpC\")";
_httpc.InitializeAcceptAll("httpC");
 //BA.debugLineNum = 71;BA.debugLine="net.InitializeAcceptAll(\"net\")";
_net.InitializeAcceptAll("net");
 //BA.debugLineNum = 72;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 73;BA.debugLine="lis.Initialize";
_lis.Initialize();
 //BA.debugLineNum = 74;BA.debugLine="list1.Initialize(\"list\")";
_list1.Initialize(ba,"list");
 //BA.debugLineNum = 75;BA.debugLine="hb.Initialize(\"hb\")";
_hb.Initialize(ba,"hb");
 //BA.debugLineNum = 76;BA.debugLine="Settings.AddNode(sl,20dip,20dip,150dip,20dip)";
_settings.AddNode((javafx.scene.Node)(_sl.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 //BA.debugLineNum = 77;BA.debugLine="Settings.AddNode(ed1,20dip,60dip,250dip,20dip)";
_settings.AddNode((javafx.scene.Node)(_ed1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (250)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 //BA.debugLineNum = 78;BA.debugLine="Settings.AddNode(hb,270dip,60dip,20dip,20dip)";
_settings.AddNode((javafx.scene.Node)(_hb.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (270)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 //BA.debugLineNum = 79;BA.debugLine="Settings.AddNode(list1,20dip,85dip,250dip,200dip)";
_settings.AddNode((javafx.scene.Node)(_list1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (250)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)));
 //BA.debugLineNum = 80;BA.debugLine="we.InitializeNewInstance(\"javafx.scene.web.WebEng";
_we.InitializeNewInstance("javafx.scene.web.WebEngine",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 81;BA.debugLine="doc.InitializeStatic(\"org.w3c.dom.Document\")";
_doc.InitializeStatic("org.w3c.dom.Document");
 //BA.debugLineNum = 82;BA.debugLine="manager.InitializeNewInstance(\"java.net.CookieMan";
_manager.InitializeNewInstance("java.net.CookieManager",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 83;BA.debugLine="handler.InitializeStatic(\"java.net.CookieHandler\"";
_handler.InitializeStatic("java.net.CookieHandler").RunMethod("setDefault",new Object[]{(Object)(_manager.getObject())});
 //BA.debugLineNum = 84;BA.debugLine="hlink.Initialize(\"hlink\")";
_hlink.Initialize(ba,"hlink");
 //BA.debugLineNum = 85;BA.debugLine="temp = web";
_temp.setObject((java.lang.Object)(_web.getObject()));
 //BA.debugLineNum = 86;BA.debugLine="we = temp.RunMethod(\"getEngine\",Null)";
_we.setObject((java.lang.Object)(_temp.RunMethod("getEngine",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 87;BA.debugLine="filo.Initialize";
_filo.Initialize();
 //BA.debugLineNum = 88;BA.debugLine="Log(fx.PrimaryScreen.MaxX * Density)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_fx.getPrimaryScreen().getMaxX()*anywheresoftware.b4a.keywords.Common.Density));
 //BA.debugLineNum = 89;BA.debugLine="Log(fx.PrimaryScreen.MaxY * Density)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_fx.getPrimaryScreen().getMaxY()*anywheresoftware.b4a.keywords.Common.Density));
 //BA.debugLineNum = 90;BA.debugLine="Dim ps As Screen = fx.PrimaryScreen";
_ps = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_ps = _fx.getPrimaryScreen();
 //BA.debugLineNum = 91;BA.debugLine="MainForm.WindowLeft = ps.MinX";
_mainform.setWindowLeft(_ps.getMinX());
 //BA.debugLineNum = 92;BA.debugLine="MainForm.WindowWidth = ps.MaxX - ps.MinX";
_mainform.setWindowWidth(_ps.getMaxX()-_ps.getMinX());
 //BA.debugLineNum = 93;BA.debugLine="MainForm.WindowTop = ps.MinY";
_mainform.setWindowTop(_ps.getMinY());
 //BA.debugLineNum = 94;BA.debugLine="MainForm.WindowHeight = ps.MaxY - ps.MinY";
_mainform.setWindowHeight(_ps.getMaxY()-_ps.getMinY());
 //BA.debugLineNum = 97;BA.debugLine="MainForm.Resizable=True";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 98;BA.debugLine="MainForm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
_mainform.getRootPane().setMouseCursor(_fx.Cursors.DEFAULT);
 //BA.debugLineNum = 99;BA.debugLine="MainForm.SetFormStyle(\"DECORATED\")";
_mainform.SetFormStyle("DECORATED");
 //BA.debugLineNum = 100;BA.debugLine="database.PutSimple(\"o\",startPage)";
_database._putsimple("o",(Object)(_startpage));
 //BA.debugLineNum = 101;BA.debugLine="tf1.RequestFocus";
_tf1.RequestFocus();
 //BA.debugLineNum = 103;BA.debugLine="setP.Visible=False";
_setp.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 104;BA.debugLine="os.Visible=False";
_os.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 106;BA.debugLine="Log(data2)";
anywheresoftware.b4a.keywords.Common.Log(_data2);
 //BA.debugLineNum = 107;BA.debugLine="lis.Initialize";
_lis.Initialize();
 //BA.debugLineNum = 108;BA.debugLine="lis.Add(data2)";
_lis.Add((Object)(_data2));
 //BA.debugLineNum = 109;BA.debugLine="menu_start";
_menu_start();
 //BA.debugLineNum = 110;BA.debugLine="menu_Action";
_menu_action();
 //BA.debugLineNum = 112;BA.debugLine="file_check";
_file_check();
 //BA.debugLineNum = 113;BA.debugLine="pb2.Progress=-1";
_pb2.setProgress(-1);
 //BA.debugLineNum = 114;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public static String  _bback_action() throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Sub bback_Action";
 //BA.debugLineNum = 351;BA.debugLine="we.RunMethod(\"executeScript\",Array As Object(\"his";
_we.RunMethod("executeScript",new Object[]{(Object)("history.back()")});
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return "";
}
public static String  _bfor_action() throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub Bfor_Action";
 //BA.debugLineNum = 347;BA.debugLine="we.RunMethod(\"executeScript\",Array As Object(\"his";
_we.RunMethod("executeScript",new Object[]{(Object)("history.forward()")});
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return "";
}
public static String  _bhome_action() throws Exception{
String _uspage = "";
 //BA.debugLineNum = 333;BA.debugLine="Sub Bhome_Action";
 //BA.debugLineNum = 334;BA.debugLine="Dim uspage As String";
_uspage = "";
 //BA.debugLineNum = 335;BA.debugLine="uspage=database.GetSimple(\"us\")";
_uspage = _database._getsimple("us");
 //BA.debugLineNum = 337;BA.debugLine="tf1.Text=uspage";
_tf1.setText(_uspage);
 //BA.debugLineNum = 338;BA.debugLine="status.Text=\"lade \"&uspage&\" (Startseite)\"";
_status.setText("lade "+_uspage+" (Startseite)");
 //BA.debugLineNum = 339;BA.debugLine="we.RunMethod(\"load\",Array As Object(uspage))";
_we.RunMethod("load",new Object[]{(Object)(_uspage)});
 //BA.debugLineNum = 340;BA.debugLine="Log(uspage&\" Startpage set\")";
anywheresoftware.b4a.keywords.Common.Log(_uspage+" Startpage set");
 //BA.debugLineNum = 341;BA.debugLine="tf1.Text=uspage";
_tf1.setText(_uspage);
 //BA.debugLineNum = 342;BA.debugLine="MainForm.Title=uspage";
_mainform.setTitle(_uspage);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return "";
}
public static String  _cancel_action() throws Exception{
String _rl = "";
 //BA.debugLineNum = 414;BA.debugLine="Sub cancel_Action";
 //BA.debugLineNum = 415;BA.debugLine="Dim rl As String";
_rl = "";
 //BA.debugLineNum = 416;BA.debugLine="rl=File.ReadString(File.DirApp,\"d1.txt\")";
_rl = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"d1.txt");
 //BA.debugLineNum = 417;BA.debugLine="status.Text=\"Abgebrochen...\"&rl";
_status.setText("Abgebrochen..."+_rl);
 //BA.debugLineNum = 418;BA.debugLine="pb2.SetAlphaAnimated(200,0)";
_pb2.SetAlphaAnimated((int) (200),0);
 //BA.debugLineNum = 419;BA.debugLine="pb2.Visible=False";
_pb2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return "";
}
public static String  _close_sub() throws Exception{
int _res = 0;
 //BA.debugLineNum = 129;BA.debugLine="Sub close_sub";
 //BA.debugLineNum = 130;BA.debugLine="Dim res As Int";
_res = 0;
 //BA.debugLineNum = 131;BA.debugLine="res=fx.Msgbox2(MainForm,\"Programm beenden?\",\"Bee";
_res = _fx.Msgbox2(_mainform,"Programm beenden?","Beenden?","Ja","","Nein",_fx.MSGBOX_CONFIRMATION);
 //BA.debugLineNum = 132;BA.debugLine="If res=fx.DialogResponse.NEGATIVE Then";
if (_res==_fx.DialogResponse.NEGATIVE) { 
 //BA.debugLineNum = 133;BA.debugLine="menu_Action";
_menu_action();
 //BA.debugLineNum = 134;BA.debugLine="menulist.ClearSelection";
_menulist.ClearSelection();
 }else {
 //BA.debugLineNum = 137;BA.debugLine="MainForm.Close";
_mainform.Close();
 };
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public static String  _dd_complete(lazaruz.win.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 444;BA.debugLine="Sub dd_complete(Job As HttpJob)";
 //BA.debugLineNum = 445;BA.debugLine="Log(\"Job result for JobName = \" & Job.JobName & \"";
anywheresoftware.b4a.keywords.Common.Log("Job result for JobName = "+_job._jobname+", Success = "+BA.ObjectToString(_job._success));
 //BA.debugLineNum = 446;BA.debugLine="If Job.Success = True Then";
if (_job._success==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 447;BA.debugLine="Try";
try { //BA.debugLineNum = 448;BA.debugLine="Dim out As OutputStream = File.OpenOutput(datab";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_database._getsimple("d"),_database._getsimple("lo"),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 449;BA.debugLine="File.Copy2(Job.GetInputStream, out)";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_job._getinputstream().getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 450;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 451;BA.debugLine="Log(\"Job Done. Local file created: \" & Job.JobN";
anywheresoftware.b4a.keywords.Common.Log("Job Done. Local file created: "+_job._jobname+" ("+_database._getsimple("d")+")");
 //BA.debugLineNum = 452;BA.debugLine="Log(\"File Dir:\" & database.GetSimple(\"d\"))";
anywheresoftware.b4a.keywords.Common.Log("File Dir:"+_database._getsimple("d"));
 //BA.debugLineNum = 453;BA.debugLine="Log(\"File Name: \" & File.GetName(dlloc))";
anywheresoftware.b4a.keywords.Common.Log("File Name: "+anywheresoftware.b4a.keywords.Common.File.GetName(_dlloc));
 //BA.debugLineNum = 454;BA.debugLine="Log(\"File Size: \" & File.Size(File.DirApp, File";
anywheresoftware.b4a.keywords.Common.Log("File Size: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.File.Size(anywheresoftware.b4a.keywords.Common.File.getDirApp(),anywheresoftware.b4a.keywords.Common.File.GetName(_database._getsimple("lo")))));
 //BA.debugLineNum = 455;BA.debugLine="status.Text=\"Download 100%\"";
_status.setText("Download 100%");
 //BA.debugLineNum = 456;BA.debugLine="dp.SetAlphaAnimated(400,0)";
_dp.SetAlphaAnimated((int) (400),0);
 //BA.debugLineNum = 457;BA.debugLine="dp.Visible=False";
_dp.setVisible(anywheresoftware.b4a.keywords.Common.False);
 } 
       catch (Exception e15) {
			ba.setLastException(e15); //BA.debugLineNum = 459;BA.debugLine="Log(\"Job Error. Can not create local file: \" &";
anywheresoftware.b4a.keywords.Common.Log("Job Error. Can not create local file: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
 }else {
 //BA.debugLineNum = 463;BA.debugLine="Log(\"Job Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("Job Error: "+_job._errormessage);
 };
 //BA.debugLineNum = 465;BA.debugLine="Job.Release";
_job._release();
 //BA.debugLineNum = 466;BA.debugLine="End Sub";
return "";
}
public static String  _dd_progress(long _progress,long _total) throws Exception{
 //BA.debugLineNum = 432;BA.debugLine="Sub dd_Progress(Progress As Long, Total As Long)";
 //BA.debugLineNum = 435;BA.debugLine="pbd.Progress= Progress / Total";
_pbd.setProgress(_progress/(double)_total);
 //BA.debugLineNum = 436;BA.debugLine="status.Text=NumberFormat(Progress / 1024, 0, 0) &";
_status.setText(anywheresoftware.b4a.keywords.Common.NumberFormat(_progress/(double)1024,(int) (0),(int) (0))+"KB / "+anywheresoftware.b4a.keywords.Common.NumberFormat(_total/(double)1024,(int) (0),(int) (0))+"KB");
 //BA.debugLineNum = 438;BA.debugLine="dlab.Text=NumberFormat(Progress / 1024, 0, 0) & \"";
_dlab.setText(anywheresoftware.b4a.keywords.Common.NumberFormat(_progress/(double)1024,(int) (0),(int) (0))+"KB / "+anywheresoftware.b4a.keywords.Common.NumberFormat(_total/(double)1024,(int) (0),(int) (0))+"KB");
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return "";
}
public static String  _downloadbutton_start() throws Exception{
int _res = 0;
 //BA.debugLineNum = 467;BA.debugLine="Sub downloadButton_start";
 //BA.debugLineNum = 468;BA.debugLine="dlinfo.DialogType=\"QUESTION\"";
_dlinfo.setDialogType("QUESTION");
 //BA.debugLineNum = 469;BA.debugLine="Dim res As Int";
_res = 0;
 //BA.debugLineNum = 470;BA.debugLine="res=dlinfo.Show2(\"Download Data from: \"&dlloc,Mai";
_res = _dlinfo.Show2("Download Data from: "+_dlloc,_mainform.getTitle(),"Speichern","cancel","");
 //BA.debugLineNum = 471;BA.debugLine="If res = fx.DialogResponse.POSITIVE Then";
if (_res==_fx.DialogResponse.POSITIVE) { 
 //BA.debugLineNum = 472;BA.debugLine="folder_select";
_folder_select();
 };
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return "";
}
public static String  _ed_action() throws Exception{
String _dt = "";
 //BA.debugLineNum = 520;BA.debugLine="Sub ed_Action";
 //BA.debugLineNum = 521;BA.debugLine="Dim dt As String = database.GetSimple(\"us\")";
_dt = _database._getsimple("us");
 //BA.debugLineNum = 522;BA.debugLine="list1.Items.Add(dt)";
_list1.getItems().Add((Object)(_dt));
 //BA.debugLineNum = 523;BA.debugLine="list1.SelectedIndex=-1";
_list1.setSelectedIndex((int) (-1));
 //BA.debugLineNum = 524;BA.debugLine="we.RunMethod(\"load\",Array As Object(dt))";
_we.RunMethod("load",new Object[]{(Object)(_dt)});
 //BA.debugLineNum = 525;BA.debugLine="tf1.Text=dt";
_tf1.setText(_dt);
 //BA.debugLineNum = 526;BA.debugLine="MainForm.Title=dt";
_mainform.setTitle(_dt);
 //BA.debugLineNum = 527;BA.debugLine="End Sub";
return "";
}
public static String  _ed_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 508;BA.debugLine="Sub ed_TextChanged (Old As String, New As String)";
 //BA.debugLineNum = 509;BA.debugLine="database.PutSimple(\"us\",New)";
_database._putsimple("us",(Object)(_new));
 //BA.debugLineNum = 511;BA.debugLine="If  New.Contains(\"https://\") Then";
if (_new.contains("https://")) { 
 //BA.debugLineNum = 512;BA.debugLine="If database.ContainsKey(\"us\") Then";
if (_database._containskey("us")) { 
 //BA.debugLineNum = 513;BA.debugLine="database.Remove(\"us\")";
_database._remove("us");
 //BA.debugLineNum = 514;BA.debugLine="database.PutSimple(\"us\",New)";
_database._putsimple("us",(Object)(_new));
 };
 }else {
 //BA.debugLineNum = 517;BA.debugLine="database.PutSimple(\"us\",\"https://www.\"&New)";
_database._putsimple("us",(Object)("https://www."+_new));
 };
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
return "";
}
public static String  _file_check() throws Exception{
String _uspage = "";
 //BA.debugLineNum = 140;BA.debugLine="Sub file_check";
 //BA.debugLineNum = 141;BA.debugLine="Dim uspage As String";
_uspage = "";
 //BA.debugLineNum = 142;BA.debugLine="If database.ContainsKey(\"l\") Then";
if (_database._containskey("l")) { 
 //BA.debugLineNum = 143;BA.debugLine="tf1.Text=database.GetSimple(\"l\")";
_tf1.setText(_database._getsimple("l"));
 }else {
 //BA.debugLineNum = 145;BA.debugLine="database.PutSimple(\"o\",startPage)";
_database._putsimple("o",(Object)(_startpage));
 //BA.debugLineNum = 146;BA.debugLine="tf1.Text=database.GetSimple(\"h\")";
_tf1.setText(_database._getsimple("h"));
 };
 //BA.debugLineNum = 148;BA.debugLine="If database.ContainsKey(\"us\") Then";
if (_database._containskey("us")) { 
 //BA.debugLineNum = 149;BA.debugLine="uspage=database.GetSimple(\"us\")";
_uspage = _database._getsimple("us");
 //BA.debugLineNum = 150;BA.debugLine="Log(uspage&\" Startpage set\")";
anywheresoftware.b4a.keywords.Common.Log(_uspage+" Startpage set");
 //BA.debugLineNum = 151;BA.debugLine="tf1.Text=uspage";
_tf1.setText(_uspage);
 //BA.debugLineNum = 152;BA.debugLine="MainForm.Title=uspage";
_mainform.setTitle(_uspage);
 }else {
 //BA.debugLineNum = 154;BA.debugLine="we.RunMethod(\"load\",Array As Object(startPage))";
_we.RunMethod("load",new Object[]{(Object)(_startpage)});
 //BA.debugLineNum = 155;BA.debugLine="tf1.Text=startPage";
_tf1.setText(_startpage);
 //BA.debugLineNum = 156;BA.debugLine="status.Text=\"lade \"&startPage&\" (Startseite)\"";
_status.setText("lade "+_startpage+" (Startseite)");
 //BA.debugLineNum = 157;BA.debugLine="MainForm.Title=startPage";
_mainform.setTitle(_startpage);
 //BA.debugLineNum = 158;BA.debugLine="uspage=startPage";
_uspage = _startpage;
 };
 //BA.debugLineNum = 160;BA.debugLine="web.RequestFocus";
_web.RequestFocus();
 //BA.debugLineNum = 161;BA.debugLine="we.RunMethod(\"load\",Array As Object(uspage))";
_we.RunMethod("load",new Object[]{(Object)(_uspage)});
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public static String  _folder_select() throws Exception{
anywheresoftware.b4j.objects.FileChooserWrapper _fo = null;
String _ds = "";
 //BA.debugLineNum = 477;BA.debugLine="Sub folder_select";
 //BA.debugLineNum = 478;BA.debugLine="Dim fo As FileChooser";
_fo = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 479;BA.debugLine="fo.Initialize";
_fo.Initialize();
 //BA.debugLineNum = 480;BA.debugLine="If File.IsDirectory(\"C:\\Downloads\\\",\"dl.txt\") The";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory("C:\\Downloads\\","dl.txt")) { 
 }else {
 //BA.debugLineNum = 483;BA.debugLine="fo.InitialDirectory=\"C:\\Downloads\"";
_fo.setInitialDirectory("C:\\Downloads");
 //BA.debugLineNum = 484;BA.debugLine="Dim ds = fo.ShowSave(MainForm) As String";
_ds = _fo.ShowSave(_mainform);
 //BA.debugLineNum = 485;BA.debugLine="database.PutSimple(\"d\",ds.SubString2(0,ds.LastIn";
_database._putsimple("d",(Object)(_ds.substring((int) (0),(int) (_ds.lastIndexOf("\\")+1))));
 //BA.debugLineNum = 486;BA.debugLine="Log(\"Path: \"&database.GetSimple(\"d\"))";
anywheresoftware.b4a.keywords.Common.Log("Path: "+_database._getsimple("d"));
 };
 //BA.debugLineNum = 489;BA.debugLine="j_download";
_j_download();
 //BA.debugLineNum = 490;BA.debugLine="End Sub";
return "";
}
public static String  _his_selectedindexchanged(int _index,Object _value) throws Exception{
String _s = "";
 //BA.debugLineNum = 367;BA.debugLine="Sub his_SelectedIndexChanged(Index As Int, Value A";
 //BA.debugLineNum = 368;BA.debugLine="Dim s As String = Value";
_s = BA.ObjectToString(_value);
 //BA.debugLineNum = 369;BA.debugLine="we.RunMethod(\"load\",Array As Object(s))";
_we.RunMethod("load",new Object[]{(Object)(_s)});
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return "";
}
public static String  _info_p() throws Exception{
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _im = null;
String _name = "";
String _version = "";
String _inf = "";
String _text1 = "";
 //BA.debugLineNum = 372;BA.debugLine="Sub info_p";
 //BA.debugLineNum = 373;BA.debugLine="Dim im As Msgboxes";
_im = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 374;BA.debugLine="Dim name,version,inf As String";
_name = "";
_version = "";
_inf = "";
 //BA.debugLineNum = 375;BA.debugLine="Dim text1 As String";
_text1 = "";
 //BA.debugLineNum = 376;BA.debugLine="menu_Action";
_menu_action();
 //BA.debugLineNum = 377;BA.debugLine="name=\"Lazaruz\"";
_name = "Lazaruz";
 //BA.debugLineNum = 378;BA.debugLine="version=\"0.3\"";
_version = "0.3";
 //BA.debugLineNum = 379;BA.debugLine="inf=\"Dieses Programm wurde mit Basic erstellt und";
_inf = "Dieses Programm wurde mit Basic erstellt und in Java geschrieben."+anywheresoftware.b4a.keywords.Common.CRLF+"Basic, Java und Code Implimentation (D.Trojan)."+anywheresoftware.b4a.keywords.Common.CRLF+"Design und Storage (H.Feustel)"+anywheresoftware.b4a.keywords.Common.CRLF+_name+", "+_version+" - ©2018 SuloMedia";
 //BA.debugLineNum = 380;BA.debugLine="text1=inf";
_text1 = _inf;
 //BA.debugLineNum = 381;BA.debugLine="im.Show(text1,\"Programm Info:\")";
_im.Show(_text1,"Programm Info:");
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return "";
}
public static String  _j_download() throws Exception{
lazaruz.win.downloadservice._downloaddata _dd = null;
 //BA.debugLineNum = 422;BA.debugLine="Sub j_download";
 //BA.debugLineNum = 423;BA.debugLine="Dim dd As DownloadData";
_dd = new lazaruz.win.downloadservice._downloaddata();
 //BA.debugLineNum = 424;BA.debugLine="dd.url = dlloc";
_dd.url = _dlloc;
 //BA.debugLineNum = 425;BA.debugLine="dd.EventName = \"dd\"";
_dd.EventName = "dd";
 //BA.debugLineNum = 426;BA.debugLine="dd.Target = Me";
_dd.Target = main.getObject();
 //BA.debugLineNum = 427;BA.debugLine="CallSubDelayed2(DownloadService, \"StartDownload\",";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba,(Object)(_downloadservice.getObject()),"StartDownload",(Object)(_dd));
 //BA.debugLineNum = 428;BA.debugLine="dp.Visible=True";
_dp.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return "";
}
public static String  _link_fill() throws Exception{
int _i = 0;
 //BA.debugLineNum = 384;BA.debugLine="Sub link_fill";
 //BA.debugLineNum = 385;BA.debugLine="For i = 0 To lis.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (_lis.getSize()-1);
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
 //BA.debugLineNum = 387;BA.debugLine="Log(lis.Get(i))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_lis.Get(_i)));
 }
};
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return "";
}
public static String  _links_click(String _link) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub links_Click (link As String)";
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return "";
}
public static String  _list1_selectedindexchanged(int _index) throws Exception{
int _i = 0;
String _dt = "";
 //BA.debugLineNum = 529;BA.debugLine="Sub list1_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 532;BA.debugLine="For i = 0 To list1.items.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (_list1.getItems().getSize()-1);
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
 //BA.debugLineNum = 534;BA.debugLine="Log(list1.Items.Get(i))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_list1.getItems().Get(_i)));
 //BA.debugLineNum = 535;BA.debugLine="If Index=i Then";
if (_index==_i) { 
 //BA.debugLineNum = 536;BA.debugLine="Dim dt As String =list1.items.get(i)";
_dt = BA.ObjectToString(_list1.getItems().Get(_i));
 };
 }
};
 //BA.debugLineNum = 540;BA.debugLine="we.RunMethod(\"load\",Array As Object(dt))";
_we.RunMethod("load",new Object[]{(Object)(_dt)});
 //BA.debugLineNum = 541;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub Mainform_CloseRequest (EventData As Event)";
 //BA.debugLineNum = 123;BA.debugLine="Log(\"CloseRequest- \"&EventData)";
anywheresoftware.b4a.keywords.Common.Log("CloseRequest- "+BA.ObjectToString(_eventdata));
 //BA.debugLineNum = 124;BA.debugLine="EventData.Consume";
_eventdata.Consume();
 //BA.debugLineNum = 125;BA.debugLine="MainForm.Close";
_mainform.Close();
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public static String  _mb1_action() throws Exception{
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
 //BA.debugLineNum = 248;BA.debugLine="Sub mb1_Action";
 //BA.debugLineNum = 249;BA.debugLine="Dim mi As MenuItem = Sender";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
 //BA.debugLineNum = 250;BA.debugLine="If mi.Text=\"_Beenden\" Then";
if ((_mi.getText()).equals("_Beenden")) { 
 //BA.debugLineNum = 251;BA.debugLine="MainForm.Close";
_mainform.Close();
 };
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return "";
}
public static String  _mb1_selectedchange(boolean _selected) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub mb1_SelectedChange (Selected As Boolean)";
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public static String  _menu_action() throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub menu_Action";
 //BA.debugLineNum = 355;BA.debugLine="menulist.ClearSelection";
_menulist.ClearSelection();
 //BA.debugLineNum = 356;BA.debugLine="If sp1.Visible=False Then";
if (_sp1.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 357;BA.debugLine="sp1.SetAlphaAnimated(300,1)";
_sp1.SetAlphaAnimated((int) (300),1);
 //BA.debugLineNum = 358;BA.debugLine="sp1.Visible=True";
_sp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 360;BA.debugLine="If sp1.Visible=True Then";
if (_sp1.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 361;BA.debugLine="sp1.SetAlphaAnimated(300,0)";
_sp1.SetAlphaAnimated((int) (300),0);
 //BA.debugLineNum = 362;BA.debugLine="sp1.Visible=False";
_sp1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 };
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return "";
}
public static String  _menu_start() throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub menu_start";
 //BA.debugLineNum = 165;BA.debugLine="menulist.Items.Add(\"Einstellungen\")";
_menulist.getItems().Add((Object)("Einstellungen"));
 //BA.debugLineNum = 166;BA.debugLine="menulist.Items.Add(\"Info\")";
_menulist.getItems().Add((Object)("Info"));
 //BA.debugLineNum = 167;BA.debugLine="menulist.Items.Add(\"Beenden\")";
_menulist.getItems().Add((Object)("Beenden"));
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public static String  _menulist_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub menulist_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 171;BA.debugLine="If Index=2 Then";
if (_index==2) { 
 //BA.debugLineNum = 172;BA.debugLine="close_sub";
_close_sub();
 };
 //BA.debugLineNum = 174;BA.debugLine="If Index=1 Then";
if (_index==1) { 
 //BA.debugLineNum = 175;BA.debugLine="info_p";
_info_p();
 };
 //BA.debugLineNum = 177;BA.debugLine="If Index=0 Then";
if (_index==0) { 
 //BA.debugLineNum = 178;BA.debugLine="settings_set";
_settings_set();
 };
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public static String  _ml_action() throws Exception{
 //BA.debugLineNum = 395;BA.debugLine="Sub ml_Action";
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return "";
}
public static String  _net_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub net_ResponseError (Response As OkHttpResponse,";
 //BA.debugLineNum = 293;BA.debugLine="Log(\"Netstat - \"&Reason&\" - \"&StatusCode)";
anywheresoftware.b4a.keywords.Common.Log("Netstat - "+_reason+" - "+BA.NumberToString(_statuscode));
 //BA.debugLineNum = 294;BA.debugLine="fx.Msgbox(MainForm,\"HTTP error 404 No Network or";
_fx.Msgbox(_mainform,"HTTP error 404 No Network or Internet detectet","Ferhler 404: Netzwerk");
 //BA.debugLineNum = 295;BA.debugLine="status.Text=\"Error HTTP 404 (No Network?)\"";
_status.setText("Error HTTP 404 (No Network?)");
 //BA.debugLineNum = 296;BA.debugLine="pb2.SetAlphaAnimated(400,0)";
_pb2.SetAlphaAnimated((int) (400),0);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return "";
}
public static String  _net_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub net_ResponseSuccess (Response As OkHttpRespons";
 //BA.debugLineNum = 287;BA.debugLine="Log(\"Netstat - \"&Response.ContentType)";
anywheresoftware.b4a.keywords.Common.Log("Netstat - "+_response.getContentType());
 //BA.debugLineNum = 288;BA.debugLine="Response.Release";
_response.Release();
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return "";
}
public static String  _os_action() throws Exception{
 //BA.debugLineNum = 543;BA.debugLine="Sub os_Action";
 //BA.debugLineNum = 544;BA.debugLine="If setP.Visible=True Then";
if (_setp.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 545;BA.debugLine="setP.SetAlphaAnimated(450,0)";
_setp.SetAlphaAnimated((int) (450),0);
 //BA.debugLineNum = 546;BA.debugLine="setP.Visible=False";
_setp.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 547;BA.debugLine="os.Visible=False";
_os.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 550;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
strings._process_globals();
httputils2service._process_globals();
downloadservice._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 9;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 11;BA.debugLine="Private Pb1 As ProgressBar";
_pb1 = new anywheresoftware.b4j.objects.ProgressIndicatorWrapper.ProgressBarWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private pb2 As ProgressIndicator";
_pb2 = new anywheresoftware.b4j.objects.ProgressIndicatorWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private web As WebView";
_web = new anywheresoftware.b4j.objects.WebViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private tf1,ed1 As TextField";
_tf1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
_ed1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private	data1, data2 As String";
_data1 = "";
_data2 = "";
 //BA.debugLineNum = 16;BA.debugLine="Private bback As Button";
_bback = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private Bfor As Button";
_bfor = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private Bhome As Button";
_bhome = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private menu,downloadButton As Button";
_menu = new anywheresoftware.b4j.objects.ButtonWrapper();
_downloadbutton = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private status As Label";
_status = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private startPage As String = \"https://www.google";
_startpage = "https://www.google.com";
 //BA.debugLineNum = 22;BA.debugLine="Private sulo As String=\"https://www.sulomedia.de\"";
_sulo = "https://www.sulomedia.de";
 //BA.debugLineNum = 23;BA.debugLine="Private lis As List";
_lis = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 24;BA.debugLine="Private we,temp,doc As JavaObject";
_we = new anywheresoftware.b4j.object.JavaObject();
_temp = new anywheresoftware.b4j.object.JavaObject();
_doc = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 25;BA.debugLine="Private database As KeyValueStore";
_database = new lazaruz.win.keyvaluestore();
 //BA.debugLineNum = 26;BA.debugLine="Private httpC As HttpClient";
_httpc = new anywheresoftware.b4a.http.HttpClientWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private net As OkHttpClient";
_net = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private netreq As OkHttpRequest";
_netreq = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
 //BA.debugLineNum = 29;BA.debugLine="Private menulist,list1 As ListView";
_menulist = new anywheresoftware.b4j.objects.ListViewWrapper();
_list1 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private sp1 As Pane";
_sp1 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Dim manager As JavaObject";
_manager = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 32;BA.debugLine="Dim handler As JavaObject";
_handler = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 33;BA.debugLine="Private js As jScriptEngine";
_js = new jScriptEngine.jScriptEngine();
 //BA.debugLineNum = 34;BA.debugLine="Private mousex As Int";
_mousex = 0;
 //BA.debugLineNum = 35;BA.debugLine="Private mousey As Int";
_mousey = 0;
 //BA.debugLineNum = 36;BA.debugLine="Private mc As MouseEvent";
_mc = new anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private ml As Button";
_ml = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private cancel As Button";
_cancel = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private reload As Button";
_reload = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private dlloc As String";
_dlloc = "";
 //BA.debugLineNum = 44;BA.debugLine="Private dlinfo As Msgboxes";
_dlinfo = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 45;BA.debugLine="Private filo As FileChooser";
_filo = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private hlink As HyperlinkLabel";
_hlink = new anywheresoftware.b4j.objects.HyperlinkLabelWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Dim pbd As ProgressBar";
_pbd = new anywheresoftware.b4j.objects.ProgressIndicatorWrapper.ProgressBarWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private dp As Pane";
_dp = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Dim dlab,sl As Label";
_dlab = new anywheresoftware.b4j.objects.LabelWrapper();
_sl = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private setP As Pane";
_setp = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private Settings As Pane";
_settings = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private os,hb As Button";
_os = new anywheresoftware.b4j.objects.ButtonWrapper();
_hb = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public static String  _reload_action() throws Exception{
String _rl = "";
 //BA.debugLineNum = 405;BA.debugLine="Sub reload_Action";
 //BA.debugLineNum = 406;BA.debugLine="Dim rl As String";
_rl = "";
 //BA.debugLineNum = 407;BA.debugLine="rl=database.GetSimple(\"l\")";
_rl = _database._getsimple("l");
 //BA.debugLineNum = 408;BA.debugLine="we.RunMethod(\"load\",Array As Object(rl))";
_we.RunMethod("load",new Object[]{(Object)(_rl)});
 //BA.debugLineNum = 409;BA.debugLine="status.Text=\"zurück.. \"&rl";
_status.setText("zurück.. "+_rl);
 //BA.debugLineNum = 410;BA.debugLine="pb2.SetAlphaAnimated(100,1)";
_pb2.SetAlphaAnimated((int) (100),1);
 //BA.debugLineNum = 411;BA.debugLine="pb2.Visible=True";
_pb2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return "";
}
public static String  _settings_set() throws Exception{
String _dt = "";
 //BA.debugLineNum = 492;BA.debugLine="Sub settings_set";
 //BA.debugLineNum = 493;BA.debugLine="If setP.Visible=False Then";
if (_setp.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 494;BA.debugLine="setP.SetAlphaAnimated(450,0.8)";
_setp.SetAlphaAnimated((int) (450),0.8);
 //BA.debugLineNum = 495;BA.debugLine="setP.Visible=True";
_setp.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 496;BA.debugLine="os.Visible=True";
_os.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 498;BA.debugLine="sl.TextSize=15";
_sl.setTextSize(15);
 //BA.debugLineNum = 499;BA.debugLine="sl.TooltipText=\"Set your Startpage\"";
_sl.setTooltipText("Set your Startpage");
 //BA.debugLineNum = 500;BA.debugLine="ed1.TooltipText=\"Set your Startpage\"";
_ed1.setTooltipText("Set your Startpage");
 //BA.debugLineNum = 501;BA.debugLine="sl.Text=\"Startpage Settings:\"";
_sl.setText("Startpage Settings:");
 //BA.debugLineNum = 502;BA.debugLine="sl.TextColor=fx.Colors.ARGB(200,131,125,131)";
_sl.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.ARGB((int) (200),(int) (131),(int) (125),(int) (131))));
 //BA.debugLineNum = 503;BA.debugLine="ed1.Text=database.getSimple(\"o\")";
_ed1.setText(_database._getsimple("o"));
 //BA.debugLineNum = 504;BA.debugLine="Dim dt As String = database.GetSimple(\"us\")";
_dt = _database._getsimple("us");
 //BA.debugLineNum = 505;BA.debugLine="list1.Items.Add(dt)";
_list1.getItems().Add((Object)(_dt));
 //BA.debugLineNum = 506;BA.debugLine="End Sub";
return "";
}
public static String  _sp1_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub sp1_FocusChanged (HasFocus As Boolean)";
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public static String  _tf1_action() throws Exception{
String _rrs = "";
 //BA.debugLineNum = 259;BA.debugLine="Sub tf1_Action";
 //BA.debugLineNum = 260;BA.debugLine="Dim rrs As String";
_rrs = "";
 //BA.debugLineNum = 262;BA.debugLine="rrs=database.GetSimple(\"o\")";
_rrs = _database._getsimple("o");
 //BA.debugLineNum = 263;BA.debugLine="status.Text=\" \"&rrs&\" wird geladen..\"";
_status.setText(" "+_rrs+" wird geladen..");
 //BA.debugLineNum = 264;BA.debugLine="netreq.InitializeGet(rrs)";
_netreq.InitializeGet(_rrs);
 //BA.debugLineNum = 265;BA.debugLine="httpC.SetHttpParameter(\"User-Agent\", \"Mozilla/5.0";
_httpc.SetHttpParameter("User-Agent",(Object)("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:27.0) Gecko/20100101 Firefox/27.0"));
 //BA.debugLineNum = 266;BA.debugLine="net.Execute(netreq,1)";
_net.Execute(ba,_netreq,(int) (1));
 //BA.debugLineNum = 267;BA.debugLine="tf1.Text=rrs";
_tf1.setText(_rrs);
 //BA.debugLineNum = 268;BA.debugLine="web.RequestFocus";
_web.RequestFocus();
 //BA.debugLineNum = 269;BA.debugLine="we.RunMethod(\"load\",Array As Object(rrs))";
_we.RunMethod("load",new Object[]{(Object)(_rrs)});
 //BA.debugLineNum = 271;BA.debugLine="pb2.Visible=True";
_pb2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 272;BA.debugLine="pb2.SetAlphaAnimated(400,1)";
_pb2.SetAlphaAnimated((int) (400),1);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return "";
}
public static String  _tf1_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub tf1_MouseClicked (EventData As MouseEvent)";
 //BA.debugLineNum = 302;BA.debugLine="If sp1.Visible=False Then";
if (_sp1.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 }else {
 //BA.debugLineNum = 305;BA.debugLine="sp1.SetAlphaAnimated(300,0)";
_sp1.SetAlphaAnimated((int) (300),0);
 //BA.debugLineNum = 306;BA.debugLine="sp1.Visible=False";
_sp1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return "";
}
public static String  _tf1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub tf1_TextChanged (Old As String, New As String)";
 //BA.debugLineNum = 276;BA.debugLine="If  New.Contains(\"//\") Then";
if (_new.contains("//")) { 
 //BA.debugLineNum = 277;BA.debugLine="If database.ContainsKey(\"o\") Then";
if (_database._containskey("o")) { 
 //BA.debugLineNum = 278;BA.debugLine="database.Remove(\"o\")";
_database._remove("o");
 //BA.debugLineNum = 279;BA.debugLine="database.PutSimple(\"o\",New)";
_database._putsimple("o",(Object)(_new));
 };
 }else {
 //BA.debugLineNum = 282;BA.debugLine="database.PutSimple(\"o\",\"https://\"&New)";
_database._putsimple("o",(Object)("https://"+_new));
 };
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public static String  _web_locationchanged(String _location) throws Exception{
String _loc = "";
String _rep = "";
String _locn = "";
 //BA.debugLineNum = 186;BA.debugLine="Sub web_LocationChanged (Location As String)";
 //BA.debugLineNum = 187;BA.debugLine="Dim loc,rep,locn As String";
_loc = "";
_rep = "";
_locn = "";
 //BA.debugLineNum = 188;BA.debugLine="dlloc = Location			' save location in case we wan";
_dlloc = _location;
 //BA.debugLineNum = 189;BA.debugLine="loc = Location.SubString(Location.LastIndexOf(\".\"";
_loc = _location.substring((int) (_location.lastIndexOf(".")+1));
 //BA.debugLineNum = 190;BA.debugLine="locn = Location.SubString(Location.LastIndexOf(\"/";
_locn = _location.substring((int) (_location.lastIndexOf("/")+1));
 //BA.debugLineNum = 191;BA.debugLine="database.PutSimple(\"lo\",locn)";
_database._putsimple("lo",(Object)(_locn));
 //BA.debugLineNum = 192;BA.debugLine="Log(locn)";
anywheresoftware.b4a.keywords.Common.Log(_locn);
 //BA.debugLineNum = 193;BA.debugLine="If Location.Contains(\"http\") Then";
if (_location.contains("http")) { 
 //BA.debugLineNum = 194;BA.debugLine="Select loc";
switch (BA.switchObjectToInt(_loc,"txt","pdf","doc","exe","zip","rar")) {
case 0: {
 //BA.debugLineNum = 196;BA.debugLine="rep = \"Text File\"";
_rep = "Text File";
 break; }
case 1: {
 //BA.debugLineNum = 198;BA.debugLine="rep = \"PDF File\"";
_rep = "PDF File";
 break; }
case 2: {
 //BA.debugLineNum = 200;BA.debugLine="rep = \"Document file\"";
_rep = "Document file";
 break; }
case 3: {
 //BA.debugLineNum = 202;BA.debugLine="rep = \"Windows Application\"";
_rep = "Windows Application";
 break; }
case 4: {
 //BA.debugLineNum = 204;BA.debugLine="rep = \"Zip Packed Files\"";
_rep = "Zip Packed Files";
 break; }
case 5: {
 //BA.debugLineNum = 206;BA.debugLine="rep = \"RAR Packed Files\"";
_rep = "RAR Packed Files";
 break; }
default: {
 //BA.debugLineNum = 208;BA.debugLine="rep = \"Unknown\"";
_rep = "Unknown";
 break; }
}
;
 //BA.debugLineNum = 210;BA.debugLine="If rep <> \"Unknown\" Then           ' file type w";
if ((_rep).equals("Unknown") == false) { 
 //BA.debugLineNum = 211;BA.debugLine="MainForm.Title = Location";
_mainform.setTitle(_location);
 //BA.debugLineNum = 213;BA.debugLine="downloadButton_start";
_downloadbutton_start();
 }else {
 };
 };
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public static String  _web_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _ed) throws Exception{
String _li = "";
 //BA.debugLineNum = 310;BA.debugLine="Sub web_MouseClicked (ed As MouseEvent)";
 //BA.debugLineNum = 311;BA.debugLine="mousex = ed.X    ' get the link that was clicked";
_mousex = (int) (_ed.getX());
 //BA.debugLineNum = 312;BA.debugLine="mousey = ed.Y";
_mousey = (int) (_ed.getY());
 //BA.debugLineNum = 313;BA.debugLine="lis.Clear";
_lis.Clear();
 //BA.debugLineNum = 314;BA.debugLine="js.evalString(\"var element = doc.elementFromPoint";
_js.evalString("var element = doc.elementFromPoint("+BA.NumberToString(_mousex)+","+BA.NumberToString(_mousey)+");");
 //BA.debugLineNum = 315;BA.debugLine="Log(js.engineGet(\"element\"))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_js.engineGet("element")));
 //BA.debugLineNum = 316;BA.debugLine="lis.Add(js.engineGet(\"element\"))";
_lis.Add(_js.engineGet("element"));
 //BA.debugLineNum = 317;BA.debugLine="For Each li As String In lis";
{
final anywheresoftware.b4a.BA.IterableList group7 = _lis;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_li = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 318;BA.debugLine="If li.Contains(\"http\") Then      ' lis can conta";
if (_li.contains("http")) { 
 //BA.debugLineNum = 319;BA.debugLine="tf1.Text=li";
_tf1.setText(_li);
 //BA.debugLineNum = 320;BA.debugLine="database.PutSimple(\"o\",li)";
_database._putsimple("o",(Object)(_li));
 };
 }
};
 //BA.debugLineNum = 325;BA.debugLine="If sp1.Visible=False Then";
if (_sp1.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 }else {
 //BA.debugLineNum = 328;BA.debugLine="sp1.SetAlphaAnimated(400,0)";
_sp1.SetAlphaAnimated((int) (400),0);
 //BA.debugLineNum = 329;BA.debugLine="sp1.Visible=False";
_sp1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return "";
}
public static String  _web_pagefinished(String _url) throws Exception{
String _li = "";
 //BA.debugLineNum = 221;BA.debugLine="Sub web_PageFinished (Url As String)";
 //BA.debugLineNum = 222;BA.debugLine="pb2.SetAlphaAnimated(400,0)";
_pb2.SetAlphaAnimated((int) (400),0);
 //BA.debugLineNum = 223;BA.debugLine="pb2.Visible=False";
_pb2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 224;BA.debugLine="status.Text=\"100%\"";
_status.setText("100%");
 //BA.debugLineNum = 225;BA.debugLine="js.enginePut(\"doc\",we.RunMethod(\"getDocument\",Nul";
_js.enginePut("doc",_we.RunMethod("getDocument",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 226;BA.debugLine="lis.Clear";
_lis.Clear();
 //BA.debugLineNum = 227;BA.debugLine="js.enginePut(\"list\",lis) ' pass lis to js";
_js.enginePut("list",(Object)(_lis.getObject()));
 //BA.debugLineNum = 228;BA.debugLine="js.evalString(\"var linkindoc = doc.links;for (var";
_js.evalString("var linkindoc = doc.links;for (var x = 0;x < linkindoc.length;x++){ list.add(linkindoc.item(x));}");
 //BA.debugLineNum = 230;BA.debugLine="For Each li As String In lis";
{
final anywheresoftware.b4a.BA.IterableList group8 = _lis;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_li = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 231;BA.debugLine="If li.Contains(\"http\") Then      ' lis can conta";
if (_li.contains("http")) { 
 //BA.debugLineNum = 232;BA.debugLine="lis.Add(li)";
_lis.Add((Object)(_li));
 };
 //BA.debugLineNum = 234;BA.debugLine="If li.Contains(\"https\") Then      ' lis can cont";
if (_li.contains("https")) { 
 //BA.debugLineNum = 235;BA.debugLine="lis.Add(li)";
_lis.Add((Object)(_li));
 };
 }
};
 //BA.debugLineNum = 238;BA.debugLine="If database.ContainsKey(\"l\") Then";
if (_database._containskey("l")) { 
 //BA.debugLineNum = 239;BA.debugLine="database.Remove(\"l\")";
_database._remove("l");
 //BA.debugLineNum = 240;BA.debugLine="database.PutSimple(\"l\",Url)";
_database._putsimple("l",(Object)(_url));
 }else {
 //BA.debugLineNum = 242;BA.debugLine="database.PutSimple(\"l\",Url)";
_database._putsimple("l",(Object)(_url));
 };
 //BA.debugLineNum = 244;BA.debugLine="web.RequestFocus";
_web.RequestFocus();
 //BA.debugLineNum = 245;BA.debugLine="MainForm.Title=Url";
_mainform.setTitle(_url);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
}
