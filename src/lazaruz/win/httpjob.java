package lazaruz.win;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class httpjob extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("lazaruz.win", "lazaruz.win.httpjob", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", lazaruz.win.httpjob.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _jobname = "";
public boolean _success = false;
public String _username = "";
public String _password = "";
public String _errormessage = "";
public Object _target = null;
public String _taskid = "";
public anywheresoftware.b4a.http.HttpClientWrapper.HttpUriRequestWrapper _req = null;
public Object _tag = null;
public lazaruz.win.main _main = null;
public lazaruz.win.strings _strings = null;
public lazaruz.win.httputils2service _httputils2service = null;
public lazaruz.win.downloadservice _downloadservice = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public JobName As String";
_jobname = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Success As Boolean";
_success = false;
 //BA.debugLineNum = 6;BA.debugLine="Public Username, Password As String";
_username = "";
_password = "";
 //BA.debugLineNum = 7;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
 //BA.debugLineNum = 8;BA.debugLine="Private target As Object";
_target = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private taskId As String";
_taskid = "";
 //BA.debugLineNum = 10;BA.debugLine="Private req As HttpRequest";
_req = new anywheresoftware.b4a.http.HttpClientWrapper.HttpUriRequestWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _complete(int _id) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Public Sub Complete (id As Int)";
 //BA.debugLineNum = 89;BA.debugLine="taskId = id";
_taskid = BA.NumberToString(_id);
 //BA.debugLineNum = 90;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
__c.CallSubDelayed2(ba,_target,"JobDone",this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _download(String _link) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Public Sub Download(Link As String)";
 //BA.debugLineNum = 59;BA.debugLine="req.InitializeGet(Link)";
_req.InitializeGet(_link);
 //BA.debugLineNum = 60;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _download2(String _link,String[] _parameters) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
int _i = 0;
 //BA.debugLineNum = 67;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
 //BA.debugLineNum = 68;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 69;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 70;BA.debugLine="sb.Append(Link)";
_sb.Append(_link);
 //BA.debugLineNum = 71;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.length>0) { 
_sb.Append("?");};
 //BA.debugLineNum = 72;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 73;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
final int step6 = (int) (2);
final int limit6 = (int) (_parameters.length-1);
_i = (int) (0) ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
 //BA.debugLineNum = 74;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
_sb.Append("&");};
 //BA.debugLineNum = 75;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
_sb.Append(_su.EncodeUrl(_parameters[_i],"UTF8")).Append("=");
 //BA.debugLineNum = 76;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
_sb.Append(_su.EncodeUrl(_parameters[(int) (_i+1)],"UTF8"));
 }
};
 //BA.debugLineNum = 78;BA.debugLine="req.InitializeGet(sb.ToString)";
_req.InitializeGet(_sb.ToString());
 //BA.debugLineNum = 79;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream() throws Exception{
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
 //BA.debugLineNum = 114;BA.debugLine="Public Sub GetInputStream As InputStream";
 //BA.debugLineNum = 115;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 116;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
_in = __c.File.OpenInput(_httputils2service._tempfolder,_taskid);
 //BA.debugLineNum = 117;BA.debugLine="Return In";
if (true) return _in;
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.http.HttpClientWrapper.HttpUriRequestWrapper  _getrequest() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub GetRequest As HttpRequest";
 //BA.debugLineNum = 84;BA.debugLine="Return req";
if (true) return _req;
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public String  _getstring() throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub GetString As String";
 //BA.debugLineNum = 100;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return _getstring2("UTF8");
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _getstring2(String _encoding) throws Exception{
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _res = "";
 //BA.debugLineNum = 104;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
 //BA.debugLineNum = 105;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
 //BA.debugLineNum = 106;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
_tr.Initialize2((java.io.InputStream)(__c.File.OpenInput(_httputils2service._tempfolder,_taskid).getObject()),_encoding);
 //BA.debugLineNum = 107;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 108;BA.debugLine="res = tr.ReadAll";
_res = _tr.ReadAll();
 //BA.debugLineNum = 109;BA.debugLine="tr.Close";
_tr.Close();
 //BA.debugLineNum = 110;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _name,Object _targetmodule) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
 //BA.debugLineNum = 18;BA.debugLine="HttpUtils2Service.Initialize";
_httputils2service._initialize();
 //BA.debugLineNum = 19;BA.debugLine="JobName = Name";
_jobname = _name;
 //BA.debugLineNum = 20;BA.debugLine="target = TargetModule";
_target = _targetmodule;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _postbytes(String _link,byte[] _data) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
 //BA.debugLineNum = 29;BA.debugLine="req.InitializePost2(Link, Data)";
_req.InitializePost2(_link,_data);
 //BA.debugLineNum = 30;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _postfile(String _link,String _dir,String _filename) throws Exception{
int _length = 0;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 35;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
 //BA.debugLineNum = 36;BA.debugLine="Dim length As Int";
_length = 0;
 //BA.debugLineNum = 37;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
 //BA.debugLineNum = 38;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
__c.Log("Cannot send files from the assets folder.");
 //BA.debugLineNum = 39;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 41;BA.debugLine="length = File.Size(Dir, FileName)";
_length = (int) (__c.File.Size(_dir,_filename));
 //BA.debugLineNum = 42;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 43;BA.debugLine="In = File.OpenInput(Dir, FileName)";
_in = __c.File.OpenInput(_dir,_filename);
 //BA.debugLineNum = 44;BA.debugLine="If length < 1000000 Then '1mb";
if (_length<1000000) { 
 //BA.debugLineNum = 47;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 48;BA.debugLine="out.InitializeToBytesArray(length)";
_out.InitializeToBytesArray(_length);
 //BA.debugLineNum = 49;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 50;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
_postbytes(_link,_out.ToBytesArray());
 }else {
 //BA.debugLineNum = 52;BA.debugLine="req.InitializePost(Link, In, length)";
_req.InitializePost(_link,(java.io.InputStream)(_in.getObject()),_length);
 //BA.debugLineNum = 53;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 };
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _poststring(String _link,String _text) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
 //BA.debugLineNum = 24;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
_postbytes(_link,_text.getBytes("UTF8"));
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _release() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub Release";
 //BA.debugLineNum = 95;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
__c.File.Delete(_httputils2service._tempfolder,_taskid);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
