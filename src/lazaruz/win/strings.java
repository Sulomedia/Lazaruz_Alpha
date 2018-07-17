package lazaruz.win;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class strings extends Object{
public static strings mostCurrent = new strings();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("lazaruz.win", "lazaruz.win.strings", null);
		ba.loadHtSubs(strings.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "lazaruz.win.strings", ba);
		}
	}
    public static Class<?> getObject() {
		return strings.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static String _info = "";
public static String _v = "";
public static String _name = "";
public static lazaruz.win.main _main = null;
public static lazaruz.win.httputils2service _httputils2service = null;
public static lazaruz.win.downloadservice _downloadservice = null;
public static String  _info_get(String _i) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub info_get(i As String)";
 //BA.debugLineNum = 11;BA.debugLine="i=info";
_i = _info;
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public static String  _name_get(String _n) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub name_get (n As String)";
 //BA.debugLineNum = 20;BA.debugLine="n=\"Lazarus\"";
_n = "Lazarus";
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Dim info As String";
_info = "";
 //BA.debugLineNum = 5;BA.debugLine="Dim v As String";
_v = "";
 //BA.debugLineNum = 6;BA.debugLine="Dim name As String";
_name = "";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _version_get(String _ve) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub version_get( ve As String)";
 //BA.debugLineNum = 15;BA.debugLine="ve=\"0.1.2\"";
_ve = "0.1.2";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
}
